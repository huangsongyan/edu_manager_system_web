package com.edu_manger_sys_entity;

import java.util.Date;

public class Student {
	/**
	 *@学生类
	 * 
	 *@author hsy 
	 */
	
	
	
	private int stu_id;//学生id
	private String stu_no;//学号
	private String stu_name;//学生姓名
	private String stu_sex;//性别
	private Date stu_birth;//生日
	private String stu_pic;//头像地址
	private String stu_phone;//手机号码
	private String stu_address;//家庭地址
	private String stu_pwd;//学生密码
	private String cla_name;
	private String tec_name;
	private int cla_id;
	private String stu_card;//身份证
	private String stu_pfs;//专业

	/**
	 * 
	 * @ get，set方法
	 * @author hsy
	 * @return
	 */
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stuId) {
		stu_id = stuId;
	}
	public String getStu_no() {
		return stu_no;
	}
	public void setStu_no(String stuNo) {
		stu_no = stuNo;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stuName) {
		stu_name = stuName;
	}
	public int getCla_id() {
		return cla_id;
	}
	public void setCla_id(int claId) {
		cla_id = claId;
	}
	public String getStu_sex() {
		return stu_sex;
	}
	public void setStu_sex(String stuSex) {
		stu_sex = stuSex;
	}
	public Date getStu_birth() {
		return stu_birth;
	}
	public String getStu_card() {
		return stu_card;
	}
	public void setStu_card(String stuCard) {
		stu_card = stuCard;
	}
	public String getStu_pfs() {
		return stu_pfs;
	}
	public void setStu_pfs(String stuPfs) {
		stu_pfs = stuPfs;
	}
	public void setStu_birth(Date stuBirth) {
		stu_birth = stuBirth;
	}
	public String getStu_pic() {
		return stu_pic;
	}
	public void setStu_pic(String stuPic) {
		stu_pic = stuPic;
	}
	public String getStu_phone() {
		return stu_phone;
	}
	public void setStu_phone(String stuPhone) {
		stu_phone = stuPhone;
	}
	public String getStu_address() {
		return stu_address;
	}
	public void setStu_address(String stuAddress) {
		stu_address = stuAddress;
	}
	public String getStu_pwd() {
		return stu_pwd;
	}
	public void setStu_pwd(String stuPwd) {
		stu_pwd = stuPwd;
	}
	
	public String getCla_name() {
		return cla_name;
	}
	public void setCla_name(String claName) {
		cla_name = claName;
	}
	public String getTec_name() {
		return tec_name;
	}
	public void setTec_name(String tecName) {
		tec_name = tecName;
	}
	
	
	
}
