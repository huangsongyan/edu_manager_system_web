package com.edu_manger_sys_servlet;


import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class uploadServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		if (isMultipart)
			try {
				FileItemFactory factory = new DiskFileItemFactory();
				ServletFileUpload upload = new ServletFileUpload(factory);
				List<FileItem> items = upload.parseRequest(request);
				File dir = new File(request.getSession().getServletContext().getRealPath("/WEB-INF/upload"));
				//创建目录
				dir.mkdir();
				for (FileItem item : items)
					if (item.isFormField())
						System.out.println(item.getFieldName() + ": " + item.getString());
					else{
						item.write(new File(dir,item.getName().substring(item.getName().lastIndexOf("\\")+1)));
					}
			} catch (Exception e) {
				e.printStackTrace();
			}
		else {
			System.out.println(request.getMethod());
			System.out.println(request.getParameter("username"));
			System.out.println(request.getParameter("password"));
		}*/
		
		
		
		
		
		ServletInputStream inputStream = ((ServletRequest) request)
        .getInputStream();
		//String file_name=  new String(request.getParameter("file_name").getBytes( "ISO8859-1"), "utf-8");
		String file_name= request.getParameter("file_name");
		System.out.println("file_name"+file_name);
		System.out.println(file_name);
		int len, offset, count;
		count = offset = 0;
		byte[] buffer = new byte[1024];

		try {
			 File dir = new File(request.getSession().getServletContext().getRealPath("upload"));  
			 //创建目录 
			 dir.mkdir();  
			 System.out.println(request.getSession().getServletContext().getRealPath("upload/")+"\\"+file_name);
			FileOutputStream outputStream = new FileOutputStream(request.getSession().getServletContext().getRealPath("upload/")+"\\"+file_name);
			
			while ((len = inputStream.readLine(buffer, 0, 1024)) != -1) {
			offset += len;
			outputStream.write(buffer, 0, len);
			}
			outputStream.flush();
			outputStream.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		PrintWriter out = response.getWriter();
		out.println("ok");

	}
}
