package com.edu_manger_sys_entity;

public class Schedule {
	private int sch_id;//课程id
	private String sub_name;//科目id
	private String tec_name;//教师id
	private int cla_id;//班级id
	private String cla_name;
	private String sch_week;// 上课周段
	private int sch_time;//上课时间段
	private int sch_day;//星期几，用1-7表示
	private String sch_place;//上课地点
	
	/**
	 * 
	 * @ get，set方法
	 * @author hsy
	 * @return
	 */
	
	public int getSch_id() {
		return sch_id;
	}
	public String getCla_name() {
		return cla_name;
	}
	public void setCla_name(String claName) {
		cla_name = claName;
	}
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String subName) {
		sub_name = subName;
	}
	public String getTec_name() {
		return tec_name;
	}
	public void setTec_name(String tecName) {
		tec_name = tecName;
	}
	public void setSch_id(int schId) {
		sch_id = schId;
	}
	public int getCla_id() {
		return cla_id;
	}
	public void setCla_id(int claId) {
		cla_id = claId;
	}
	public String getSch_week() {
		return sch_week;
	}
	public void setSch_week(String schWeek) {
		sch_week = schWeek;
	}
	public int getSch_time() {
		return sch_time;
	}
	public void setSch_time(int schTime) {
		sch_time = schTime;
	}
	public int getSch_day() {
		return sch_day;
	}
	public void setSch_day(int schDay) {
		sch_day = schDay;
	}
	public String getSch_place() {
		return sch_place;
	}
	public void setSch_place(String schPlace) {
		sch_place = schPlace;
	}
}
