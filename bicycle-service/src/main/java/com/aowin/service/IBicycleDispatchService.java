package com.aowin.service;

import java.util.List;

import com.aowin.model.BicycleAccount;
import com.aowin.model.BicycleInfo;

public interface IBicycleDispatchService {
/**
 * 车辆调出
 * @param ba
 * @throws Exception
 */
	public void from(BicycleAccount ba)throws Exception;
/**
 * 查询状态为普通调出的车辆
 * @return
 * @throws Exception
 */
	public List<BicycleInfo> select()throws Exception;
	/**
	 * 车辆调入
	 * @param ba
	 * @throws Exception
	 */
	public void to(BicycleAccount ba)throws Exception;
}
