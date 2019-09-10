package com.aowin.dao;

import java.util.List;

import com.aowin.model.BicycleAccount;
import com.aowin.model.BicycleInfo;

public interface BicycleInfoMapper {
	/**
	 * 修改车辆状态
	 * @param int
	 * @return
	 */
	public int updateInfo(int bicycleId)throws Exception;
	/**
	 * 查询状态为普通调出的车辆
	 * @return
	 */
	public List<BicycleInfo> select();	
	
	/**
	 * 修改车辆状态
	 * 修改车辆所属车桩
	 * @param int
	 * @return
	 */
	public int toInfo(BicycleAccount ba)throws Exception;
}
