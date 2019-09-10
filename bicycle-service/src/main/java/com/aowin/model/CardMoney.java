package com.aowin.model;
/**
 * 卡费用统计
 * @author zhoushuxin
 *
 */
public class CardMoney {
	private Integer rentCard;//租车卡的总张数
	private Integer rentRecord;//有租车记录的卡张数
	private Double totalRecharge;//总充值金额
	private Double totalConsume;//总消费金额
	private Double lockMoney;//现冻结金额
	private Double overage;//现可用余额
	private Integer  rentHour;//总租车小时数
	private Integer rentTotal;//总租车次数
	private Integer rentAvg;//平均租车次数
	
	
	
	public CardMoney() {
		super();
	}
	public Integer getRentCard() {
		return rentCard;
	}
	public void setRentCard(Integer rentCard) {
		this.rentCard = rentCard;
	}
	public Integer getRentRecord() {
		return rentRecord;
	}
	public void setRentRecord(Integer rentRecord) {
		this.rentRecord = rentRecord;
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
	
	public Integer getRentAvg() {
		return rentAvg;
	}
	public void setRentAvg(Integer rentAvg) {
		this.rentAvg = rentAvg;
	}
	@Override
	public String toString() {
		return "CardMoney [rentCard=" + rentCard + ", rentRecord=" + rentRecord + ", totalRecharge=" + totalRecharge
				+ ", totalConsume=" + totalConsume + ", lockMoney=" + lockMoney + ", overage=" + overage + ", rentHour="
				+ rentHour + ", rentTotal=" + rentTotal + ", rentAvg=" + rentAvg + "]";
	}



	
	
	
}	

