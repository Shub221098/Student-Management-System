<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import ="com.student.management.model.StudentModel" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "updateStudentDetails" method ="post">
<%
try{
StudentModel student = (StudentModel)request.getAttribute("existingstudent");
%>
<div id = "editStudent"><b style = "font-size:22px"><u>Edit Student Details</u></b></div><br>
<div>
<label>Roll No:</label>
<input type = "text" class = "rollno" name = "rollNo" value = "<%=student.getRollno()%>" readonly>
</div>
<div>
<label>First Name:</label>
<input type = "text" class = "firstName" name = "fname" value = "<%=student.getFirstName()%>">
<label>Middle Name:</label>
<input type = "text", style = "float:middle" class = "middlename" name ="mname" value = "<%=student.getMiddleName()%>">
<span style = "float:right">
<input type = "text" style="float:right" class = "lastname" name = "lname" value = "<%=student.getLastName()%>">
<label>Last Name:</label>
</span>
</div><br><br>
<div>
<label>Father Name:</label>
<input type = "text" class = "fatherName" name = "fathername" value = "<%=student.getFatherName()%>">
<span style = "float:right">
<input type = "text" style="float:right" name = "mothername" value = "<%=student.getMotherName()%>">
<label>Mother Name:</label>
</span>
</div><br><br>
<div>
<label>Aadhar Number:</label>
<input type = "text" class = "aadharNumber" name="aadhar" value = "<%=student.getAadhar()%>">
<span style = "float:right">
<input type = "text" style="float:right" value = +91- name = "phoneNumber" value = "<%=student.getPhoneno()%>">
<input type = "text" style="float:right" value = +91- name = "phoneNumber" value = "<%=student.getPhoneno()%>">
<label>Phone Number:</label>
</span>
</div><br><br>
<div>
<label>Gender:</label>
<input type = "radio" id = "Male"  name = "gender" value = "M">
<label>Male</label>
<input type = "radio" id = "Female" name = "gender" value = "F">
<label>Female</label>
<span style = "float:right">
<input type = "date" style="float:right" name = "date" value = "<%=student.getDOB()%>">
<label>DOB:</label>
</span>
</div><br><br>
<div>
<label>Branch:</label>
<select name = "branches">
  <option value=""></option>
  <option value="computer">CSE</option>
  <option value="electrical">EE</option>
  <option value="mechanical">ME</option>
  <option value="informationTechnology">IT</option>
</select>
<span style = "float:right">
<input type = "password" style="float:right" name = "password" value = "<%=student.getPassword()%>">
<label>Password:</label>
</span>
</div><br><br>
<button type = "submit" name = "submit" style = "float:right">Submit</button>
<%}catch(Exception e){
e.printStackTrace();
}%>
</form>
</body>
</html>