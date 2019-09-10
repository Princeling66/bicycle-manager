package com.aowin.service;

import com.aowin.model.BicycleStation;
import com.github.pagehelper.PageInfo;

public interface IBicycleStationService {
	/**
	 * 查询车点  - 管理平台
	 * @param station
	 * @return
	 */
	PageInfo<BicycleStation> select(int pageNum, BicycleStation station)throws Exception;
	/**
	 * 查询车点详情 
	 * @param stationId
	 * @return
	 */
	BicycleStation showPile(int stationId)throws Exception;

	

}
