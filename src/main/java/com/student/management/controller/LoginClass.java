package com.student.management.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.student.management.DaoClass.StudentDao;
public class LoginClass extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String username = req.getParameter("AId");
		String password = req.getParameter("Pws");
		PrintWriter out = res.getWriter();
		if(username.equals("admin")) {
			if(password.equals("admin123*")){
				HttpSession session = req.getSession();
				req.setAttribute("password", password);
				res.sendRedirect("adminDashboard");
			}
		}
	}
}
