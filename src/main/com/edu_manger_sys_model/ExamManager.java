package com.edu_manger_sys_model;

import com.edu_manger_sys_entity.ExampleInfo;
import com.edu_manger_sys_utils.Dbconn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author hsy
 * 
 * 考试信息
 * 
 * 
 */
public class ExamManager {
	
	
	private Connection conn;
	private PreparedStatement ps; 
	private Dbconn dbconn=new Dbconn();
	private ResultSet resultSet;
	private SubManager subManager = new SubManager();
	
	
	/**
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	public List<ExampleInfo> examInfo(int stu_id,int exam_type){
		List<ExampleInfo> list = null ;
		String sql ="SELECT * from examinfo,subject WHERE examinfo.sub_id = subject.sub_id and stu_id =? and exam_type = ?";
		try {
			list = new ArrayList<ExampleInfo>();
			conn =	dbconn.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1,stu_id);
			ps.setInt(2, exam_type);
			resultSet = ps.executeQuery();
			while(resultSet.next()){
				ExampleInfo exampleInfo = new ExampleInfo();
				exampleInfo.setExam_id(resultSet.getInt("exam_id"));
				exampleInfo.setStu_id(resultSet.getInt("stu_id"));
				exampleInfo.setSub_name(resultSet.getString("sub_name"));
				exampleInfo.setExam_time(resultSet.getString("exam_time"));
				exampleInfo.setExam_type(resultSet.getInt("exam_type"));
				exampleInfo.setExam_place(resultSet.getString("exam_place"));
				list.add(exampleInfo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			dbconn.closeAll(conn, ps, resultSet);
		}
		
		
		return list;
	}
}
