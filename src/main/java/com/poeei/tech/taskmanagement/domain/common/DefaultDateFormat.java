package com.poeei.tech.taskmanagement.domain.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DefaultDateFormat {

	public static final String FORMAT = "yyyyMMdd";

	public static final String TIMEZONE = "Asia/Rangoon";

	public static Date parse(String value) throws ParseException {
		if (value == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		return sdf.parse(value);
	}
}