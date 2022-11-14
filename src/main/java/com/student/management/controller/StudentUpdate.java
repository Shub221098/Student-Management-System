package com.student.management.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.student.management.DaoClass.StudentDao;
import com.student.management.model.StudentModel;

public class StudentUpdate extends HttpServlet {
	private StudentDao studentDao;
	public void init() throws ServletException{
		studentDao = new StudentDao();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doGet(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String action  = request.getServletPath();
		switch(action) {
		case "/new":
			showNewForm(request, response);
			break;
		case "/insert":
			try {
				insertStudent(request,response);
			} catch (ServletException | IOException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "/delete":
			try {
				deletestudent(request, response);
			} catch (ServletException | IOException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "/update":
			try {
				updatestudent(request, response);
			} catch (ServletException | IOException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "/edit":
			try {
				editstudent(request, response);
			} catch (ServletException | IOException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			try {
				wrongPage(request,response);
			} catch (ServletException | IOException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
	}
		private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
			RequestDispatcher rd = request.getRequestDispatcher("view/addStudent.jsp");
			rd.forward(request, response);
		}
		private void insertStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException{
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
			studentDao.insertStudent(newStudent);
			response.sendRedirect("gotoadminpage");
		}
		private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException{
			int Rollno = Integer.parseInt(request.getParameter("Rollno"));
			try {
				studentDao.deleteUser(Rollno);
			}catch(Exception e) {
				e.printStackTrace();
			}
			response.sendRedirect("gotoadminpage");
		}
		private void editstudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException{
			int Rollno = Integer.parseInt(request.getParameter("Rollno"));
			StudentModel existingStudent;
			try {
				existingStudent = studentDao.selectUser(Rollno);
				RequestDispatcher rd = request.getRequestDispatcher("view/editForm.jsp");
				request.setAttribute("student", existingStudent);
				rd.forward(request, response);
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
		private void updatestudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException{
			int Rollno = Integer.parseInt(request.getParameter("Rollno"));
			String firstname = request.getParameter("fname");
			String middlename = request.getParameter("mname");
			String lastname = request.getParameter("lname");
			String fathername = request.getParameter("fathername");
			String mothername = request.getParameter("mothername");
			String gender = request.getParameter("gender");
			String aadhar = request.getParameter("aadhar");
			String dob = request.getParameter("date");
			String phoneno = request.getParameter("phonenumber");
			String password = request.getParameter("password");
			StudentModel Student = new StudentModel(firstname, middlename, lastname, fathername, mothername, gender, aadhar, dob, phoneno, password);
			studentDao.updateUser(Student);
			response.sendRedirect("gotoadminpage");
		}
		private void wrongPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException{
			PrintWriter out = ((ServletResponse) request).getWriter();
			out.println("Failed");
		}
}
