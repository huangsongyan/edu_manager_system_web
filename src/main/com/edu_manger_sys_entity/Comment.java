package com.edu_manger_sys_entity;

import java.util.Date;

public class Comment {
	
	/**
	 * 
	 * @通知公告评论类
	 * 
	 * @author hsy
	 */
	
	private int com_id ;
	private String comm_content;
	private int anc_id;
	private Date comm_date;
	private int stu_id;
	public int getCom_id() {
		return com_id;
	}
	public void setCom_id(int comId) {
		com_id = comId;
	}
	public String getComm_content() {
		return comm_content;
	}
	public void setComm_content(String commContent) {
		comm_content = commContent;
	}
	public int getAnc_id() {
		return anc_id;
	}
	public void setAnc_id(int ancId) {
		anc_id = ancId;
	}
	public Date getComm_date() {
		return comm_date;
	}
	public void setComm_date(Date commDate) {
		comm_date = commDate;
	}
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stuId) {
		stu_id = stuId;
	}
	
	
	

}
