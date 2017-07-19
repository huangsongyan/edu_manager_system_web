package com.edu_manger_sys_entity;

public class Attendance {
	/**
	 * @考勤类
	 * @author hsy
	 * 
	 */
	
	
	private  int attend_id;
	private int stu_id;
	private int sub_id;
	private String attend_date;
	private String attend_type;
	
	//便于获取名字
	private String stu_name;
	private String sub_name;
	
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stuName) {
		stu_name = stuName;
	}
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String subName) {
		sub_name = subName;
	}
	public int getAttend_id() {
		return attend_id;
	}
	public void setAttend_id(int attendId) {
		attend_id = attendId;
	}
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stuId) {
		stu_id = stuId;
	}
	public int getSub_id() {
		return sub_id;
	}
	public void setSub_id(int subId) {
		sub_id = subId;
	}
	public String getAttend_date() {
		return attend_date;
	}
	public void setAttend_date(String attendDate) {
		attend_date = attendDate;
	}
	public String getAttend_type() {
		return attend_type;
	}
	public void setAttend_type(String attendType) {
		attend_type = attendType;
	}
	
}
