package com.student.management.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.management.DaoClass.StudentDao;
import com.student.management.model.StudentModel;

public class InsertStudentDetails extends HttpServlet{
	private StudentDao studentDao;
	public void init() throws ServletException{
		studentDao = new StudentDao();
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response){
		try {
			insertStudent(request, response);
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void insertStudent(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		StudentModel newStudent = getStudentDetails(request, response);
		studentDao.insertStudent(newStudent);
		response.sendRedirect("adminDashboard");
	}
	private StudentModel getStudentDetails(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		String rollno = request.getParameter("Rollno");
		String firstname = request.getParameter("fname");
		String middlename = request.getParameter("mname");
		String lastname = request.getParameter("lname");
		String fathername = request.getParameter("fathername");
		String mothername = request.getParameter("mothername");
		String gender = request.getParameter("gender");
		String aadhar = request.getParameter("aadhar");
		String dob = request.getParameter("date");
		String password = request.getParameter("password");
		StudentModel newStudent = new StudentModel(rollno,firstname, middlename, lastname, fathername, mothername, gender, aadhar, dob, password);
		return newStudent;
	}
}
