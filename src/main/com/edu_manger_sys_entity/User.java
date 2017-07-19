package com.edu_manger_sys_entity;

public class User {
	private int	user_id;//用户id	
	private String user_name;//用户名
	private String user_pwd;//密码
	private int role_id;//角色id
	
	
	/**
	 * 
	 * @return
	 */
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int userId) {
		user_id = userId;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String userName) {
		user_name = userName;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String userPwd) {
		user_pwd = userPwd;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int roleId) {
		role_id = roleId;
	}
	
	
}
