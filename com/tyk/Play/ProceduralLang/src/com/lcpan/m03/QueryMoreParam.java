package com.lcpan.m03;

import java.sql.*;

import com.lcpan.db.ConnConst;

public class QueryMoreParam {
	private static final String SQL =
			"SELECT * FROM employee WHERE deptno = ? AND title = ?";
	
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(ConnConst.DB_URL, ConnConst.USER, ConnConst.PASSWORD);
			
			int deptno = 100;
			String title = "engineer";
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, deptno);
			pstmt.setString(2, title);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.print("name = " + rs.getString("ename") + ", ");
				System.out.println("salary = " + rs.getInt("salary"));
			}

			rs.close();
			pstmt.close();
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
