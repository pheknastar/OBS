package com.OBS.genericUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtils {

	/**
	 * This method is used to append random no
	 * @author vky20
	 * @return
	 */
	public int getRandomNumber() {
		Random r = new Random();
		int random = r.nextInt(1000);
		return random;
	}
	
	public String sysDateAndTime() {
		Date d = new Date();
		String date = d.toString();
		return date;
	}
	
	public String getSystemDateInFormat() {

		SimpleDateFormat dateFormat = new SimpleDateFormat("DD-MM-yyyy HH-mm-ss");
		Date d = new Date();
		String date = dateFormat.format(d);
		return date;
	}
}
