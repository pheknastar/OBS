package com.OBS.genericUtils;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtils {

	public String readDataFromPropertyFile(String key) throws Throwable {
		FileInputStream fis = new FileInputStream(IpathConstants.FilePath);

		Properties prop = new Properties();
		prop.load(fis);

		String value = prop.getProperty(key);
		return value;
	}
}
