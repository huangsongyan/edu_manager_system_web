package com.edu_manger_sys_model;

import com.edu_manger_sys_entity.Score;
import com.edu_manger_sys_entity.Subject;
import com.edu_manger_sys_utils.Dbconn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ScoreManager {
	private Connection conn;
	private PreparedStatement ps; 
	private Dbconn dbconn=new Dbconn();
	private ResultSet resultSet;
	private SubManager subManager = new SubManager();
	/**
	 * 根据学生stu_id,学期date查成绩
	 * @param stu_id
	 * @return List<Score>
	 */
	
	public List<Score> searchScore(int stu_id,int semester){
		List<Score> list =null;
		String sql = "select * from score where stu_id = ? and semester = ?";
		try {
			list = new ArrayList<Score>();
			conn =	dbconn.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1,stu_id);
			ps.setInt(2, semester);
			resultSet = ps.executeQuery();
			while(resultSet.next()){
				Score score = new Score();
				score.setSco_count(resultSet.getInt("sco_count"));
				int id =resultSet.getInt("sub_id");
				System.out.println("id"+id);
				Subject subject = subList(id);
				score.setSub_name(subject.getSub_name());
				score.setSub_credit(subject.getSub_credit());
				score.setSemester(resultSet.getInt("semester"));
				list.add(score);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			dbconn.closeAll(conn, ps, resultSet);
		}
		return list;
		
	}
	
	
	

	/**
	 * 根据科目sub_id查成绩
	 * @param sub_id
	 * @return 
	 */
	
	public Subject subList(int sub_id){
		Subject subject = null;
		String sql ="select * from subject where sub_id = ?";
		ResultSet resultSet = null;
		try {
			conn =	dbconn.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1,sub_id);
			resultSet = ps.executeQuery();
			while(resultSet.next()){
				subject = new Subject();
				subject.setSub_name(resultSet.getString("sub_name"));
				subject.setSub_credit(resultSet.getInt("sub_credit"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			dbconn.closeAll(conn, ps, resultSet);
		}
			
		
		return subject;
	}
	
	
	
	public static void main(String[] args) {
		
		ScoreManager scoreManager = new ScoreManager();
		List<Score> list =scoreManager.searchScore(1,1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getSub_name());
		}
	
	}
}
