package com.student.management.controller;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.management.DaoClass.StudentDao;
import com.student.management.model.StudentModel;

public class UpdateStudentDetails extends HttpServlet {
	private StudentDao studentDao;
	public void init() throws ServletException{
		studentDao = new StudentDao();
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response){
		try {
			updateStudent(request,response);
		} catch (ServletException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException{
			StudentModel student = getEditedStudentDetails(request, response);
			studentDao.updateStudent(student);
			response.sendRedirect("adminDashboard");
		}
		private StudentModel getEditedStudentDetails(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
			String rollno = request.getParameter("rollNo");
			System.out.println(rollno);
			String firstname = request.getParameter("fname");
			String middlename = request.getParameter("mname");
			String lastname = request.getParameter("lname");
			String fathername = request.getParameter("fathername");
			String mothername = request.getParameter("mothername");
			String gender = request.getParameter("gender");
			String aadhar = request.getParameter("aadhar");
			String dob = request.getParameter("date");
			String password = request.getParameter("password");
			StudentModel student = new StudentModel(rollno, firstname, middlename, lastname, fathername, mothername, gender, aadhar, dob, password);
			return student;
	}
}
