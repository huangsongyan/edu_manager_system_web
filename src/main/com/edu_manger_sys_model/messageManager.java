package com.edu_manger_sys_model;

import com.edu_manger_sys_entity.Message;
import com.edu_manger_sys_utils.Dbconn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class messageManager {

	private Dbconn dbconn=new Dbconn();
	private Connection connection;
	private ResultSet resultSet;
	private PreparedStatement preparedStatement;


	/**
	 * 查询学生和对应的老师的对话
	 * @author lenovo-yellow
	 * @param stu_id
	 * @param tec_id
	 * @return
	 */
	public List<Message> queeyMessage(int stu_id, int tec_id){

		//		SELECT * from message WHERE stu_id=1 AND tec_id=2
		//		1	老师你好	2014-06-25 12:10:41	1	2	1
		//		2	学生1你也好	2014-06-25 15:11:59	1	2	2
		//		3	请问老师问题可以吗？	2014-06-26 18:12:06	1	2	1
		//		4	可以呀，欢迎来问	2014-06-27 17:12:13	1	2	2

		String sql="SELECT * from message WHERE stu_id=? AND tec_id=? ORDER BY msg_time";
		List<Message> messages=new ArrayList<Message>();

		try {
			connection=dbconn.getConnection();
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, stu_id);
			preparedStatement.setInt(2, tec_id);
			resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				Message message=new Message();
				message.setMsg_id(resultSet.getInt("msg_id"));
				message.setMsg_content(resultSet.getString("msg_content"));
				message.setMsg_date(resultSet.getString("msg_time"));
				message.setTec_id(resultSet.getInt("tec_id"));
				message.setStu_id(resultSet.getInt("stu_id"));
				message.setMsg_flag(resultSet.getInt("msg_flag"));
				messages.add(message);
			}
			return messages;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			dbconn.closeAll(connection, preparedStatement, resultSet);
		}
		return null;
	}

	/**
	 * 插入消息，最后一个参数标记是哪个人发言
	 * @author lenovo-yellow
	 * @param stu_id
	 * @param tec_id
	 * @param flag
	 * @return
	 */
	public int insertMessage(String content,int stu_id,int tec_id,int flag){

		//		INSERT INTO message(msg_content,msg_time,stu_id,tec_id,msg_flag) VALUES('问题是','2014-6-20','2','2','1')
		//		flag：	1----->学生发言
		//		flag：	2----->老师发言

		String sql="INSERT INTO message(msg_content,msg_time,stu_id,tec_id,msg_flag) VALUES(?,?,?,?,?)";
		int result=0;
		try {
			connection=dbconn.getConnection();
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, content);
			/*Calendar ca = Calendar.getInstance();
			int year = ca.get(Calendar.YEAR);//获取年份
			int month=ca.get(Calendar.MONTH);//获取月份 
			int day=ca.get(Calendar.DATE);//获取日
			Date date=new Date(year-1900, month, day);
			preparedStatement.setDate(2, date);*/
			SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			preparedStatement.setString(2, dateFormat.format(new Date()));
			preparedStatement.setInt(3, stu_id);
			preparedStatement.setInt(4, tec_id);
			preparedStatement.setInt(5, flag);
			result=preparedStatement.executeUpdate();
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			dbconn.closeAll(connection, preparedStatement, resultSet);
		}
		return result;
	}



	public static void main(String[] args) {
		messageManager manager=new messageManager();
		System.out.println(manager.queeyMessage(1, 2).get(1).getMsg_content());
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(dateFormat.format(new Date()));
		manager.insertMessage("哈哈，学生2你真幽默", 2, 2, 2);
	}
}
