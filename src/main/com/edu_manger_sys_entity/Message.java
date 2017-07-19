package com.edu_manger_sys_entity;

public class Message {
	
	private int msg_id;
	private String msg_content;
	private String msg_date;
	private int stu_id;
	private int tec_id;
	private int msg_flag;//1:学生	2：老师

	public int getMsg_flag() {
		return msg_flag;
	}
	public void setMsg_flag(int msgFlag) {
		msg_flag = msgFlag;
	}
	public int getMsg_id() {
		return msg_id;
	}
	public void setMsg_id(int msgId) {
		msg_id = msgId;
	}
	public String getMsg_content() { 
		return msg_content;
	}
	public void setMsg_content(String msgContent) {
		msg_content = msgContent;
	}

	public String getMsg_date() {
		return msg_date;
	}
	public void setMsg_date(String msgDate) {
		msg_date = msgDate;
	}
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stuId) {
		stu_id = stuId;
	}
	public int getTec_id() {
		return tec_id;
	}
	public void setTec_id(int tecId) {
		tec_id = tecId;
	}
	
	
	
}
