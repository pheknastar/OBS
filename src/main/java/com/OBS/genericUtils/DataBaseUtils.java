package com.OBS.genericUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtils {

	Connection con = null;
	ResultSet result = null;
	
	/**
	 * Connect To DataBase
	 * @throws Throwable
	 */
	public void connectToDb() throws Throwable {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		con = DriverManager.getConnection(IpathConstants.DBURL, IpathConstants.DBUserName, IpathConstants.DBPassword);
	}
	
	/**
	 * Create Statement for execute query
	 * @param query
	 * @param colIndex
	 * @param expData
	 * @throws Throwable
	 */
	public void executeQ(String query, int colIndex, String expData) throws Throwable {
		Statement stmnt = con.createStatement();
		result = stmnt.executeQuery(query);
		boolean flag = false;
		while(result.next()) {
			String actData = result.getString(colIndex);
			if(actData.equalsIgnoreCase(expData)) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("---data verified---");
		}else {
			System.out.println("---data not verified---");
		}
	}
	
	/**
	 * Create Statement for execute update
	 * @param query
	 * @throws Throwable
	 */
	public void executeUp(String query) throws Throwable {
		Statement stmnt = con.createStatement();
		stmnt.executeUpdate(query);
	}
	
	/**
	 * close DataBase Connection
	 * @throws Throwable
	 */
	public void disconnectDB() throws Throwable {
		con.close();
	}
}
