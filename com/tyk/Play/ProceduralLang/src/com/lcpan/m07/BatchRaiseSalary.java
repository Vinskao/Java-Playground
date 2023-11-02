package com.lcpan.m07;

import com.lcpan.db.ConnConst;

import java.sql.*;

public class BatchRaiseSalary {
	private static final String SELECT_SQL = "SELECT empno, salary FROM employee";
	private static final String UPDATE_SQL = "UPDATE employee SET salary = ? WHERE empno = ?";
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(ConnConst.DB_URL, ConnConst.USER, ConnConst.PASSWORD);
			Statement selectStmt = conn.createStatement();
			//Creates a Statement object for sending SQL statements to the database.
			ResultSet resultSet = selectStmt.executeQuery(SELECT_SQL);
			//Executes the given SQL statement, which returns a single ResultSet object.
			//A table of data representing a database result set, which is usually generated by executing a statement that queries the database.
			//先有statement後調用ResultSet對象來執行select句
			PreparedStatement pstmt = conn.prepareStatement(UPDATE_SQL);
			//Creates a PreparedStatement object for sending parameterized SQL statements to the database.


			while (resultSet.next()){
				//第一次執行 resultSet.next() 將會將游標移動到第一行資料的位置
				//Moves the cursor forward one row from its current position.
				String empno = resultSet.getString("empno");
				pstmt.setInt(1, resultSet.getInt("salary") + 1000);
				pstmt.setString(2, empno);
				pstmt.addBatch();
				//Adds a set of parameters to this PreparedStatement object's batch of commands.
			}
			pstmt.executeBatch();
			selectStmt.close();
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