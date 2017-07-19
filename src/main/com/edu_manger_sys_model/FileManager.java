package com.edu_manger_sys_model;

import com.edu_manger_sys_entity.File;
import com.edu_manger_sys_utils.Dbconn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileManager {
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
	
	
	public List<File> stuFileList(int stu_id,int file_uploader){
		List<File> list = null ;
		String sql ="SELECT * FROM file WHERE stu_id = ? and file_uploader = ?";
		try {
			list = new ArrayList<File>();
			conn =	dbconn.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1,stu_id);
			ps.setInt(2, file_uploader);
			resultSet = ps.executeQuery();
			while(resultSet.next()){
				File file = new File();
				file.setFile_id(resultSet.getInt("file_id"));
				file.setFile_name(resultSet.getString("file_name"));
				file.setFile_url(resultSet.getString("file_url"));
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				String date = format.format(resultSet.getDate("file_date"));
				System.out.println("date"+date);
				file.setFile_date(date);
				file.setStu_id(resultSet.getInt("stu_id"));
				file.setTec_id(resultSet.getInt("tec_id"));
				file.setFile_uploader(resultSet.getInt("file_uploader"));
				list.add(file);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			dbconn.closeAll(conn, ps, resultSet);
		}
		return list;
	}
	
	public int uploadStuFile(String file_name,String file_url,int stu_id,int tec_id,int file_uploader){
		String sql ="INSERT INTO file(file_name,file_date,file_url,stu_id,tec_id,file_uploader) VALUES (?,?,?,?,?,?);";
		int result=0;
		try {
			conn=dbconn.getConnection();
			ps=conn.prepareStatement(sql);
			SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
			ps.setString(1, file_name);
			ps.setString(2, dateFormat.format(new Date()));
			ps.setString(3, file_url);
			ps.setInt(4,stu_id);
			ps.setInt(5,tec_id);
			ps.setInt(6, file_uploader);
		
			result=ps.executeUpdate();
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			dbconn.closeAll(conn, ps, resultSet);
		}
		return result;
	}
	
	public int uploadTecFile(String file_name,String file_url,int stu_id,int tec_id,int file_uploader){
		String sql ="INSERT INTO file(file_name,file_date,file_url,stu_id,tec_id,file_uploader) VALUES (?,?,?,?,?,?);";
		int result=0;
		try {
			conn=dbconn.getConnection();
			ps=conn.prepareStatement(sql);
			SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
			ps.setString(1, file_name);
			ps.setString(2, dateFormat.format(new Date()));
			ps.setString(3, file_url);
			ps.setInt(4,stu_id);
			ps.setInt(5,tec_id);
			ps.setInt(6, file_uploader);
		
			result=ps.executeUpdate();
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			dbconn.closeAll(conn, ps, resultSet);
		}
		return result;
	}
	
	
	
	public List<File> tecFileList(int stu_id,int file_uploader){
		List<File> list = null ;
		String sql ="SELECT * FROM file WHERE stu_id = ? and file_uploader = ?";
		try {
			list = new ArrayList<File>();
			conn =	dbconn.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1,stu_id);
			ps.setInt(2, file_uploader);
			resultSet = ps.executeQuery();
			while(resultSet.next()){
				File file = new File();
				file.setFile_id(resultSet.getInt("file_id"));
				file.setFile_name(resultSet.getString("file_name"));
				file.setFile_url(resultSet.getString("file_url"));
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				String date = format.format(resultSet.getDate("file_date"));
				System.out.println("date"+date);
				file.setFile_date(date);
				file.setStu_id(resultSet.getInt("stu_id"));
				file.setTec_id(resultSet.getInt("tec_id"));
				file.setFile_uploader(resultSet.getInt("file_uploader"));
				list.add(file);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			dbconn.closeAll(conn, ps, resultSet);
		}
		return list;
	}
	
	public static void main(String[] args) {
		FileManager manager = new FileManager();
		manager.uploadStuFile("asdasd","/upload",1,2,2);
	}
}
