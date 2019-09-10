package com.aowin.dao;

import java.util.List;

import com.aowin.model.CardRecord;
import com.aowin.model.SingleCard;

public interface SingleCardMapper {
	/**
	 * 现可用余额
	 * @param cardId
	 * @return
	 */
	public Double selOverage(int cardId);
	/**
	 * 总租车小时数
	 * 平均租车小时
	 * @param cardId
	 * @return
	 */
	public SingleCard selRentTime(int cardId);
	/**
	 * 总租车次数
	 * @param cardId
	 * @return
	 */
	public int selRentTotal(int cardId);
	
}
