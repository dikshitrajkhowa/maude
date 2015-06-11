package com.maudeinterface.service;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Utils {

	public static Date getSqlDataFrmString(String strDate, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date d = null;
		try {
			d = new Date(sdf.parse(strDate).getTime());
		} catch (ParseException e) {

			e.printStackTrace();
		}

		return d;
	}

}
