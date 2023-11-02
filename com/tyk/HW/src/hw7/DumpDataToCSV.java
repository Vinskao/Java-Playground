package hw7;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import db.ConnConst;
public class DumpDataToCSV {
	private static final String SQL = "SELECT * FROM employee";

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(ConnConst.DB_URL, ConnConst.USER, ConnConst.PASSWORD);
			//getConnection是static
			Statement stmt = conn.createStatement();
			//将创建的 Statement 对象分配给一个名为 stmt 的变量，这使得你可以使用 stmt 来执行 SQL 查询和其他操作。
			//conn.createStatement() 是在 Java 中创建一个 Statement 对象的方法调用
			//implements: createStatement() 用于创建一个用于执行 SQL 语句的 Statement
			ResultSet rs = stmt.executeQuery(SQL);
			FileWriter fw = new FileWriter("emp.csv");
			int numColumns = rs.getMetaData().getColumnCount();
				//header
			for(int i = 1; i <= numColumns; i++){
				fw.append(rs.getMetaData().getColumnName(i));
				//Get the designated column's name.
				if (i < numColumns){
					fw.append(",");
				}
			}
			fw.append("\n");
			//row
			while(rs.next()){
				for (int i = 1; i < numColumns; i++){
					fw.append(rs.getString(i));
					if (i < numColumns){
						fw.append(",");
					}
				}
				fw.append("\n");
			}
			rs.close();
			stmt.close();
			fw.flush();
			fw.close();
			System.out.println("CSV file has been created.");
		} catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
    }
} 
