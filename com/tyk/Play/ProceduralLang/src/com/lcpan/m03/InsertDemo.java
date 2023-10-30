package com.lcpan.m03;

import java.sql.*;

import com.lcpan.db.ConnConst;

// Insert one employee
public class InsertDemo {
	private static final String SQL =
			"INSERT INTO employee VALUES (?, ?, ?, ?, ?, ?)";
	
	public static void main(String[] args) {
		Connection conn = null;
		try {     
			conn = DriverManager.getConnection(ConnConst.DB_URL, ConnConst.USER, ConnConst.PASSWORD);
			
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, 1009);
			pstmt.setString(2, "Jean Tsao");
			pstmt.setString(3, "2020/07/24");
			pstmt.setInt(4, 55000);
			pstmt.setInt(5, 100);
			pstmt.setString(6, "senior engineer");
		
			int count = pstmt.executeUpdate();
			System.out.println("insert count = " + count);
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
}// end of class InsertDemo
