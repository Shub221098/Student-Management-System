package com.student.management.DaoClass;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.sql.*;

import com.student.management.model.StudentModel;

import java.sql.*;

public class StudentDao {
	private static final String GET_STUDENTDETAILS_BY_ROLLNO = "Select Roll_no, first_name, middle_name, last_name, father_name, aadhar_infoaadhar_infomother_name, gender, aadhar_num, date_of_birth, password from student_info where Roll_no = ?;"; 
	private static final String INSERT_STUDENT_SQL = "Insert into student_info(Roll_no, first_name, middle_name, last_name, father_name, aadhar_infoaadhar_infomother_name, gender, aadhar_num, date_of_birth, password) values(?,?,?,?,?,?,?,?,?,?);";
	private static final String GET_ALL_STUDENTDETAILS = "Select * from student_info";
	private static final String DELETE_STUDENT_SQL = "Delete from student_info where Roll_no = ?;";
	private static final String UPDATE_STUDENT_SQL = "Update student_info set first_name = ?, middle_name = ?, last_name = ?, father_name = ?, aadhar_infoaadhar_infomother_name = ?, gender = ?, aadhar_num = ?, date_of_birth =? , password = ? where Roll_no = ?";
	public void StudentDao() {
	}
	protected Connection getConnection() {
		Connection con = null;
		try{
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // creating a connection
            String url = "jdbc:mysql://localhost:3306/studentmanagementsystem";
            String username = "root";
            String password = "Shubham98*";
            con = DriverManager.getConnection(url, username, password);
        }
        catch(Exception e){
            e.printStackTrace();
        }
		return con;
	}
	public void insertStudent(StudentModel user) throws SQLException{
        try{
        			Connection con = getConnection();
        			PreparedStatement pstmt = con.prepareStatement(INSERT_STUDENT_SQL);
//         set the values to the query
        	pstmt.setString(1, user.getRollno());
            pstmt.setString(2, user.getFirstName());
            pstmt.setString(3, user.getMiddleName());
            pstmt.setString(4, user.getLastName());
            pstmt.setString(5, user.getFatherName());
            pstmt.setString(6, user.getMotherName());
            pstmt.setString(7, user.getGender());
            pstmt.setString(8, user.getAadhar());
            pstmt.setString(9, user.getDOB());
            pstmt.setString(10, user.getPassword());
            pstmt.executeUpdate();
            System.out.println("data inserted");
        }
        catch(Exception e){
            e.printStackTrace();
        }
	}
	public StudentModel getStudentDetails(int id) {
		StudentModel user = null;
        try(Connection con = getConnection();
        		PreparedStatement pstmt = con.prepareStatement(GET_STUDENTDETAILS_BY_ROLLNO);){
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
            	String rollno = rs.getString("Roll_no");
            	String firstname = rs.getString("first_name");
            	String middlename = rs.getString("middle_name");
            	String lastname = rs.getString("last_name");
            	String fathername = rs.getString("father_name");
            	String mothername = rs.getString("aadhar_infoaadhar_infomother_name");
            	String gender = rs.getString("gender");
            	String aadharno = rs.getString("aadhar_num");
            	String dob = rs.getString("date_of_birth");
            	String password = rs.getString("password");
            	user = new StudentModel(rollno, firstname, middlename, lastname, fathername, mothername, gender, aadharno, dob, password);
            	System.out.println(user.getFirstName());
            }
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        return user;
	}
	public List<StudentModel> getAllStudent() {
		List<StudentModel> students = new ArrayList<>();
        try(Connection con = getConnection();
        		PreparedStatement pstmt = con.prepareStatement(GET_ALL_STUDENTDETAILS);){
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
            	String rollno = rs.getString("Roll_no");
            	String firstname = rs.getString("first_name");
            	String middlename = rs.getString("middle_name");
            	String lastname = rs.getString("last_name");
            	String fathername = rs.getString("father_name");
            	String mothername = rs.getString("aadhar_infoaadhar_infomother_name");
            	String gender = rs.getString("gender");
            	String aadharno = rs.getString("aadhar_num");
            	String dob = rs.getString("date_of_birth");
            	students.add(new StudentModel(rollno, firstname,middlename,lastname, fathername, mothername, gender, aadharno, dob));
            }
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        return students;
	}
	
	// Update user
	public void updateStudent(StudentModel user) throws SQLException{
		 try(Connection con = getConnection();
	        		PreparedStatement pstmt = con.prepareStatement(UPDATE_STUDENT_SQL);){
	            pstmt.setString(1, user.getFirstName());
	            pstmt.setString(2, user.getMiddleName());
	            pstmt.setString(3, user.getLastName());
	            pstmt.setString(4, user.getFatherName());
	            pstmt.setString(5, user.getMotherName());
	            pstmt.setString(6, user.getGender());
	            pstmt.setString(7, user.getAadhar());
	            pstmt.setString(8, user.getDOB());
	            pstmt.setString(9, user.getPassword());
	            pstmt.setString(10, user.getRollno());
	            System.out.println(user.getRollno());
	            pstmt.executeUpdate();
	            System.out.println("data updated");
	        }
	}
	
	// Delete user
	public boolean deleteStudent(int rollno) throws SQLException{
		boolean rowDeleted;
		 try(Connection con = getConnection();
	        		PreparedStatement pstmt = con.prepareStatement(DELETE_STUDENT_SQL);){
			 pstmt.setInt(1, rollno);
			 rowDeleted = pstmt.executeUpdate() > 0;
		 }
		 return rowDeleted;
	}
}
    
