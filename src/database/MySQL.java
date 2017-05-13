package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MySQL {

	public static void main(String[] args) throws SQLException
	{

		String uri = "jdbc:mysql://localhost:3306/testdb";
		String username = "manager";
		String password = "password";
		
		System.out.println("Connecting to database...");
		
		Connection connection = DriverManager.getConnection(uri, username, password);
		
		Statement stmt = connection.createStatement();
//		stmt.execute("INSERT INTO NAMES VALUES('Lily', 'Potter', '')");
		ResultSet rs = stmt.executeQuery("Select * from testdb.NAMES");
		
		while(rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2));
		}

	}

}
