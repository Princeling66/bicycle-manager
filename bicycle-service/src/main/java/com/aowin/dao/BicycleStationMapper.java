package com.aowin.dao;

import java.util.List;
import java.util.Map;

import com.aowin.model.BicycleStation;

public interface BicycleStationMapper {
	/**
	 * 查询车点
	 * @param bicycleStation
	 * @return
	 */
	public List<BicycleStation> select(BicycleStation bicycleStation)throws Exception;
	/**
	 * 查询车点详情
	 * @param stationId
	 * @return
	 */
	public BicycleStation detailForUpdate(int stationId)throws Exception;
	
	
	
	

}
