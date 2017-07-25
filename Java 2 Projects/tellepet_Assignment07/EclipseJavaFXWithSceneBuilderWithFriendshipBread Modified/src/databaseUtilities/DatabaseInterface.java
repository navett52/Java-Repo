/***********************************************************
 * Database Utilities for Java FX example projects         *
 * Bill Nicholson                                          *
 * nicholdw@ucmai.uc.edu
 * http://www.cs.cmu.edu/~wangy/jdbc_sp.html               *
 *                                                         *
 ***********************************************************/
package databaseUtilities;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import employee.Employee;

public class DatabaseInterface {
	private static boolean debug = true;
	public Connection ConnectToDatabase(String serverName, String user, String password) {
		Connection con = null;
		// Load Microsoft JDBC Driver 1.0
		System.out.println("Callng Class.forName()...");
		try {
			//Driver d = (Driver)Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver").newInstance();
   			Driver d = (Driver)Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

		} catch (java.lang.ClassNotFoundException e) {
			System.err.println("ClassNotFoundException: " + e.getMessage());
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		System.out.println("Class.forName() completed");
		try {
			// Obtaining a connection to SQL Server
			con = DriverManager.getConnection("jdbc:sqlserver://"+serverName + ";" + "user=" + user + ";password=" + password );
			System.out.println("DriverManager.getConnection() completed");

		} catch (SQLException e) {
			System.err.println("SQLException: " + e.getMessage());
		}
		return con;
	}
	public static boolean ExecuteActionQuery(Connection con, String sql){
		boolean status = true;	// Hope for the best
		try {
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate(sql);
		} catch(Exception ex) {
			status = false;
			if (debug) System.out.println("ExecuteActionQuery: " + ex.getLocalizedMessage());
		}
		return status;
	}

	public  static String SingleQuoteMe(String s)
	{
		return (char)39 + s + (char)39;	// Single quotes
	}
	public  static String QuoteMe(String s)
	{
		return (char)34 + s + (char)34;
	}

	public boolean AddCatBreed(String catBreed) {
		boolean status = true;
		Statement stmt = null;
		ResultSet rs = null;
		DatabaseInterface db = new DatabaseInterface();
		Connection con = db.ConnectToDatabase("IL-SERVER-001.uccc.uc.edu\\mssqlserver2012", "IT2045C", "P@ssword");
		
		
		CallableStatement cs = null;
		try {
			cs = con.prepareCall("{call spAddCatBreed_nicholdw('" + catBreed +  "')}");
			cs.execute();
		} catch (Exception ex) {
			System.out.println("CallableStatement: " + ex.getMessage());
		}
		// This also works but it's bad news.
		//DatabaseInterface.ExecuteActionQuery(con, "INSERT INTO tCatBreed(CatBreed) VALUES ('" + catBreed + "')");

		return status;
	}
	public boolean AddEmployee(Employee emp) {
		boolean status = true;
		Statement stmt = null;
		ResultSet rs = null;
		DatabaseInterface db = new DatabaseInterface();
		Connection con = db.ConnectToDatabase("IL-SERVER-001.uccc.uc.edu\\mssqlserver2012", "IT2045C", "P@ssword");

		CallableStatement cs = null;
		try {
			cs = con.prepareCall("{call spAddEmployee_nicholdw('" + emp.getEmployeeNumber() + "','" + emp.getFirstName() + "','" + emp.getLastName() +  "')}");
			cs.execute();
		} catch (Exception ex) {
			System.out.println("CallableStatement: " + ex.getMessage());
		}
		// This also works but it's bad news.
		//DatabaseInterface.ExecuteActionQuery(con, "INSERT INTO tCatBreed(CatBreed) VALUES ('" + catBreed + "')");

		return status;
	}
}
