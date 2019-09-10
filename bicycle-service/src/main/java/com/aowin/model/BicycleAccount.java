package com.aowin.model;
/**
 * 调出车辆需要的数据
 * @author zhoushuxin
 *
 */
public class BicycleAccount {

	private String cardCode;//卡号
	private Integer bicycleId;//所存车辆id
	private Integer pileId;//车桩id
	
	public String getCardCode() {
		return cardCode;
	}
	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}
	public Integer getBicycleId() {
		return bicycleId;
	}
	public void setBicycleId(Integer bicycleId) {
		this.bicycleId = bicycleId;
	}
	public Integer getPileId() {
		return pileId;
	}
	public void setPileId(Integer pileId) {
		this.pileId = pileId;
	}
	
	
	
	
}
