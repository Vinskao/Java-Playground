package com.lcpan.m06;

import java.sql.*;

import com.lcpan.db.ConnConst;

public class ColumnCount {
	private static final String SQL1 =
			"SELECT ename, salary FROM employee";
	private static final String SQL2 =
			"SELECT * FROM employee";
	
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(ConnConst.DB_URL, ConnConst.USER, ConnConst.PASSWORD);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(SQL1);			
			ResultSetMetaData rsmd = rs.getMetaData();
			int count = rsmd.getColumnCount();
			System.out.println("column count = " + count);
			
			rs = stmt.executeQuery(SQL2);			
			rsmd = rs.getMetaData();
			count = rsmd.getColumnCount();
			System.out.println("table column count = " + count);
		
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
		}
	}
}
