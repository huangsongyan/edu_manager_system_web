package com.edu_manger_sys_model;

import com.edu_manger_sys_entity.Schedule;
import com.edu_manger_sys_utils.Dbconn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ScheduleManager {
	
	private Dbconn dbconn=new Dbconn();
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	/**
	 * 
	 * @author lenovo-yellow
	 * @param cla_id
	 * @param sch_day
	 * @return 某个班级的 星期几的 课程表
	 */
	public List<Schedule> getSchedule(int cla_id, int sch_day){
		
//		SELECT * from teacher,`subject`,`schedule` WHERE `schedule`.cla_id=2 AND `schedule`.sch_day=4 AND `schedule`.sub_id=`subject`.sub_id AND `schedule`.tec_id=teacher.tec_id
//		2	020412305	男	2014-06-09	13854961	康海刚	654321	2	数学	3	1	2	2	2	1-18	4	3	J3-404
//		1	0204120649	男	2014-06-04	13824123456	Mr何	654321	1	语文	2	2	1	1	2	1-16	4	7	S4-307

		String sql="SELECT * from teacher,`subject`,`schedule` WHERE `schedule`.cla_id=? AND `schedule`.sch_day=? AND `schedule`.sub_id=`subject`.sub_id AND `schedule`.tec_id=teacher.tec_id";
		try {
			connection=dbconn.getConnection();
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, cla_id);
			preparedStatement.setInt(2, sch_day);
			resultSet=preparedStatement.executeQuery();
			List<Schedule> list=new ArrayList<Schedule>();
			Schedule schedule=null;
			while(resultSet.next()){
				schedule=new Schedule();
				schedule.setSch_id(resultSet.getInt("sch_id"));
				schedule.setSub_name(resultSet.getString("sub_name"));
				schedule.setTec_name(resultSet.getString("tec_name"));
				schedule.setCla_id(cla_id);
				schedule.setSch_week(resultSet.getString("sch_week"));
				schedule.setSch_time(resultSet.getInt("sch_time"));
				schedule.setSch_place(resultSet.getString("sch_place"));
				schedule.setSch_day(sch_day);
				list.add(schedule);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			dbconn.closeAll(connection, preparedStatement, resultSet);
		}
		return null;
	}
	
	
	/**
	 * 
	 * @author lenovo-yellow
	 * @param cla_id
	 * @param sch_day
	 * @return 某个老师的 星期几的 课程表
	 */
	public List<Schedule> getSchedule_tec(int tec_id, int sch_day){
		
//		SELECT * from teacher,`subject`,`schedule` WHERE `schedule`.cla_id=2 AND `schedule`.sch_day=4 AND `schedule`.sub_id=`subject`.sub_id AND `schedule`.tec_id=teacher.tec_id
//		2	020412305	男	2014-06-09	13854961	康海刚	654321	2	数学	3	1	2	2	2	1-18	4	3	J3-404
//		1	0204120649	男	2014-06-04	13824123456	Mr何	654321	1	语文	2	2	1	1	2	1-16	4	7	S4-307
		
		String sql="SELECT * from teacher,`subject`,`schedule`,classes WHERE `schedule`.tec_id=? AND `schedule`.sch_day=? AND `schedule`.sub_id=`subject`.sub_id AND `schedule`.tec_id=teacher.tec_id AND classes.cla_id=`schedule`.cla_id";
		try {
			connection=dbconn.getConnection();
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, tec_id);
			preparedStatement.setInt(2, sch_day);
			resultSet=preparedStatement.executeQuery();
			List<Schedule> list=new ArrayList<Schedule>();
			Schedule schedule=null;
			while(resultSet.next()){
				schedule=new Schedule();
				schedule.setSch_id(resultSet.getInt("sch_id"));
				schedule.setSub_name(resultSet.getString("sub_name"));
				schedule.setTec_name(resultSet.getString("tec_name"));
				schedule.setCla_id(resultSet.getInt("cla_id"));
				schedule.setCla_name(resultSet.getString("cla_name"));
				schedule.setSch_week(resultSet.getString("sch_week"));
				schedule.setSch_time(resultSet.getInt("sch_time"));
				schedule.setSch_place(resultSet.getString("sch_place"));
				schedule.setSch_day(sch_day);
				list.add(schedule);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			dbconn.closeAll(connection, preparedStatement, resultSet);
		}
		return null;
	}
	
}
