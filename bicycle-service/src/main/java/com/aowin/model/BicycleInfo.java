package com.aowin.model;
/**
 * 车辆状态信息
 * @author zhoushuxin
 *
 */
public class BicycleInfo {
	private Integer bicycleId;//车辆id
	private String bicycleCode;//车辆编号
	private Integer status;//车辆状态
	private Integer pileId;//所在车桩id
	private String destoryDate;//车辆销毁日期
	private Integer userId;//操作人
	private String operatorTime;//操作时间
	private Integer cardId;//租车卡id
	private String remark;//备注
	public Integer getBicycleId() {
		return bicycleId;
	}
	public void setBicycleId(Integer bicycleId) {
		this.bicycleId = bicycleId;
	}
	public String getBicycleCode() {
		return bicycleCode;
	}
	public void setBicycleCode(String bicycleCode) {
		this.bicycleCode = bicycleCode;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getPileId() {
		return pileId;
	}
	public void setPileId(Integer pileId) {
		this.pileId = pileId;
	}
	public String getDestoryDate() {
		return destoryDate;
	}
	public void setDestoryDate(String destoryDate) {
		this.destoryDate = destoryDate;
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
	public Integer getCardId() {
		return cardId;
	}
	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	

}
