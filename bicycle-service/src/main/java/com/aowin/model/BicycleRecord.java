package com.aowin.model;

public class BicycleRecord {
	
	private Integer recordId;//记录ID
	private Integer bicycleId;//车辆ID
	private Integer cardId;//租车卡ID
	private String rentTime;//租车时间
	private Integer rentPileId;//租车车桩
	private String returnTime;//还车时间
	private Integer returnPileId;//还车车桩
	private Double money;//租车佣金
	private String remark;//备注
	public Integer getRecordId() {
		return recordId;
	}
	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}
	public Integer getBicycleId() {
		return bicycleId;
	}
	public void setBicycleId(Integer bicycleId) {
		this.bicycleId = bicycleId;
	}
	public Integer getCardId() {
		return cardId;
	}
	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}
	public String getRentTime() {
		return rentTime;
	}
	public void setRentTime(String rentTime) {
		this.rentTime = rentTime;
	}
	public Integer getRentPileId() {
		return rentPileId;
	}
	public void setRentPileId(Integer rentPileId) {
		this.rentPileId = rentPileId;
	}
	public String getReturnTime() {
		return returnTime;
	}
	public void setReturnTime(String returnTime) {
		this.returnTime = returnTime;
	}
	public Integer getReturnPileId() {
		return returnPileId;
	}
	public void setReturnPileId(Integer returnPileId) {
		this.returnPileId = returnPileId;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	

}
