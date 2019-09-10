package com.aowin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aowin.dao.BicycleDealMapper;
import com.aowin.dao.BicycleDeployMapper;
import com.aowin.dao.BicycleInfoMapper;
import com.aowin.dao.BicyclePileMapper;
import com.aowin.dao.CardMapper;
import com.aowin.exception.ServiceException;
import com.aowin.model.BicycleAccount;
import com.aowin.model.BicycleDeal;
import com.aowin.model.BicycleDeploy;
import com.aowin.model.BicycleInfo;
import com.aowin.model.Card;
import com.aowin.service.IBicycleDispatchService;
import com.aowin.util.DateUtil;
@Service
public class BicycleDispatchServiceImpl implements IBicycleDispatchService{
	@Autowired//卡
	private CardMapper cardMapper;
	@Autowired//车辆
	private BicycleInfoMapper bicycleInfoMapper;
	@Autowired//车桩
	private BicyclePileMapper bicyclePileMapper;
	@Autowired//明细
	private BicycleDeployMapper bicycleDeployMapper;
	@Autowired//业务流水
	private BicycleDealMapper bicycleDealMapper;
	
	/**
	 * 车辆调出
	 */
	
	@Override
	@Transactional
	public void from(BicycleAccount ba) throws Exception {
		Card card=cardMapper.selectByCardCode(ba.getCardCode());
		if(card.getCardType()==4&&ba.getBicycleId()!=null&&ba.getPileId()!=null) {//判断卡类型是否为员工卡，如果是，就可以进行调出。否则不予调出
			//将被选中的车辆的车辆状态改成（4：普通调出）
			int n = bicycleInfoMapper.updateInfo(ba.getBicycleId());
			if(n == 0) throw new ServiceException("修改车辆状态失败");
			//将所在车桩的状态改成（2：无车）
			int n1=bicyclePileMapper.updatePile(ba.getPileId());
			if(n1 == 0) throw new ServiceException("修改车桩状态失败");
			//记录车辆调配明细，调入的内容可以不填写，调入原因填写（4：普通调出）
			BicycleDeploy deploy  = new BicycleDeploy();
			deploy.setBicycleId(ba.getBicycleId());
			deploy.setFromPileId(ba.getPileId());//调出车桩
			deploy.setFromCardId(card.getCardId());
			deploy.setFromTime(DateUtil.currentTime());	//调出时间
			deploy.setFromReason("普通调出");
			deploy.setStatus(4);
			bicycleDeployMapper.insert(deploy);
//记录车辆业务流水，业务类型为（4：普通调出），关联的业务记录id填写车辆调配明细id，
//业务名称填写(普通调出)，是否发生费用为（0：未发生），费用金额填0。
			BicycleDeal deal = new BicycleDeal();
			deal.setCreateTime(DateUtil.currentTime());
			deal.setDealName("普通调出");
			deal.setDealType(4);
			deal.setRecordId(deploy.getDeployId());
			deal.setCardId(card.getCardId());
			deal.setIsFee(0);
			deal.setChgMoney(0.0);
			deal.setBicycleId(ba.getBicycleId());
			deal.setPileId(ba.getPileId());
			bicycleDealMapper.insert(deal);
		}else {
			throw new ServiceException("不是员工卡不能操作");
		}
		
		
	}
/**
 * 查询状态为普通调出的车辆
 */
	@Override
	public List<BicycleInfo> select() throws Exception {
		return bicycleInfoMapper.select();
	}
	@Override
	@Transactional
	public void to(BicycleAccount ba)throws Exception{
		//选择的调入车桩是否为没有车
		int status=bicyclePileMapper.selectStatus(ba.getPileId());
		Card card=cardMapper.selectByCardCode(ba.getCardCode());
		if(status==2&&!ba.getCardCode().equals("")&&ba.getCardCode()!=null&&card.getCardType()==4) {
			//修改车桩状态为有车and增加车辆ID
			int n=bicyclePileMapper.toPile(ba);
			if(n == 0) throw new ServiceException("修改车桩状态失败");
			//修改车辆状态为（5：普通调入）
			int n1=bicycleInfoMapper.toInfo(ba);
			if(n1 == 0) throw new ServiceException("修改车辆状态失败");
			//查询该车辆的车辆调配明细，填写车辆调入信息。填写调入车桩，调入车点，调入日期，调入人，调入原因为（5：普通调入）
			BicycleDeploy deploy  = new BicycleDeploy();
			deploy.setBicycleId(ba.getBicycleId());
			deploy.setFromPileId(ba.getPileId());//调入车桩
			deploy.setFromCardId(card.getCardId());//调入人卡ID
			deploy.setFromTime(DateUtil.currentTime());	//调入时间
			deploy.setFromReason("普通调入");
			deploy.setStatus(5);
			bicycleDeployMapper.insert(deploy);
			//写车辆业务流水，业务类型为（5：普通调入）关联的业务记录id填写车辆调配明细记录id
			//，业务名称填写（普通调入）是否发生费用为（0：未发生）费用金额填写0
			BicycleDeal deal = new BicycleDeal();
			deal.setCreateTime(DateUtil.currentTime());//发生时间
			deal.setDealName("普通调入");
			deal.setDealType(5);
			deal.setRecordId(deploy.getDeployId());
			deal.setCardId(card.getCardId());
			deal.setIsFee(0);
			deal.setChgMoney(0.0);
			deal.setBicycleId(ba.getBicycleId());
			deal.setPileId(ba.getPileId());
			bicycleDealMapper.insert(deal);
		}else {
			throw new ServiceException("不是员工卡不能操作");
		}
}
}
