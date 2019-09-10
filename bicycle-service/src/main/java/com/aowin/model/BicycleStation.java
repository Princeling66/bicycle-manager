package com.aowin.model;

import java.util.List;

/**
 * 车点model
 *
 */
public class BicycleStation {
	private Integer stationId;//车点id
	private String stationCode;//车点编号
	private String stationName;//车点名称
	private Double longitude;//经度
	private Double latitude;//纬度
	private Integer bicyclePileNum;//车桩数量
	private String address;//车点地址
	private String personInCharge;//负责人
	private String buildTime;//新建时间
	private String runTime;//使用时间
	private Integer userId;//操作人id 登记的人的id
	private String createTime;//操作时间 登记 的时间
	private String remark;//备注
	
	//车桩信息
	private List<BicyclePile> piles;
	
	
	public List<BicyclePile> getPiles() {
		return piles;
	}
	public void setPiles(List<BicyclePile> piles) {
		this.piles = piles;
	}
	public Integer getStationId() {
		return stationId;
	}
	public void setStationId(Integer stationId) {
		this.stationId = stationId;
	}
	public String getStationCode() {
		return stationCode;
	}
	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Integer getBicyclePileNum() {
		return bicyclePileNum;
	}
	public void setBicyclePileNum(Integer bicyclePileNum) {
		this.bicyclePileNum = bicyclePileNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPersonInCharge() {
		return personInCharge;
	}
	public void setPersonInCharge(String personInCharge) {
		this.personInCharge = personInCharge;
	}
	public String getBuildTime() {
		return buildTime;
	}
	public void setBuildTime(String buildTime) {
		this.buildTime = buildTime;
	}
	public String getRunTime() {
		return runTime;
	}
	public void setRunTime(String runTime) {
		this.runTime = runTime;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "BicycleStation [stationId=" + stationId + ", stationCode=" + stationCode + ", stationName="
				+ stationName + ", longitude=" + longitude + ", latitude=" + latitude + ", bicyclePileNum="
				+ bicyclePileNum + ", address=" + address + ", personInCharge=" + personInCharge + ", buildTime="
				+ buildTime + ", runTime=" + runTime + ", userId=" + userId + ", createTime=" + createTime + ", remark="
				+ remark + ", piles=" + piles + "]";
	}
	

}
