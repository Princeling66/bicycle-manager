package com.aowin.model;
/**
 * 车桩model
 * @Description 
 *
 */
public class BicyclePile {
	private Integer pileId;//车桩id
	private Integer venderId;//供应商id
	private String  pileCode;//车桩编号
	private Integer stationId;//所在车点id
	private Integer status;//车桩状态
	private String installTime;//安装日期
	private String disassemblyTime;//拆解日期
	private Integer userId;//用户id
	private String operatorTime;//操作时间
	private Integer bicycleId;//所存车辆id
	private String remark;//标记
	
	
	private String bicycleCode;//所存车辆编号
	
	
	private String venderName;
	public Integer getPileId() {
		return pileId;
	}
	public void setPileId(Integer pileId) {
		this.pileId = pileId;
	}
	public Integer getVenderId() {
		return venderId;
	}
	public void setVenderId(Integer venderId) {
		this.venderId = venderId;
	}
	public String getPileCode() {
		return pileCode;
	}
	public void setPileCode(String pileCode) {
		this.pileCode = pileCode;
	}
	public Integer getStationId() {
		return stationId;
	}
	public void setStationId(Integer stationId) {
		this.stationId = stationId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getInstallTime() {
		return installTime;
	}
	public void setInstallTime(String installTime) {
		this.installTime = installTime;
	}
	public String getDisassemblyTime() {
		return disassemblyTime;
	}
	public void setDisassemblyTime(String disassemblyTime) {
		this.disassemblyTime = disassemblyTime;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getOperatorTime() {
		return operatorTime;
	}
	public void setOperatorTime(String operatorTime) {
		this.operatorTime = operatorTime;
	}
	public Integer getBicycleId() {
		return bicycleId;
	}
	public void setBicycleId(Integer bicycleId) {
		this.bicycleId = bicycleId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getVenderName() {
		return venderName;
	}
	public void setVenderName(String venderName) {
		this.venderName = venderName;
	}
	public String getBicycleCode() {
		return bicycleCode;
	}
	public void setBicycleCode(String bicycleCode) {
		this.bicycleCode = bicycleCode;
	}
	
}
