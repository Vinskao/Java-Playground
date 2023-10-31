package com.lcpan.m04;

import java.sql.*;

import com.lcpan.db.ConnConst;

public class UpdateStoredProcedure {
	private static final String SQL =
			"{call upd_emp_salary(?, ?)}";
	
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(ConnConst.DB_URL, ConnConst.USER, ConnConst.PASSWORD);
			CallableStatement cstmt = conn.prepareCall(SQL);
			cstmt.setInt(1, 60000);
			cstmt.setString(2, "1001");
			cstmt.execute();
			System.out.println("Update Stored Procedure successful!");
			cstmt.close();
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
