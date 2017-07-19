package com.edu_manger_sys_servlet;

import com.edu_manger_sys_entity.Schedule;
import com.edu_manger_sys_model.ScheduleManager;
import com.edu_manger_sys_utils.JsonUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class searchSchedule extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public searchSchedule() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 * 
	 * 传入
	 * cla_id
	 * sch_day
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ScheduleManager scheduleManager=new ScheduleManager();
		int cla_id=Integer.parseInt(request.getParameter("cla_id"));
		int sch_day=Integer.parseInt(request.getParameter("sch_day"));
		List<Schedule> list=scheduleManager.getSchedule(cla_id, sch_day);
		JsonUtil jsonUtil = new JsonUtil();
		String result = jsonUtil.toJson(list);
		out.print(result);
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ScheduleManager scheduleManager=new ScheduleManager();
		int cla_id=Integer.parseInt(request.getParameter("cla_id"));
		int sch_day=Integer.parseInt(request.getParameter("sch_day"));
		List<Schedule> list=scheduleManager.getSchedule(cla_id, sch_day);
		JsonUtil jsonUtil = new JsonUtil();
		String result = jsonUtil.toJson(list);
		out.print(result);
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
