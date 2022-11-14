package com.student.management.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.student.management.DaoClass.StudentDao;
import com.student.management.model.StudentModel;
public class AdminDashboard extends HttpServlet {
	StudentDao studentDao = new StudentDao();
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
			try {
				List<StudentModel> listUser = studentDao.getAllStudent();
				req.setAttribute("listUser", listUser);
				RequestDispatcher rd = req.getRequestDispatcher("view/adminDashboard.jsp");
				rd.forward(req, res);
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
}