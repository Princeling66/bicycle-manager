package com.aowin.model;

public class Card {
	private Integer cardId;//主id
	private String cardCode;//卡号
	private Integer cardType;//卡类型
	private String  name;//姓名
	private String  idcard;//身份证
	private String  sex;//性别
	private String  telphone;//联系电话
	private String  mobile;//手机
	private String  email;//邮箱
	private String  address;//住址
	private String  work;//工作单位
	private String  zxbj;//注销标志
	private double monthlyMoney;//月票金额
	private double frozenMoney;//冻结金额
	private double walletMoney;//钱包余额
	private Integer status;//卡状态
	
	public Integer getCardId() {
		return cardId;
	}
	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}
	public String getCardCode() {
		return cardCode;
	}
	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}
	public Integer getCardType() {
		return cardType;
	}
	public void setCardType(Integer cardType) {
		this.cardType = cardType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getZxbj() {
		return zxbj;
	}
	public void setZxbj(String zxbj) {
		this.zxbj = zxbj;
	}
	public Double getMonthlyMoney() {
		return monthlyMoney;
	}
	public void setMonthlyMoney(double monthlyMoney) {
		this.monthlyMoney = monthlyMoney;
	}
	public double getFrozenMoney() {
		return frozenMoney;
	}
	public void setFrozenMoney(double frozenMoney) {
		this.frozenMoney = frozenMoney;
	}
	public double getWalletMoney() {
		return walletMoney;
	}
	public void setWalletMoney(double walletMoney) {
		this.walletMoney = walletMoney;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Card [cardId=" + cardId + ", cardCode=" + cardCode + ", cardType=" + cardType + ", name=" + name
				+ ", idcard=" + idcard + ", sex=" + sex + ", telphone=" + telphone + ", mobile=" + mobile + ", email="
				+ email + ", address=" + address + ", work=" + work + ", zxbj=" + zxbj + ", monthlyMoney="
				+ monthlyMoney + ", frozenMoney=" + frozenMoney + ", walletMoney=" + walletMoney + ", status=" + status
				+ ", getCardId()=" + getCardId() + ", getCardCode()=" + getCardCode() + ", getCardType()="
				+ getCardType() + ", getName()=" + getName() + ", getIdcard()=" + getIdcard() + ", getSex()=" + getSex()
				+ ", getTelphone()=" + getTelphone() + ", getMobile()=" + getMobile() + ", getEmail()=" + getEmail()
				+ ", getAddress()=" + getAddress() + ", getWork()=" + getWork() + ", getZxbj()=" + getZxbj()
				+ ", getMonthlyMoney()=" + getMonthlyMoney() + ", getFrozenMoney()=" + getFrozenMoney()
				+ ", getWalletMoney()=" + getWalletMoney() + ", getStatus()=" + getStatus() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
