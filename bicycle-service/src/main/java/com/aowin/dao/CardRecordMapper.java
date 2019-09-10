package com.aowin.dao;

import java.util.List;

import com.aowin.model.CardRecord;
import com.aowin.model.Time;
import com.aowin.model.YearCard;

public interface CardRecordMapper {
	/**
	 * 新增卡费用流水信息
	 * @param record
	 */
	public void insert(CardRecord record);
	/**
	 * 根据卡号id查询当月月票充值的次数
	 * @param cardId
	 * @return
	 */
	public int selectMonthlyMoneyCount(int cardId);
	/**
	 * 查询费用流水
	 * @param cardId
	 * @return
	 */
	public List<CardRecord> select(int cardId);
	/**
	 * 总充值金额，总消费金额，现冻结金额
	 * @return
	 */
	public List<CardRecord> selectMoney();
	/**
	 * 统计单张卡的总充值金额，总消费金额，现冻结金额
	 * @return
	 * @throws Exception
	 */
	public List<CardRecord> selectSingle(int cardId);
	/**
	 * 统计月度内，年度内所有的租车卡的总充值金额，总消费金额，
	 * @param tm
	 * @return
	 */
	public List<CardRecord> getMoney(Time tm);
	/**
	 * 统计月度内，年度内单张租车卡的总充值金额，总消费金额
	 * @param tm
	 * @return
	 */
	public List<CardRecord> getSingleMoney(Time tm);

}
