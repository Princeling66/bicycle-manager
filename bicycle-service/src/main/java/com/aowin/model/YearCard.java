package com.aowin.model;
/**
 * 年度内所有的租车卡信息
 * @author zhoushuxin
 *
 */
public class YearCard {
	private Double totalRecharge;//总充值金额
	private Double totalConsume;//总消费金额
	private Integer rentTotal;//总租车次数
	private Integer rentAvg;//平均租车次数
	private Integer  rentHour;//总租车小时数
	private Integer rentAverage;//平均租车小时
	
	
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
	public Integer getRentHour() {
		return rentHour;
	}
	public void setRentHour(Integer rentHour) {
		this.rentHour = rentHour;
	}
	public Integer getRentAverage() {
		return rentAverage;
	}
	public void setRentAverage(Integer rentAverage) {
		this.rentAverage = rentAverage;
	}
	
}
