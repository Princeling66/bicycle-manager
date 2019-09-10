package com.aowin.model;

public class CardInfoRecord {
	
	private Integer recordId;//记录ID
	private Integer cardId;//卡ID
	private Integer infoType;//变动类型
	private String createTime;//发生时间
	private Integer userId;//创建人
	private String remark;//备注
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
	public Integer getInfoType() {
		return infoType;
	}
	public void setInfoType(Integer infoType) {
		this.infoType = infoType;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "CardInfoRecord [recordId=" + recordId + ", cardId=" + cardId + ", infoType=" + infoType
				+ ", createTime=" + createTime + ", userId=" + userId + ", remark=" + remark + "]";
	}
	
	

}
