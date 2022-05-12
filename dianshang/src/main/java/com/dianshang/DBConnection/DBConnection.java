package com.dianshang.DBConnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	public static final String url = "jdbc:mysql://localhost:3306/world";
	public static final String user = "root";
	public static final String password = "123456";

	public static Connection GetConnection() {
		Connection con = null; //qing 0
		Statement state1 = null;
		Statement state2 = null;
		Statement state3 = null;
		PreparedStatement perparedstate = null;
		CallableStatement callablestate = null;
		ResultSet resultSet = null;
		ResultSet resultSet1 = null;
		ResultSet resultSet2 = null;
		try {
			//Class.forName(url); step 1  driver.manager.restitoin
			con = (Connection) DriverManager.getConnection(url, user, password);
			System.out.println("connected to database siccessfully !");
			// type 1 DDL
//			state1 = con.createStatement();
//			String statementsqlDDL = "CREATE TABLE  users(id int,username VARCHAR(30))";
//			state.execute(statementsqlDDL);

			// type 2 DML

//			String statementsqlDML = "insert into  users(id,username) values(2,'hahaha');";
//			state2.execute(statementsqlDML);
//			state2=con.createStatement();
//			state2.executeUpdate(statementsqlDML);

			// type 3 DML for retrieve data
			String statementsqlDMLforreturn = "select * from users ;";
			state3 = con.createStatement();
			resultSet1 = state3.executeQuery(statementsqlDMLforreturn);
//			while (resultSet1.next()) {
//				System.out.println(resultSet1.getInt("id") + " " + resultSet1.getString("username") + " ");
//			}
			// preparedstatement  SQL injection (?)
			String preparedstatementsql = "select * from users where id=?";
			perparedstate = con.prepareStatement(preparedstatementsql);
			perparedstate.setInt(1, 2);
			resultSet = perparedstate.executeQuery();

//			while (resultSet.next()) {
//				System.out.println(resultSet.getString("username") + " ");
//			}
			
			// callablestatement  call the stored procedures  must have {}
			String callablesql = "{call users()}";
			callablestate = con.prepareCall(callablesql);
			resultSet2 = callablestate.executeQuery();
			while (resultSet2.next()) {
				System.out.println(resultSet2.getString("username") + " ");
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}

//		try(con =(Connection) DriverManager.getConnection(url,user,password)){
//			System.out.println("cs");
//		}catch(SQLException e) {
//			System.out.println(e.getMessage());
//		}

		return con;
	}

}
