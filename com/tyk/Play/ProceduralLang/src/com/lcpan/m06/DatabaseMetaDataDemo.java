package com.lcpan.m06;

import java.sql.*;

import com.lcpan.db.ConnConst;

public class DatabaseMetaDataDemo {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(ConnConst.DB_URL, ConnConst.USER, ConnConst.PASSWORD);

			DatabaseMetaData dbmd = conn.getMetaData();
			System.out.println("Database Name: " + dbmd.getDatabaseProductName());
			System.out.println("Database Version: " + dbmd.getDatabaseProductVersion());
			System.out.println("Driver Name: " + dbmd.getDriverName());
			System.out.println("Driver Version: " + dbmd.getDriverVersion());
			System.out.println("URL: " + dbmd.getURL());
			System.out.println("User Name: " + dbmd.getUserName());

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
}
