package com.tea.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectivity {
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Connection con;
		String driverClass = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "capgtraining";
		String password = "sidsri";
		Class.forName(driverClass);
		con = DriverManager.getConnection(url,userName,password);
		return con;
	}
}
