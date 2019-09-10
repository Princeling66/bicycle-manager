package com.aowin.model;

public class CardRecord {
	private Integer recordId;//记录ID
	private Integer cardId;//卡ID
	private Integer feeType;//费用类型
	private Double chgMonthlyMoney;//月票变化金额
	private Double chgWalletMoney;//钱包变化金额
	private Double chgFrozenMoney;//冻结变化金额
	private String createTime;//发生时间
	private Integer userId;//创建人
	private String remark;//备注
	private String  zxbj;//注销标志
	private Double total;//统计的月票/钱包/冻结金额
	
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
	public Integer getFeeType() {
		return feeType;
	}
	public void setFeeType(Integer feeType) {
		this.feeType = feeType;
	}
	public Double getChgMonthlyMoney() {
		return chgMonthlyMoney;
	}
	public void setChgMonthlyMoney(Double chgMonthlyMoney) {
		this.chgMonthlyMoney = chgMonthlyMoney;
	}
	public Double getChgWalletMoney() {
		return chgWalletMoney;
	}
	public void setChgWalletMoney(Double chgWalletMoney) {
		this.chgWalletMoney = chgWalletMoney;
	}
	public Double getChgFrozenMoney() {
		return chgFrozenMoney;
	}
	public void setChgFrozenMoney(Double chgFrozenMoney) {
		this.chgFrozenMoney = chgFrozenMoney;
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
	public String getZxbj() {
		return zxbj;
	}
	public void setZxbj(String zxbj) {
		this.zxbj = zxbj;
	}
	
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "CardRecord [recordId=" + recordId + ", cardId=" + cardId + ", feeType=" + feeType + ", chgMonthlyMoney="
				+ chgMonthlyMoney + ", chgWalletMoney=" + chgWalletMoney + ", chgFrozenMoney=" + chgFrozenMoney
				+ ", createTime=" + createTime + ", userId=" + userId + ", remark=" + remark + ", zxbj=" + zxbj
				+ ", total=" + total + "]";
	}

	
	

}
