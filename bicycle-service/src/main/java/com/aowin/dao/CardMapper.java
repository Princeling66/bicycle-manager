package com.aowin.dao;


import java.util.List;

import com.aowin.model.Card;
import com.aowin.model.CardAccount;
import com.github.pagehelper.PageInfo;

public interface CardMapper {
/**
 * 显示卡片页面
 * @param card 
 * @return
 * @throws Exception
 */
	public List<Card> getCard(Card card)throws Exception;
	/**
	 * 新增卡
	 * @param card
	 * @throws Exceptions
	 */
	public int insert(Card card)throws Exception;
	/**
	 * 创建新的卡号 最大卡号+1
	 * @return
	 */
	public String generateCardCode();
	/**
	 * 修改卡
	 * @param card
	 * @return
	 * @throws Exception
	 */
	public int update(Card card)throws Exception;
	/**
	 * 根据卡code查询卡信息
	 * @param cardCode
	 * @return
	 */
	public Card selectByCardCode(String cardCode);
	/**
	 * 注销卡
	 * @param cardCode
	 * @return
	 */
	public int del(String cardCode)throws Exception;
	public int updMoney(String cardCode)throws Exception;//清空账户金额
	/**
	 * 挂失卡
	 * @param cardCode
	 * @return
	 * @throws Exception
	 */
	public int repCard(String cardCode)throws Exception;
	/**
	 * 充值卡
	 * @param mMoney
	 * @param wMoney
	 * @param cardId
	 * @return
	 */
	public int updateMoney(CardAccount ca)throws Exception;
	/**
	 * 根据卡号查询卡类型
	 * @param cardCode
	 * @return
	 * @throws Exception
	 */
	public int getCardType(String cardCode)throws Exception;
	
	
}
