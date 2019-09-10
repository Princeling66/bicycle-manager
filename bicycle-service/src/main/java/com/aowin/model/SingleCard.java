package com.aowin.model;

public class SingleCard {
/**
 * 统计单张卡数据
 */
	private Double totalRecharge;//总充值金额
	private Double totalConsume;//总消费金额
	private Double lockMoney;//现冻结金额
	private Double overage;//现可用余额
	private Integer  rentHour;//总租车小时数
	private Integer rentTotal;//总租车次数
	private Integer rentAverage;//平均租车小时

	public SingleCard() {
		super();
	}
	public Double getTotalRecharge() {
		return totalRecharge;
	}
	public void setTotalRecharge(Double totalRecharge) {
		this.totalRecharge = totalRecharge;
	}
	public Double getTotalConsume() {
		return totalConsume;
	}
	public void setTotalConsume(Double totalConsume) {
		this.totalConsume = totalConsume;
	}
	public Double getLockMoney() {
		return lockMoney;
	}
	public void setLockMoney(Double lockMoney) {
		this.lockMoney = lockMoney;
	}
	public Double getOverage() {
		return overage;
	}
	public void setOverage(Double overage) {
		this.overage = overage;
	}
	public Integer getRentHour() {
		return rentHour;
	}
	public void setRentHour(Integer rentHour) {
		this.rentHour = rentHour;
	}
	public Integer getRentTotal() {
		return rentTotal;
	}
	public void setRentTotal(Integer rentTotal) {
		this.rentTotal = rentTotal;
	}
	public Integer getRentAverage() {
		return rentAverage;
	}
	public void setRentAverage(Integer rentAverage) {
		this.rentAverage = rentAverage;
	}
	@Override
	public String toString() {
		return "SingleCard [totalRecharge=" + totalRecharge + ", totalConsume=" + totalConsume + ", lockMoney="
				+ lockMoney + ", overage=" + overage + ", rentHour=" + rentHour + ", rentTotal=" + rentTotal
				+ ", rentAverage=" + rentAverage + "]";
	}
	
	
	
}
