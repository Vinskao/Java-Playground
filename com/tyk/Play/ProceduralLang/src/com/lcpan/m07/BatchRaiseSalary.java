package com.lcpan.m07;

import com.lcpan.db.ConnConst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class BatchRaiseSalary {
	private static final String SELECT_SQL = "SELECT empno, salary FROM employee";
	private static final String UPDATE_SQL = "UPDATE employee SET salary = ? WHERE empno = ?";
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(ConnConst.DB_URL, ConnConst.USER, ConnConst.PASSWORD);
			PreparedStatement selectStmt = conn.prepareStatement(SELECT_SQL);
			ResultSet resultSet = selectStmt.executeQuery();
			PreparedStatement pstmt = conn.prepareStatement(UPDATE_SQL);

			while (resultSet.next()){
				String empno = resultSet.getString("empno");
				int currentSalary = resultSet.getInt("salary");
				int raisedSalary = currentSalary + 1000;
				pstmt.setInt(1, raisedSalary);
				pstmt.setString(2, empno);
				pstmt.addBatch();
			}
			pstmt.executeBatch();
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
