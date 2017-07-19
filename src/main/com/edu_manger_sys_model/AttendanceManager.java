package com.edu_manger_sys_model;

import com.edu_manger_sys_entity.Attendance;
import com.edu_manger_sys_utils.Dbconn;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class AttendanceManager {
	
	private Dbconn dbconn=new Dbconn();
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	
	/**
	 * 如何结果不是0，表示插入成功
	 * @author lenovo-yellow
	 * @param stu_id
	 * @param sub_id
	 * @param attend_type 1:旷课     2：迟到     3：早退	4：请假
	 * @return
	 */
	@SuppressWarnings("deprecation")
	public int insertAttendance(int stu_id,int tec_id,int attend_type){
//		由学生id和老师id查询科目：SELECT sub_id from student,distribute WHERE student.stu_id=1 AND distribute.tec_id=1 AND student.cla_id=distribute.cla_id
//		INSERT INTO `attendance` (stu_id,sub_id,attend_date,attend_type) VALUES ( '1', '1', '2014-06-20', '旷课');
		
//		上面两句合并
//		
		String sql="INSERT INTO `attendance` (stu_id,sub_id,attend_date,attend_type) VALUES (?, (SELECT sub_id from student,distribute WHERE student.stu_id=? AND distribute.tec_id=? AND student.cla_id=distribute.cla_id),?, ?)";
		
		try {
			connection = dbconn.getConnection();
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, stu_id);
			preparedStatement.setInt(2, stu_id);
			preparedStatement.setInt(3, tec_id);
			Calendar ca = Calendar.getInstance();
		      int year = ca.get(Calendar.YEAR);//获取年份
		     int month=ca.get(Calendar.MONTH);//获取月份 
		     int day=ca.get(Calendar.DATE);//获取日
		     Date date=new Date(year-1900, month, day);
			preparedStatement.setDate(4, date);
			switch (attend_type) {
			case 1:
				preparedStatement.setString(5, "旷课");
				break;
			case 2:
				preparedStatement.setString(5, "迟到");
				break;
			case 3:
				preparedStatement.setString(5, "早退");
				break;
			case 4:
				preparedStatement.setString(5, "请假");
				break;
			}
			int i = preparedStatement.executeUpdate();
			return i;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	
	/**
	 * 查询某个学生的所有考勤记录
	 * @author lenovo-yellow
	 * @param stu_id
	 * @return
	 */
	public List<Attendance> queryAttendance(int stu_id){
		
//		SELECT * from attendance WHERE stu_id=1 AND sub_id=1
//		SELECT * from attendance,student,`subject` WHERE attendance.stu_id=1 AND attendance.sub_id=1 AND student.stu_id=attendance.stu_id AND `subject`.sub_id=attendance.sub_id
//		1	1	1	2014-06-18	迟到
//		3	1	1	2014-06-20	旷课

		String sql="SELECT * from attendance,student,`subject` WHERE attendance.stu_id=? AND student.stu_id=attendance.stu_id AND `subject`.sub_id=attendance.sub_id";
		try {
			connection = dbconn.getConnection();
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, stu_id);
//			preparedStatement.setInt(2, sub_id);
			resultSet=preparedStatement.executeQuery();
			List<Attendance> attendances=new ArrayList<Attendance>();
			while(resultSet.next()){
				Attendance attendance=new Attendance();
				attendance.setAttend_id(resultSet.getInt("attend_id"));
				attendance.setStu_id(resultSet.getInt("stu_id"));
				attendance.setSub_id(resultSet.getInt("sub_id"));
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				attendance.setAttend_date(format.format(resultSet.getDate("attend_date")));
				attendance.setAttend_type(resultSet.getString("attend_type"));
				attendance.setStu_name(resultSet.getString("stu_name"));
				attendance.setSub_name(resultSet.getString("sub_name"));
				attendances.add(attendance);
			}
			return attendances;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			dbconn.closeAll(connection, preparedStatement, resultSet);
		}
		
		return null;
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		AttendanceManager attendanceManager=new AttendanceManager();
		Calendar ca = Calendar.getInstance();
	      int year = ca.get(Calendar.YEAR);//获取年份
	     int month=ca.get(Calendar.MONTH);//获取月份 
	     int day=ca.get(Calendar.DATE);//获取日
	     int minute=ca.get(Calendar.MINUTE);//分 
	     int hour=ca.get(Calendar.HOUR);//小时 
	     int second=ca.get(Calendar.SECOND);//秒
	     int WeekOfYear = ca.get(Calendar.DAY_OF_WEEK); 
	      
	      
	      System.out.println("用Calendar.getInstance().getTime()方式显示时间: " + ca.getTime());
	      System.out.println("用Calendar获得日期是：" + year +"年"+ month +"月"+ day + "日");
	      
	      System.out.println("用Calendar获得时间是：" + hour +"时"+ minute +"分"+ second +"秒");
	      System.out.println(WeekOfYear);//显示今天是一周的第几天（我做的这个例子正好是周二，故结果显示2，如果你再周6运行，那么显示6）
	      /*Date date=new Date(year-1900, month, day);
	      System.out.println(date);*/
	}

}
