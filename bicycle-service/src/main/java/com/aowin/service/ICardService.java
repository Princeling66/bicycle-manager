package com.aowin.service;

import java.util.List;

import com.aowin.model.Card;
import com.aowin.model.CardAccount;
import com.aowin.model.CardMoney;
import com.aowin.model.CardRecord;
import com.aowin.model.SingleCard;
import com.aowin.model.Time;
import com.aowin.model.YearCard;
import com.github.pagehelper.PageInfo;

public interface ICardService {
/**
 * 查询所有卡号信息显示卡号界面
 * @return
 * @throws Exception
 */

 public PageInfo<Card> select(int pageNum, Card card) throws Exception;
	
 /**
	 * 新增卡片
	 * @param card
	 */
	public void insert(Card card, int userId)throws Exception;
	/**
	 * 修改卡片
	 * @param card
	 */
	public void update(Card card)throws Exception;
	public Card showUpd(String cardCode)throws Exception;
	/**
	 * 注销卡片
	 * @param cardCode
	 * @return
	 * @throws Exception
	 */
	void del(String cardCode, CardRecord record,int userId) throws Exception;
	void repCard(Card card, int userId) throws Exception;
	/**
	 * 充值卡片
	 * @param ca
	 * @throws Exception
	 */
	public void recCard(CardAccount ca,int cardId,int userId)throws Exception;
	
	/**
	 * 显示卡费用流水
	 * @param cardId
	 * @return
	 * @throws Exception
	 */
	public List<CardRecord> showCardRecode(int cardId)throws Exception;
	/**
	 * 统计所有卡
	 * @return
	 * @throws Exception
	 */
	public CardMoney staCard()throws Exception;
	/**
	 * 统计单张卡信息
	 * @param cardId
	 * @return
	 */
	public SingleCard singleCard(int cardId)throws Exception;
	/**
	 * 统计月度/年度卡信息
	 * @param tm
	 * @return
	 */
	public YearCard getYearCard(Time tm);
	/**
	 * 统计月度/年度单张卡信息
	 * @param tm
	 * @return
	 */
	public YearCard getYearSingleCard(Time tm);
}
