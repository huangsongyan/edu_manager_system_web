package com.edu_manger_sys_model;

import com.edu_manger_sys_entity.Subject;
import com.edu_manger_sys_utils.Dbconn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SubManager {
	
	
	private Connection conn;
	private PreparedStatement ps; 
	private Dbconn dbconn=new Dbconn();
	private ResultSet resultSet;
	
	
	/**
	 * 根据科目sub_id查成绩
	 * @param sub_id
	 * @return 
	 */
	
	public Subject subList(int sub_id){
		Subject subject = null;
		String sql ="select * from subject where sub_id = ?";
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
		SubManager subManager = new SubManager();
		Subject subject = subManager.subList(1);
		System.out.println(subject.getSub_name());
	}
}
