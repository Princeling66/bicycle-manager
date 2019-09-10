package com.aowin.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aowin.constants.CardInfoType;
import com.aowin.constants.CardType;
import com.aowin.constants.PageConfig;
import com.aowin.dao.CardInfoRecordMapper;
import com.aowin.dao.CardMapper;
import com.aowin.dao.CardMoneyMapper;
import com.aowin.dao.CardRecordMapper;
import com.aowin.dao.SingleCardMapper;
import com.aowin.exception.ServiceException;
import com.aowin.model.Card;
import com.aowin.model.CardAccount;
import com.aowin.model.CardInfoRecord;
import com.aowin.model.CardMoney;
import com.aowin.model.CardRecord;
import com.aowin.model.MsPhase;
import com.aowin.model.SingleCard;
import com.aowin.model.Time;
import com.aowin.model.YearCard;
import com.aowin.service.ICardService;
import com.aowin.util.DateUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class CardServiceImpl implements ICardService{
	
	@Autowired
	private CardMapper cardMapper;
	@Autowired
	private CardInfoRecordMapper cardInfoRecordMapper;
	@Autowired
	private CardRecordMapper cardRecordMapper;
	@Autowired//统计卡
	private CardMoneyMapper cardMoneyMapper;
	@Autowired//单张卡
	private SingleCardMapper singleCardMapper;
	/**
	 * 分页查询
	 * @param pageNum
	 * @param card
	 * @return
	 * @throws Exception
	 */
	@Override
	public PageInfo<Card> select(int pageNum, Card card) throws Exception {
		PageHelper.startPage(pageNum, PageConfig.PAGE_SIZE);
		List<Card> cardList=cardMapper.getCard(card);
		return new  PageInfo<Card>(cardList);
	}
	/**
	 * 新增卡片
	 */
	@Override
	@Transactional
	public void insert(Card card,int userId) {
		if(card.getCardType() != CardType.CARD_SB) {
			card.setCardCode(cardMapper.generateCardCode()+1);//根据数据库卡号的最大值生成卡号
		}else {
			//3、市民卡/社保卡 这种卡片的身份证号码即是卡号
			card.setCardCode(card.getIdcard());
		}
		card.setStatus(1);
		card.setZxbj("0");
		try {
			//1.新增卡
			cardMapper.insert(card);
			//2.新增卡记录信息
			CardInfoRecord record = new CardInfoRecord();
			record.setCardId(card.getCardId());
			record.setCreateTime(DateUtil.currentTime());
			record.setInfoType(CardInfoType.ADD);
			record.setUserId(userId);
			cardInfoRecordMapper.insert(record);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
/**
 * 修改卡片
 * @throws Exception 
 */
	@Override
	public void update(Card card) throws Exception {
		int n=cardMapper.update(card);
		if(n == 0) throw new ServiceException("修改卡片失败");
	}
@Override
public Card showUpd(String cardCode){
	return cardMapper.selectByCardCode(cardCode);
}
/**
 * 注销卡片
 */
@Override
@Transactional
public void del(String cardCode,CardRecord record,int userId) throws Exception {
	Card card=cardMapper.selectByCardCode(cardCode);
	if(card.getMonthlyMoney()!=0||card.getFrozenMoney()!=0||card.getWalletMoney()!=0) {
//		在卡费用流水表中记录相关信息
		record.setCardId(card.getCardId());
		record.setFeeType(5);
		record.setChgMonthlyMoney(card.getMonthlyMoney());
		record.setChgFrozenMoney(card.getFrozenMoney());
		record.setChgWalletMoney(card.getWalletMoney());
		record.setUserId(userId);
		record.setCreateTime(DateUtil.currentTime());
		record.setRemark("注销清空");
		record.setZxbj("1");
		cardRecordMapper.insert(record);
	}
	//2.新增卡记录信息
	CardInfoRecord infoRecord = new CardInfoRecord();
	infoRecord.setCardId(card.getCardId());
	infoRecord.setCreateTime(DateUtil.currentTime());
	infoRecord.setInfoType(CardInfoType.ZX);
	infoRecord.setUserId(userId);
	cardInfoRecordMapper.insert(infoRecord);
	//将账户金额清空
	int n=cardMapper.updMoney(cardCode);
	if(n == 0) throw new ServiceException("清空账户金额失败");
	//注销标志改为1
	int n1=cardMapper.del(cardCode);
	if(n1 == 0) throw new ServiceException("修改注销标志失败");

}
/**
 * 挂失卡
 * @param card
 * @param userId
 * @throws Exception
 */
@Override
@Transactional
public void repCard(Card card,int userId)throws Exception {
	//修改卡的状态为2锁定状态
	int n =cardMapper.repCard(card.getCardCode());
	if(n == 0) throw new ServiceException("修改卡的状态失败");
	//2.新增卡挂失记录信息
	CardInfoRecord infoRecord = new CardInfoRecord();
	infoRecord.setCardId(card.getCardId());
	infoRecord.setCreateTime(DateUtil.currentTime());
	infoRecord.setInfoType(CardInfoType.GS);
	infoRecord.setUserId(userId);
	cardInfoRecordMapper.insert(infoRecord);
	
}
/**
 * 充值卡片
 */
@Override
@Transactional
public void recCard(CardAccount ca,int cardId,int userId) throws Exception {
//将充值信息填入卡费用表，更新充值的月票金额或者钱包金额
	ca.setCardId(cardId);
	int n=cardMapper.updateMoney(ca);
	if(n == 0) throw new ServiceException("更新充值的月票金额或者钱包金额失败");
	//	卡费用流水填写，将本次充值流水信息写入到卡费用流水中，费用类型为（1：充值）
	CardRecord record = new CardRecord();
	record.setCardId(ca.getCardId());
	record.setFeeType(1);
	record.setChgMonthlyMoney(ca.getMonthlyMoney());
	record.setChgFrozenMoney(ca.getFrozenMoney());
	record.setChgWalletMoney(ca.getWalletMoney());
	record.setUserId(userId);
	record.setCreateTime(DateUtil.currentTime());
	record.setRemark("充值");
	record.setZxbj("0");
	cardRecordMapper.insert(record);
	
	
}
/**
 * 显示卡费用流水
 * @param cardId
 * @return
 * @throws Exception
 */
public List<CardRecord>showCardRecode(int cardId)throws Exception{
	return cardRecordMapper.select(cardId);
}
/**
 * 统计所有卡的信息
 */
public CardMoney staCard()throws Exception {
	CardMoney cm=new CardMoney();
	cm.setRentCard(cardMoneyMapper.selectRentCard());
	int rentRecord=cardMoneyMapper.selectRentRecord();//有租车记录的卡张数
	cm.setRentRecord(cardMoneyMapper.selectRentRecord());
	List<CardRecord> CardRecord=cardRecordMapper.selectMoney();
	System.out.println(CardRecord);
	for(CardRecord cr:CardRecord) {
		if(cr.getFeeType()==1) {
			cm.setTotalRecharge(cr.getTotal());
		}else if(cr.getFeeType()==3){
			cm.setTotalConsume(cr.getTotal());
		}else if(cr.getFeeType()==5){
			cm.setLockMoney(cr.getTotal());
		}
	}
	cm.setOverage(cardMoneyMapper.selMoney());
	cm.setRentHour(cardMoneyMapper.selectRentHour());
	int rentTotal=cardMoneyMapper.selRent();
	int rentAvg = rentTotal/rentRecord;
	cm.setRentTotal(rentTotal);
	cm.setRentAvg(rentAvg);//平均租车次数
	return cm;
	
}

/**
 * 统计单张卡的信息
 */
public SingleCard singleCard(int cardId)throws Exception{
	SingleCard sc = new SingleCard();
	List<CardRecord> CardRecord=cardRecordMapper.selectSingle(cardId);
	for(CardRecord cr:CardRecord) {
		if(cr.getFeeType()==1) {
			sc.setTotalRecharge(cr.getTotal());//总充值金额
		}else if(cr.getFeeType()==3) {
			sc.setTotalConsume(cr.getTotal());//总消费金额
		}else if(cr.getFeeType()==5) {
			sc.setLockMoney(cr.getTotal());//现冻结金额
		}
	}
	sc.setOverage(singleCardMapper.selOverage(cardId));//现可用余额
	sc.setRentHour(singleCardMapper.selRentTime(cardId).getRentHour());//总租车小时数
	sc.setRentAverage(singleCardMapper.selRentTime(cardId).getRentAverage());//单次租车时间
	sc.setRentTotal(singleCardMapper.selRentTotal(cardId));//总租车次数
	return sc;
	
}

/**
 * 统计所有卡年/月度信息
 */
public YearCard getYearCard(Time tm) {
	//年度内所有的租车卡的总充值金额，总消费金额
	YearCard yc =new YearCard();
	List<CardRecord> crList=cardRecordMapper.getMoney(tm);
	for(CardRecord cr:crList) {
		if(cr.getFeeType()==1) {
			yc.setTotalRecharge(cr.getTotal());//总充值金额
		}else if(cr.getFeeType()==3) {
			yc.setTotalConsume(cr.getTotal());//总消费金额
		}
	}
	//总租车次数
	int rentTotal=cardMoneyMapper.getRent(tm);
	yc.setRentTotal(rentTotal);
	//总租车时间数
	SingleCard sc=cardMoneyMapper.getRentHour(tm);
	yc.setRentHour(sc.getRentHour());
	//平均租车时间数
	yc.setRentAverage(sc.getRentAverage());
	int rentRecord=cardMoneyMapper.getRentRecord(tm);//有租车记录的卡的张数
	//平均租车次数
	int rentAvg=rentTotal/rentRecord;
	yc.setRentAvg(rentAvg);
	return yc;
}
/**
 * 统计月度内，年度内单张租车卡
 * @param tm
 * @return
 */
public YearCard getYearSingleCard(Time tm) {
	//统计月度内，年度内，租车卡的充值金额，消费金额
		YearCard yc =new YearCard();
		List<CardRecord> crList=cardRecordMapper.getSingleMoney(tm);
		for(CardRecord cr:crList) {
			if(cr.getFeeType()==1) {
				yc.setTotalRecharge(cr.getTotal());//总充值金额
			}else if(cr.getFeeType()==3) {
				yc.setTotalConsume(cr.getTotal());//总消费金额
			}
		}
		//总租车次数
		int rentTotal=cardMoneyMapper.selSingleRent(tm);
		yc.setRentTotal(rentTotal);
		//总租车时间数
		SingleCard sc=cardMoneyMapper.selSingleRentTime(tm);
		yc.setRentHour(sc.getRentHour());
		//平均租车时间数
		yc.setRentAverage(sc.getRentAverage());
		return yc;
	
	
}
	}
	


	



