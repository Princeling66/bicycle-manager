package com.aowin.model;
/**
 * 月度/年度卡
 * @author zhoushuxin
 *
 */
public class Time {
private String year;
private String month;
private Integer cardId;
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}
public String getMonth() {
	return month;
}
public void setMonth(String month) {
	this.month = month;
}
public Integer getCardId() {
	return cardId;
}
public void setCardId(Integer cardId) {
	this.cardId = cardId;
}
@Override
public String toString() {
	return "Time [year=" + year + ", month=" + month + ", cardId=" + cardId + "]";
}


}
