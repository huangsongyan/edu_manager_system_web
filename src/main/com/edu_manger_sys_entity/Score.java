package com.edu_manger_sys_entity;

public class Score {
	private int sco_id;//成绩id
	private String sub_name;//课程名称
	private int semester;	//学期
	private int sub_credit;//学分
	private int sco_count; //课程分数
	
	
	
	/**
	 * 
	 * @ get，set方法
	 * @author hsy
	 * @return
	 */
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String subName) {
		sub_name = subName;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public int getSub_credit() {
		return sub_credit;
	}
	public void setSub_credit(int subCredit) {
		sub_credit = subCredit;
	}
	public int getSco_count() {
		return sco_count;
	}
	public void setSco_count(int scoCount) {
		sco_count = scoCount;
	}
	
	
}
