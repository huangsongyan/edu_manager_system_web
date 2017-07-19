package com.edu_manger_sys_model;

import com.edu_manger_sys_entity.Student;
import com.edu_manger_sys_entity.Teacher;
import com.edu_manger_sys_utils.Dbconn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
	
	private Dbconn dbconn=new Dbconn();
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	/**
	 * @author yellow
	 * @param stu_no
	 * @param stu_pwd
	 * @return
	 */
	public Student studentInfo(String stu_no, String stu_pwd){
		//two table
//		SELECT * from student,classes WHERE student.cla_id=classes.cla_id AND stu_no=0104120649 AND stu_pwd=123456
//		1	0104120649	张三	男	2014-06-17	aaaaaa	13824123478	北京路	123456	1	1	语文	何勇军

		//three table
//		SELECT * from teacher,student,classes WHERE stu_no=0104120649 AND stu_pwd=123456 AND student.cla_id=classes.cla_id AND classes.tec_id=teacher.tec_id
//		1	0204120649	男	2014-06-04	13824123456	Mr何	654321	1	0104120649	张三	男	2014-06-17	aaaaaa	13824123478	北京路	123456	1	1	语文	1

		String sql="SELECT * from teacher,student,classes WHERE stu_no=? AND stu_pwd=? AND student.cla_id=classes.cla_id AND classes.tec_id=teacher.tec_id";
		try {
			connection=dbconn.getConnection();
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, stu_no);
			preparedStatement.setString(2, stu_pwd);
			resultSet=preparedStatement.executeQuery();
			Student student=null;
			while(resultSet.next()){
				/*resultSet.getString("stu_id");
				resultSet.getString("stu_no");
				resultSet.getString("stu_name");
				resultSet.getString("stu_sex");
				resultSet.getString("stu_birth");
				resultSet.getString("stu_pic");
				resultSet.getString("stu_phone");
				resultSet.getString("stu_address");
				resultSet.getString("stu_pwd");
				resultSet.getString("cla_name");
				resultSet.getString("cla_tec");*/
				
				student=new Student();
				student.setStu_id(Integer.parseInt(resultSet.getString("stu_id")));
				student.setStu_no(resultSet.getString("stu_no"));
				student.setStu_name(resultSet.getString("stu_name"));
				student.setStu_sex(resultSet.getString("stu_sex"));
				student.setStu_birth(resultSet.getDate("stu_birth"));
				student.setStu_pic(resultSet.getString("stu_pic"));
				student.setStu_phone(resultSet.getString("stu_phone"));
				student.setStu_address(resultSet.getString("stu_address"));
				student.setStu_pwd(resultSet.getString("stu_pwd"));
				student.setCla_name(resultSet.getString("cla_name"));
				student.setTec_name(resultSet.getString("tec_name"));
				student.setCla_id(Integer.parseInt(resultSet.getString("cla_id")));
				student.setStu_card(resultSet.getString("stu_card"));
				student.setStu_pfs(resultSet.getString("stu_pfs"));
			}
			return student;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 用来查询老师教的本班的所有学生
	 * @author lenovo-yellow
	 * @param tec_id
	 * @param cla_id
	 * @return
	 */
	public List<Student> queryStudents_tec(int tec_id , int cla_id){
		
//		SELECT * from distribute,student WHERE distribute.tec_id=1 AND distribute.cla_id=2 AND student.cla_id=distribute.cla_id
//		1	2	1	2	1	0104120649	张三	男	2014-06-17	aaaaaa	13824123478	北京路	123456	2
//		1	2	1	2	2	01651418	李四	男	2014-06-29	bbbb	1358498455	凤凰城	123456	2

		String sql="SELECT * from distribute,student WHERE distribute.tec_id=? AND distribute.cla_id=? AND student.cla_id=distribute.cla_id";
		try {
			connection=dbconn.getConnection();
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, tec_id);
			preparedStatement.setInt(2, cla_id);
			resultSet=preparedStatement.executeQuery();
			List<Student> list=new ArrayList<Student>();
			while(resultSet.next()){
				Student student=new Student();
				student.setStu_id(resultSet.getInt("stu_id"));
				student.setStu_name(resultSet.getString("stu_name"));
				student.setStu_pic(resultSet.getString("stu_pic"));
				list.add(student);
			}
			return list;	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 用来查询老师教的所有班级的所有学生
	 * @author lenovo-yellow
	 * @param tec_id
	 * @return
	 */
	public List<Student> queryAllStudents_tec(int tec_id){
		
//		SELECT * from distribute,student WHERE distribute.tec_id=1 AND distribute.cla_id=2 AND student.cla_id=distribute.cla_id
//		1	2	1	2	1	0104120649	张三	男	2014-06-17	aaaaaa	13824123478	北京路	123456	2
//		1	2	1	2	2	01651418	李四	男	2014-06-29	bbbb	1358498455	凤凰城	123456	2
		
		String sql="SELECT * from distribute,student WHERE distribute.tec_id=? AND distribute.cla_id=student.cla_id AND student.cla_id=distribute.cla_id";
		try {
			connection=dbconn.getConnection();
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, tec_id);
			resultSet=preparedStatement.executeQuery();
			List<Student> list=new ArrayList<Student>();
			while(resultSet.next()){
				Student student=new Student();
				student.setStu_id(resultSet.getInt("stu_id"));
				student.setStu_name(resultSet.getString("stu_name"));
				student.setStu_pic(resultSet.getString("stu_pic"));
				list.add(student);
			}
			return list;	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 学生查询教自己的所有老师
	 * @author lenovo-yellow
	 * @param cla_id
	 * @return
	 */
	public List<Teacher> queryTeachers(int cla_id){
		
//		SELECT * from teacher,distribute WHERE teacher.tec_id=distribute.tec_id AND distribute.cla_id=2
//		1	0204120649	男	2014-06-04	13824123456	Mr何	654321	1	2	1	2
//		2	020412305	男	2014-06-09	13854961	康海刚	654321	2	2	2	1

		String sql="SELECT * from teacher,distribute WHERE teacher.tec_id=distribute.tec_id AND distribute.cla_id=?";
		
		try {
			connection=dbconn.getConnection();
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, cla_id);
			resultSet=preparedStatement.executeQuery();
			List<Teacher> list=new ArrayList<Teacher>();
			while(resultSet.next()){
				Teacher teacher=new Teacher();
				teacher.setTec_id(resultSet.getInt("tec_id"));
				teacher.setTec_name(resultSet.getString("tec_name"));
				teacher.setTec_phone(resultSet.getString("tec_phone"));
				teacher.setTec_sex(resultSet.getString("tec_sex"));
				teacher.setTec_pic(resultSet.getString("tec_pic"));
				list.add(teacher);
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
	 * 用来查询老师教的指定班级的所有学生
	 * @author lenovo-yellow
	 * @param cla_id
	 * @return
	 */
	public List<Student> queryClassStudents_tec(int cla_id){
		
//		SELECT * from distribute,student WHERE distribute.tec_id=1 AND distribute.cla_id=2 AND student.cla_id=distribute.cla_id
//		1	2	1	2	1	0104120649	张三	男	2014-06-17	aaaaaa	13824123478	北京路	123456	2
//		1	2	1	2	2	01651418	李四	男	2014-06-29	bbbb	1358498455	凤凰城	123456	2
		
		String sql="SELECT * from student WHERE cla_id=?";
		try {
			connection=dbconn.getConnection();
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, cla_id);
			resultSet=preparedStatement.executeQuery();
			List<Student> list=new ArrayList<Student>();
			while(resultSet.next()){
				Student student=new Student();
				student.setStu_id(resultSet.getInt("stu_id"));
				student.setStu_name(resultSet.getString("stu_name"));
				student.setStu_pic(resultSet.getString("stu_pic"));
				list.add(student);
			}
			return list;	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 学生修改密码
	 * @author lenovo-yellow
	 * @param stu_no
	 * @param stu_pwd
	 * @return
	 */
	public int updateStu_pwd(String stu_no,String stu_pwd){
		int flag=0;
		String sql="update student set stu_pwd=? where stu_no=?";
		try {
			connection=dbconn.getConnection();
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, stu_pwd);
			preparedStatement.setString(2, stu_no);
			flag=preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag; 
	}
	
	
	public static void main(String[] args) {
		StudentManager student=new StudentManager();
		Student student2=student.studentInfo("0104120649", "123456");
		System.out.println("student--------->"+student2.getStu_birth());
	}   
}