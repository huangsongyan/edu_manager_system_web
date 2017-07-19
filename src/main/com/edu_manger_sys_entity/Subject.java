package com.edu_manger_sys_entity;

public class Subject {
	private int sub_id;//科目id
	private String sub_name;//科目名称
	private int sub_credit;//学分
	
	
	/**
	 * 
	 * @ get，set方法
	 * @author hsy
	 * @return
	 */
	public int getSub_id() {
		return sub_id;
	}
	public void setSub_id(int subId) {
		sub_id = subId;
	}
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String subName) {
		sub_name = subName;
	}
	public int getSub_credit() {
		return sub_credit;
	}
	public void setSub_credit(int subCredit) {
		sub_credit = subCredit;
	}
	
	
	
}
