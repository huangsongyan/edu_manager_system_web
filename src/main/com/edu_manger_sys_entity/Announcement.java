package com.edu_manger_sys_entity;

public class Announcement {
	
	/**
	 * 
	 * @通知广告类
	 * 
	 * @author hsy
	 */
	
	private int anc_id;
	private String anc_title;
	private String anc_content;
	private String anc_date;
	private String anc_publicer;
	private String anc_type;
	public int getAnc_id() {
		return anc_id;
	}
	public void setAnc_id(int ancId) {
		anc_id = ancId;
	}
	public String getAnc_title() {
		return anc_title;
	}
	public void setAnc_title(String ancTitle) {
		anc_title = ancTitle;
	}
	public String getAnc_content() {
		return anc_content;
	}
	public void setAnc_content(String ancContent) {
		anc_content = ancContent;
	}

	public String getAnc_date() {
		return anc_date;
	}
	public void setAnc_date(String ancDate) {
		anc_date = ancDate;
	}
	public String getAnc_publicer() {
		return anc_publicer;
	}
	public void setAnc_publicer(String ancPublicer) {
		anc_publicer = ancPublicer;
	}
	public String getAnc_type() {
		return anc_type;
	}
	public void setAnc_type(String ancType) {
		anc_type = ancType;
	}
	
	
	
}
