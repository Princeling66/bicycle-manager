package com.aowin.dao;

import com.aowin.model.SingleCard;
import com.aowin.model.Time;

public interface CardMoneyMapper {

	/**
	 * 针对卡费用进行统计
	 * @return
	 * @throws Exception
	 */
	//统计所有租车卡的总张数
	public int selectRentCard();
	//有租车记录张数
	public int selectRentRecord();
	/**
	 * 查询现可用余额
	 * @return
	 */
	public Double selMoney();
	//总租车小时数
	public int selectRentHour();
	//总租车次数 
	public int selRent();
	/**
	 * 统计月度内，年度内所有的租车卡总租车次数
	 * @param tm
	 * @return
	 */
	public int getRent(Time tm);
	/**
	 * 统计月度内，年度内所有的有租车记录的张数
	 * @param tm
	 * @return
	 */
	public int getRentRecord(Time tm);
	/**统计月度内，年度内所有的租车卡
	 * 总租车时间数，平均租车时间数
	 * @param tm
	 * @return
	 */
	public SingleCard getRentHour(Time tm);
/**
 * 统计月度内，年度内，租车卡的租车次数
 * @param tm
 * @return
 */
	public int selSingleRent(Time tm);
	/**
	 * 统计月度内，年度内，租车卡总租车小时数
	 * 平均租车时间
	 * @return
	 */
	public SingleCard selSingleRentTime(Time tm);

}
