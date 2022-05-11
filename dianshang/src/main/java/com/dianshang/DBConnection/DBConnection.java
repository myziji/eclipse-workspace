package com.dianshang.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBConnection {
	public static final String url = "jdbc:mysql://localhost:3306/world";
	public static final String user = "root";
	public static final String password = "123456";
	public static Connection GetConnection()   {
		Connection con = null;
		try {
			
			con = (Connection) DriverManager.getConnection(url, user, password);
			System.out.println("connected to database siccessfully !");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}finally{
			if(con != null) {
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
