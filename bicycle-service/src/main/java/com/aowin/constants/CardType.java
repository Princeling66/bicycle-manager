package com.aowin.constants;

public interface CardType {
	/**
	 * A卡：可充值月票和钱包
	 */
	int CARD_A = 1;
	/**
	 * D卡：可充值钱包
	 */
	int CARD_D = 2;
	/**
	 * 社保卡 这种卡片的身份证号码即是卡号 可以充值月票和钱包
	 */
	int CARD_SB = 3;
	/**
	 * 员工卡 车辆调入调出 不可以充值
	 */
	int CARD_EMPLOYEE = 4;
	/**
	 * 维修调度卡 车辆维修调入调出 不可以充值
	 */
	int CARD_DEPLOY = 5;

}
