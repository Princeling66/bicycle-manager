package com.aowin.dao;

import com.aowin.model.CardInfoRecord;

public interface CardInfoRecordMapper {
	/**
	 * 新增卡记录流水
	 * @param record
	 * @return
	 * @throws Exception
	 */
	public int insert(CardInfoRecord record)throws Exception;

}
