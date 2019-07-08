package ConnectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UltraVisionDataBaseConnection {

	ViewUltraVision.SearchCustomer SearchCustomer; //globals to database connection
	Statement stmt;
	ResultSet rs;
	Connection conn;

	public UltraVisionDataBaseConnection() {
		// Open database connection
		
		try{
			// Load the database driver
			//Class.forName("com.mysql.jdbc.Driver").newInstance() ;
			
			String dbServer = "jdbc:mysql://localhost:3306/ultravisiondb";
			String user = "root";
			String password = "";
			
			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password) ;

			// Get a statement from the connection
			stmt = conn.createStatement() ;

			
		}
		
		catch( SQLException se ){
			//SQL Exceptions
			
			System.out.println( "SQL Exception:" ) ;

			// Loop through the SQL Exceptions
			while( se != null ){
				System.out.println( "State  : " + se.getSQLState()  ) ;
				System.out.println( "Message: " + se.getMessage()   ) ;
				System.out.println( "Error  : " + se.getErrorCode() ) ;

				se = se.getNextException() ;
			}
		}
		catch( Exception e ){
			System.out.println( e ) ;
		}
		
	}	
	
	public ResultSet select(String query) {
		// select query database			
		// Execute the query
		rs = null;
		try {
			rs = stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return rs;

	}
	
	public boolean insert(String query) {
		//insert query database
		
		try {
			stmt.execute(query);
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
				
		

	}
	
	public void closingAll(){
		// closing connection database
		
		try {
			//rs.close() ;
			//stmt.close() ;
			conn.close() ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public ResultSet getRs() {
		//get result set
		return rs;
	}

}
