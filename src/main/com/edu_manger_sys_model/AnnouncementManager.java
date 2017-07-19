package com.edu_manger_sys_model;

import com.edu_manger_sys_entity.Announcement;
import com.edu_manger_sys_utils.Dbconn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class AnnouncementManager {
	private Dbconn dbconn=new Dbconn();
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	
	/**根据公告类型返回通知公告
	 * 1校内，
	 * 2院内，
	 * 3班内公告
	 * @author lenovo-yellow
	 * @param stu_id
	 * @param type
	 * @return
	 */
	public List<Announcement> queryAnnouncements(int type){
		String sql="SELECT * from announcement WHERE anc_type=? ORDER BY anc_date DESC";
		try {
			connection=dbconn.getConnection();
			preparedStatement=connection.prepareStatement(sql);
			switch (type) {
			case 3:
				preparedStatement.setString(1, "班内");
				break;
			case 2:
				preparedStatement.setString(1, "院内");
				break;
			case 1:
				preparedStatement.setString(1, "校内");
				break;
			}
			resultSet=preparedStatement.executeQuery();
			List<Announcement> announcements=new ArrayList<Announcement>();
			while(resultSet.next()){
				Announcement announcement=new Announcement();
				announcement.setAnc_id(resultSet.getInt("anc_id"));
				announcement.setAnc_title(resultSet.getString("anc_title"));
				announcement.setAnc_content(resultSet.getString("anc_content"));
				SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
				announcement.setAnc_date(dateFormat.format(resultSet.getDate("anc_date")));
				announcement.setAnc_publicer(resultSet.getString("anc_publicer"));
				announcement.setAnc_type(resultSet.getString("anc_type"));
				announcements.add(announcement);
			}
			return announcements;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
