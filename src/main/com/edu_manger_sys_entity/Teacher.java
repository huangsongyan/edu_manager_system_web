package com.edu_manger_sys_entity;

import java.util.Date;

public class Teacher {
	private int tec_id;//教师id
	private String tec_no;//教师编号
	private String tec_sex;//教师性别
	private Date tec_birth;//教师生日
	private String tec_phone;//联系电话
	private String tec_name;//教师姓名
	private String tec_pic;//教师头像
	private String tec_pwd;//密码
	
	/**
	 *@get,set方法
	 * @author hsy
	 */
	
	public int getTec_id() {
		return tec_id;
	}
	public void setTec_id(int tecId) {
		tec_id = tecId;
	}
	public String getTec_no() {
		return tec_no;
	}
	public void setTec_no(String tecNo) {
		tec_no = tecNo;
	}
	public String getTec_sex() {
		return tec_sex;
	}
	public void setTec_sex(String tecSex) {
		tec_sex = tecSex;
	}
	public Date getTec_birth() {
		return tec_birth;
	}
	public void setTec_birth(Date tecBirth) {
		tec_birth = tecBirth;
	}
	public String getTec_pic() {
		return tec_pic;
	}
	public void setTec_pic(String tecPic) {
		tec_pic = tecPic;
	}
	public String getTec_phone() {
		return tec_phone;
	}
	public void setTec_phone(String tecPhone) {
		tec_phone = tecPhone;
	}
	public String getTec_name() {
		return tec_name;
	}
	public void setTec_name(String tecName) {
		tec_name = tecName;
	}
	public String getTec_pwd() {
		return tec_pwd;
	}
	public void setTec_pwd(String tecPwd) {
		tec_pwd = tecPwd;
	}
	
}
