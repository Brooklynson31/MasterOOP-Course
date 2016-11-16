package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
	
	private Connection conn;
	
	private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();
	
	private DatabaseConnectionManager(){
		
	}
	
	public static DatabaseConnectionManager getInstance(){
		return connectionInstance;
		
	}
	
	public void connect() throws SQLException{
		//processing specific to database connection
		conn = DriverManager.getConnection("SomeOracleURL");
		System.out.println("Established Database Connection..");
		
	}
	
	public Connection getConnectionObject(){
		return conn;
	}
	
	public void disconnect() throws SQLException{
		conn.close();
	}
	

}
