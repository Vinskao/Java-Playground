package com.lcpan.m03;

import java.sql.*;

import com.lcpan.db.ConnConst;

// delete a employee data
public class DeleteDemo {
	private static final String SQL =
			"DELETE employee WHERE empno=?";
	
	public static void main(String[] args) {
		Connection conn = null;
		try {     
			conn = DriverManager.getConnection(ConnConst.DB_URL, ConnConst.USER, ConnConst.PASSWORD);
			
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, 1009);
			int count = pstmt.executeUpdate();
			System.out.println("delete count = " + count);
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
}// end of class DeleteDemo
