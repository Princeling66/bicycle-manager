package com.aowin.dao;

import com.aowin.model.BicycleDeploy;

public interface BicycleDeployMapper {
	/**
	 * 新增一条调配明细记录
	 * @param deploy
	 * @return
	 */
	public int insert(BicycleDeploy deploy)throws Exception;

}
