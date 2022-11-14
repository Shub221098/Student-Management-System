package com.student.management.controller;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.management.DaoClass.StudentDao;

public class DeleteStudent extends HttpServlet {
	private StudentDao studentDao;
	public void init() throws ServletException{
		studentDao = new StudentDao();
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response){
		try {
			deleteStudent(request,response);
		} catch (ServletException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException{
		String queryStr = request.getQueryString();
		String [] queryStrSplit = queryStr.split("=");
		int rollNo = Integer.parseInt(queryStrSplit[1]);
//		char[] queryStrCharArray = queryStr.toCharArray();
//		int equalToFound = 0;
//		String remainingString = "";
//		for(int i=0; i<queryStrCharArray.length; i++) {
//			if(queryStrCharArray[i] == '=') {
//				equalToFound = 1;
//			}
//			else if(equalToFound == '0') {
//				continue;
//			}
//			else if(equalToFound == 1) {		
//				remainingString += queryStrCharArray[i];	
//			}	
//		}
//		int rollNo = Integer.parseInt(remainingString);
		try {
			studentDao.deleteStudent(rollNo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("adminDashboard");
	}
}
