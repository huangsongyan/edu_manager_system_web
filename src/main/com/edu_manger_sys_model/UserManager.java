package com.edu_manger_sys_model;

import com.edu_manger_sys_entity.Student;
import com.edu_manger_sys_utils.Dbconn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserManager {
	
	private static Dbconn dbconn=new Dbconn();
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;
	
	/**
	 * 登录操作
	 * @param user_name
	 * @param user_pwd
	 * @param role_id
	 * @return
	 */
	public Object loginUser(String user_name,String user_pwd,int role_id){
		
		String user_id="select user_id from user where user_name = ? and user_pwd = ? and role_id= ?";
		String sql = null;
		if(role_id == 1){
			sql = "select * from student where user_id = "+user_id;
		}else if(role_id == 2 ){
			
		}
		
		try {
			connection=dbconn.getConnection();
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, user_name);
			preparedStatement.setString(2, user_pwd);
			preparedStatement.setInt(3, role_id);
			resultSet=preparedStatement.executeQuery();
			if(resultSet.next()){
				if(role_id == 1){
					
					Student student = new Student();
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
