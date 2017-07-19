package com.edu_manger_sys_utils;

import java.sql.*;

public class Dbconn {
	private Connection conn;
	public  Connection getConnection() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/edu_manager_system?characterEncoding=utf-8","root","root");
		} catch (ClassNotFoundException e) {
			System.out.println("找不到服务！！");
			e.printStackTrace();
		}
		return conn;
	}
	public void closeAll(Connection conn,Statement stat,ResultSet rs){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				if(stat!=null){
					try {
						stat.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}finally{
						if(conn!=null){
							try {
								conn.close();
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		}
	}
}
