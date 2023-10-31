package com.lcpan.m07;

import java.sql.*;

import com.lcpan.db.ConnConst;

public class BatchUpdateStatement {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(ConnConst.DB_URL, ConnConst.USER, ConnConst.PASSWORD);
			Statement stmt = conn.createStatement();
			stmt.addBatch("UPDATE employee SET salary = 62000 WHERE empno = 1001");
			stmt.addBatch("UPDATE employee SET salary = 36000 WHERE empno = 1002");
			stmt.addBatch("UPDATE employee SET salary = 80000 WHERE empno = 1003");
			stmt.executeBatch();

			stmt.close();
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
