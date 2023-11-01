package com.lcpan.m02;

import java.sql.*;

public class QueryDemo1 {
	public static void main(String[] args) {
		Connection conn = null;
		try {     
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//查找mssql的class driver
			//Returns the Class object associated with the class or interface with the given string name, using the given class loader.
			String url = "jdbc:sqlserver://localhost:1433;databaseName=jdbc; trustServerCertificate = true";
			conn = DriverManager.getConnection(url, "sa", "Wawi247525=");
		
			String sql = "SELECT ename, salary, hiredate FROM employee";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.print("name = " + rs.getString("ename"));
				System.out.print(", salary = " + rs.getInt("salary"));
				System.out.println(", hiredate = " + rs.getString("hiredate"));
				System.out.print("name = " + rs.getString(1));
				System.out.print(", salary = " + rs.getInt(2));
				System.out.println(", hiredate = " + rs.getString(3));
			}
		
			rs.close();
			stmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
//			e.printStackTrace();
			System.err.println("發生 SQL 錯誤: " + e.getMessage());//紅字
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
