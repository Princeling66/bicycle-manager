package com.aowin.dao;


import com.aowin.model.BicycleDeal;

public interface BicycleDealMapper {
	/**
	 * 新增业务流水信息
	 * @param deal
	 * @return
	 */
	public int insert(BicycleDeal deal)throws Exception;

	
	
}
