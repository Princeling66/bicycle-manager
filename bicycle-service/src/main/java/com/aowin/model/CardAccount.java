package com.aowin.model;
/**
 * 定义一个类 存放修改卡中金额的一些信息
 * @address 
 * @Description 
 *
 */
public class CardAccount {
	private Integer cardId;//卡号
	private Double monthlyMoney;//变动的月票金额
	private Double frozenMoney;//变动的冻结金额
	private Double walletMoney;//变动的钱包金额
	private Integer feeType;//费用变动类型
	private Integer userId;//操作人
	private String remark;//备注
	public Integer getCardId() {
		return cardId;
	}
	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}
	public Double getMonthlyMoney() {
		return monthlyMoney;
	}
	public void setMonthlyMoney(Double monthlyMoney) {
		this.monthlyMoney = monthlyMoney;
	}
	public Double getFrozenMoney() {
		return frozenMoney;
	}
	public void setFrozenMoney(Double frozenMoney) {
		this.frozenMoney = frozenMoney;
	}
	public Double getWalletMoney() {
		return walletMoney;
	}
	public void setWalletMoney(Double walletMoney) {
		this.walletMoney = walletMoney;
	}
	public Integer getFeeType() {
		return feeType;
	}
	public void setFeeType(Integer feeType) {
		this.feeType = feeType;
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
		return "CardAccount [cardId=" + cardId + ", monthlyMoney=" + monthlyMoney + ", frozenMoney=" + frozenMoney
				+ ", walletMoney=" + walletMoney + ", feeType=" + feeType + ", userId=" + userId + ", remark=" + remark
				+ "]";
	}
	
	

}
