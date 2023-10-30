package com.lcpan.m04;

import java.sql.*;

import com.lcpan.db.ConnConst;

public class QueryStoredProcedure {
	private static final String SQL = "{call qry_emp(?,?,?)}";
	
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(ConnConst.DB_URL, ConnConst.USER, ConnConst.PASSWORD);
			CallableStatement cstmt = conn.prepareCall(SQL);
			cstmt.setString(1, "1001");
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.registerOutParameter(3, Types.INTEGER);
			cstmt.execute();
			System.out.print("name = " + cstmt.getString(2));
			System.out.println(", salary = " + cstmt.getInt(3));
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
	}// end of main()
}// end of class StoredProcedureDemo
