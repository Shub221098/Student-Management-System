package com.student.management.controller;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.management.DaoClass.StudentDao;
import com.student.management.model.StudentModel;

public class EditStudentDetails extends HttpServlet{
	private StudentDao studentDao;
	public void init() throws ServletException{
		studentDao = new StudentDao();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
			editStudent(request, response);
		} catch (ServletException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void editStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException{
		String queryStr = request.getQueryString();
		String [] queryStrSplit = queryStr.split("=");
		int rollNo = Integer.parseInt(queryStrSplit[1]);
		try {
			StudentModel existingStudent = studentDao.getStudentDetails(rollNo);
			request.setAttribute("existingstudent",existingStudent);
			RequestDispatcher rd = request.getRequestDispatcher("view/editStudentDetails.jsp");
			rd.forward(request, response);
			}catch(Exception e) {
				e.printStackTrace();
		}
	}
}
