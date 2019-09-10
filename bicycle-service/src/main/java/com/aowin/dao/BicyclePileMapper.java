package com.aowin.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.aowin.model.BicycleAccount;
import com.aowin.model.BicyclePile;

public interface BicyclePileMapper {
	/**
	 * 修改车桩信息
	 * @return
	 */
	public int updatePile(int pileId)throws Exception ;
	

	/**
	 * 根据车点id查询车桩详情
	 * @param stationId
	 * @return
	 */
	public List<BicyclePile> selectByStationId(int stationId);
	/**
	 * 查询车桩的状态（有车/无车）
	 * @param pileId
	 * @return
	 */
	public int selectStatus(int pileId);
	/**
	 * 修改车桩状态为有车
	 * 添加车辆ID
	 * @param pileId
	 * @return
	 */
	public int toPile(BicycleAccount ba)throws Exception;
	
}
