package com.edu_manger_sys_model;

import com.edu_manger_sys_entity.Classes;
import com.edu_manger_sys_entity.Teacher;
import com.edu_manger_sys_utils.Dbconn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeacherManager {
	
	private Dbconn dbconn=new Dbconn();
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

	/**
	 * 
	 * @author lenovo-yellow
	 * @param tec_no
	 * @param tec_pwd
	 * @return
	 */
	public Teacher teacherLogin(String tec_no,String tec_pwd){
		
//		SELECT * from teacher,classes WHERE tec_no=0204120649 AND tec_pwd=654321 AND teacher.tec_id=classes.tec_id
//		1	0204120649	男	2014-06-04	13824123456	Mr何	654321	1	语文	1

		String sql="SELECT * from teacher,classes WHERE tec_no=? AND tec_pwd=?";
		try {
			connection=dbconn.getConnection();
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, tec_no);
			preparedStatement.setString(2, tec_pwd);
			resultSet=preparedStatement.executeQuery();
			Teacher teacher=null;
			while(resultSet.next()){
				/*resultSet.getInt("tec_id");
				resultSet.getString("tec_no");
				resultSet.getString("tec_sex");
				resultSet.getString("tec_birth");
				resultSet.getString("tec_phone");
				resultSet.getString("tec_name");
				resultSet.getString("tec_pwd");*/
				teacher=new Teacher();
				teacher.setTec_id(resultSet.getInt("tec_id"));
				teacher.setTec_no(resultSet.getString("tec_no"));
				teacher.setTec_sex(resultSet.getString("tec_sex"));
				teacher.setTec_birth(resultSet.getDate("tec_birth"));
				teacher.setTec_phone(resultSet.getString("tec_phone"));
				teacher.setTec_name(resultSet.getString("tec_name"));
				teacher.setTec_pwd(resultSet.getString("tec_pwd"));
				teacher.setTec_pic(resultSet.getString("tec_pic"));
			}
			return teacher;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 查询这个老师所教的所有班级
	 * @author lenovo-yellow
	 * @param tec_id
	 * @return
	 */
	public List<Classes> queryClasses(int tec_id){
		
//		SELECT * FROM classes,distribute WHERE distribute.tec_id=1 AND distribute.cla_id=classes.cla_id
//		2	12网编3	2	2	2	2	1

		String sql="SELECT * FROM classes,distribute WHERE distribute.tec_id=? AND distribute.cla_id=classes.cla_id";
		
		try {
			connection=dbconn.getConnection();
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, tec_id);
			resultSet=preparedStatement.executeQuery();
			List<Classes> list=new ArrayList<Classes>();
			while(resultSet.next()){
				Classes classes=new Classes();
				classes.setCla_id(resultSet.getInt("cla_id"));
				classes.setCla_name(resultSet.getString("cla_name"));
				list.add(classes);
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
	 * 教师修改密码
	 * @author lenovo-yellow
	 * @param stu_no
	 * @param stu_pwd
	 * @return
	 */
	public int updateTec_pwd(String tec_pwd,String tec_no){
		int flag=0;
		String sql="update teacher set tec_pwd=? where tec_no=?";
		try {
			connection=dbconn.getConnection();
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, tec_pwd);
			preparedStatement.setString(2, tec_no);
			flag=preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag; 
	}
}
