package com.aowin.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	/**
	 * 获得当前系统时间
	 * 格式 2018-02-10 14:49:00
	 * @return
	 */
	public static String currentTime() {
		return sdf.format(new Date());
	}
	
	/**
	 * 将日期格式字符串为 2018-02-10 14:49:00的时间转换为long的时间
	 * @param date
	 * @return
	 * @throws ParseException 
	 */
	public static long parse(String date) throws ParseException {
		Date time = sdf.parse(date);
		return time.getTime();
	}
	
	
}
