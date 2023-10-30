package com.lcpan.m02;

import java.sql.*;

import com.lcpan.db.ConnConst;

public class QueryDemo2 {
	private static final String SQL =
			"SELECT ename, salary FROM employee";
	
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName(ConnConst.JDBC_DRIVER);
			conn = DriverManager.getConnection(ConnConst.DB_URL, ConnConst.USER, ConnConst.PASSWORD);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);
			while (rs.next()) {
				System.out.print("name = " + rs.getString("ename"));
				System.out.println(", salary = " + rs.getInt("salary"));
			}
			rs.close();
			stmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
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
