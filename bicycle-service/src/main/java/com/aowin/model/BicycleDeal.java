package com.aowin.model;
/**
 * 业务流水表
 * @author zhoushuxin
 *
 */
public class BicycleDeal {
	private Integer dealId;//业务ID
	private String createTime;//发生时间
	private String dealName;//业务名称
	private Integer dealType;//业务类型
	private Integer recordId;//关联的业务记录ID
	private Integer cardId;//业务卡ID
	private Integer isFee;//是否发生费用
	private Double chgMoney;//费用金额
	private Integer feeType;//费用收支类型
	private Integer bicycleId;//车辆ID
	private Integer pileId;//车桩ID
	private Integer userId;//操作人ID
	public Integer getDealId() {
		return dealId;
	}
	public void setDealId(Integer dealId) {
		this.dealId = dealId;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getDealName() {
		return dealName;
	}
	public void setDealName(String dealName) {
		this.dealName = dealName;
	}
	public Integer getDealType() {
		return dealType;
	}
	public void setDealType(Integer dealType) {
		this.dealType = dealType;
	}
	public Integer getRecordId() {
		return recordId;
	}
	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}
	public Integer getCardId() {
		return cardId;
	}
	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}
	public Integer getIsFee() {
		return isFee;
	}
	public void setIsFee(Integer isFee) {
		this.isFee = isFee;
	}
	public Double getChgMoney() {
		return chgMoney;
	}
	public void setChgMoney(Double chgMoney) {
		this.chgMoney = chgMoney;
	}
	public Integer getFeeType() {
		return feeType;
	}
	public void setFeeType(Integer feeType) {
		this.feeType = feeType;
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
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
}
