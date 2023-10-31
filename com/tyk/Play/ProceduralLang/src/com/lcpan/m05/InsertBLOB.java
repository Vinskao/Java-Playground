package com.lcpan.m05;

import java.sql.*;

import com.lcpan.db.ConnConst;

import java.io.*;

public class InsertBLOB {
	private static final String SQL =
			"INSERT INTO blobtest VALUES(?,?)";
	
	public static void main(String[] args) {
		Connection conn = null;
		String inFile = "res/Tomcat.gif";
		try {
			conn = DriverManager.getConnection(ConnConst.DB_URL, ConnConst.USER, ConnConst.PASSWORD);			
			
			FileInputStream fis = new FileInputStream(inFile);
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, inFile);
			pstmt.setBinaryStream(2, fis); //不能用setBlob 大小不夠
			int count = pstmt.executeUpdate();
			if (count > 0)
				System.out.println("Insert blob is successful!");	

			pstmt.close();
		} catch (Exception e) {
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
