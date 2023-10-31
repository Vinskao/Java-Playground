package com.lcpan.m03;

import java.sql.*;

import com.lcpan.db.ConnConst;

// Update employee data
public class UpdateDemo {
	private static final String SQL =
			"UPDATE employee SET salary=? WHERE empno=?";
	
	public static void main(String[] args) {
		Connection conn = null;
		try {     
			conn = DriverManager.getConnection(ConnConst.DB_URL, ConnConst.USER, ConnConst.PASSWORD);
			
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, 90000000);
			pstmt.setInt(2, 1009);
			int count = pstmt.executeUpdate();
			System.out.println("update count = " + count);
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
	}// end of main()
}// end of class UpdateDemo
