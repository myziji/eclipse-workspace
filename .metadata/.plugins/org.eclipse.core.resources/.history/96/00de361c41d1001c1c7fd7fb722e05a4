package com.avtech.j2ee.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBConnection {
	public static final String SQL_SEREVR_7 = "SQL Server7";
	public static final String SQL_SEREVR_2003 = "SQL Server 2003";
	public static final String MYSQL_5 = "MySQL 5";
	public static final String ORACLE_9I = "Oracle 9i";
	public static final String ORACLE_10G = "Oracle 10g";

	public static synchronized Connection getConnectionDS() {
		Connection con = null;

		try {
			// Obtain our environment naming context
			InitialContext initCtx = new InitialContext();
			// Look up our data source
			DataSource ds = (DataSource) initCtx.lookup("jdbc/testDB2");

			// Allocate and use a connection from the pool
			con = ds.getConnection();
		} catch (Exception e) {
			System.out.println("Failed to get connection: " + e);
			e.printStackTrace();
		}
		return con;
	}

	public static Connection getConnection(String db) {

		Connection con = null;

		try {

			if (ORACLE_10G.equals(db)) {
				// Oracle 9i
				System.out.println("getting Oracle 10g connection...");
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String url = "jdbc:oracle:thin:@localhost:1521:ORCL11";
				String user = "hr";
				String password = "hr";
				con = DriverManager.getConnection(url, user, password);
			} else if (SQL_SEREVR_2003.equals(db)) {
				// SQL Server 2003
				System.out.println("getting SQL Server 2003 connection...");
				Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
				java.util.Properties props = new java.util.Properties();
				props.put("databasename", "mydb");
				props.put("user", "sa");
				props.put("password", "br10g3p@y");
				props.put("selectMethod", "cursor");
				con = DriverManager.getConnection(
						"jdbc:microsoft:sqlserver://S6DEV:1433", props);

				// URL String
				// jdbc:microsoft:sqlserver://localhost:1433;databasename=DBNAME
			} else if (SQL_SEREVR_7.equals(db)) {
				// SQL Server 7
				System.out.println("getting SQL Server 7 connection...");
				Class.forName("weblogic.jdbc.mssqlserver4.Driver");
				java.util.Properties props = new java.util.Properties();
				props.put("server", "mydb@localhost:1433");
				props.put("user", "sa");
				props.put("password", "mydbadmin");
				con = DriverManager.getConnection("jdbc:weblogic:mssqlserver4",
						props);
			} else if (MYSQL_5.equals(db)) {
				// MySQL 5.1
				System.out.println("getting MySQL 5 connection...");
				String database = "test";
				String url = "jdbc:mysql://localhost:3306/" + database;
				String userName = "root";
				String password = "";
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(url, userName, password);
			} else if (ORACLE_9I.equals(db)) {
				// Oracle 9i
				System.out.println("getting Oracle 9i connection...");
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String url = "jdbc:oracle:thin:@localhost:1521:MyDB";
				String user = "scott";
				String password = "tiger";
				con = DriverManager.getConnection(url, user, password);

				/*
				 * DatabaseMetaData dbmd = connection.getMetaData(); ResultSet
				 * result = dbmd.getCatalogs(); databases.removeAllElements();
				 * while(result.next()) {
				 * System.out.println(result.getString(1)); }
				 */
			}

			System.out.println("got connection = " + con);

		} catch (ClassNotFoundException e1) {
			System.out.println("Error1:" + e1.toString());
		} catch (SQLException e2) {
			System.out.println("Error2:" + e2.toString());
		} catch (Exception e3) {
			System.out.println("Error3:" + e3.toString());
		}
		return con;
	}

	public ArrayList getTableDetails(String db, String tablename, boolean fromDS) {
		Connection con = null;

		if (fromDS)
			con = DBConnection.getConnectionDS();
		else
			con = DBConnection.getConnection(db);

		return getTableDetails(con, tablename);

	}

	public ArrayList getTableDetails(Connection con, String tablename) {
		ArrayList list = new ArrayList();

		try {
			if (con != null) {
				PreparedStatement pstmt = con.prepareStatement("select * from "
						+ tablename);
				ResultSet result = pstmt.executeQuery();
				while (result.next()) {
					String res = result.getString(1) + "\t"
							+ result.getString(2) + "\t" + result.getString(3);
					if (res != null) {
						System.out.println(res);
						list.add(res);
					}
				}
			} else {
				System.err.println("No Database Connection available!\n");
			}
		} catch (Exception ex) {
			System.err.println("DB Error: " + ex.toString());
		} finally {
			try {
				con.close();
			} catch (Exception ex) {
				System.err.println("DB Error2: " + ex.toString());
			}
		}

		return list;
	}

	public static void main(String[] args) {

		DBConnection db = new DBConnection();

		// MySql 5.1
		db.getTableDetails(MYSQL_5, "EMPLOYEES", false);

		// Oracle 10g
		db.getTableDetails(ORACLE_10G, "EMPLOYEES", false);
		db.getTableDetails(ORACLE_10G, "COUNTRIES", false);
		db.getTableDetails(ORACLE_10G, "JOBS", false);
		db.getTableDetails(ORACLE_10G, "DEPARTMENTS", false);

		/*
		 * // Oracle 9i db.getTableDetails(ORACLE_9i, "EMP", false);
		 * db.getTableDetails(ORACLE_9i, "DEPT", false);
		 * db.getTableDetails(ORACLE_9i, "SALGRADE", false);
		 * db.getTableDetails(ORACLE_9i, "BONUS", false);
		 */

	}
}
