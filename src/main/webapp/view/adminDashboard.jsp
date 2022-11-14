<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import ="java.util.List" %>
    <%@page import ="com.student.management.model.StudentModel" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table, th, td{
border: 1px solid black;
border-collapse:collapse;
}
h2{
text-align:center;
}
img {
  border-radius: 70%;
}
#image{
float: right;  
}
.addStudent{
float:right; 
}
.logout{
float:right}
</style>
<script>
function my_button_click_handler()
{
	window.open("view/addStudent.jsp");
}
function openLogin()
{
	window.open("index.html");
}
</script>
</head> 
<body>
<h2>Welcome to Shubham's College</h2><hr>
<header>
<div class = "left">
<b style="font-size:18px">Welcome</b><br>
Shubham<br>
<small>Administrator</small>
<img src="Login_image.jpg" id="image" style="width:100px">  
</header><hr>
</div>
<label>Enter Roll_No.</label>
<input type = "text" name = "Roll_No.">
<span>
<button type = "submit">Search</button>
<button type = "submit" onclick = "openLogin()" class = "logout">Logout</button>
<button type = "submit" class = "addStudent"><a href ="<%=request.getContextPath()%>/addStudent"> Add Student</a></button>
</span>
<hr>
<table>
<caption><b style = "font-size:20px">Students Details</b></caption>
<thead>
<tr>
<th name= "rollno" >RollNo</th>
<th>FirstName</th>
<th>MiddleName</th>
<th>LastName</th>
<th>FatherName</th>
<th>MotherName</th>
<th>Gender</th>
<th>AadharNo</th>
<th>DOB</th>
<th>Update</th>
<th>Delete</th>
</tr>
</thead>
<tbody>
<%
List<StudentModel> students = (List<StudentModel>)request.getAttribute("listUser");
for(StudentModel student : students){
%>
<tr><td style = "float:center"><%=student.getRollno()%></td>
<td><%=student.getFirstName()%></td>
<td><%=student.getMiddleName()%></td>
<td><%=student.getLastName()%></td>
<td><%=student.getFatherName() %></td>S
<td><%=student.getMotherName() %></td>
<td><%=student.getGender() %></td>
<td><%=student.getAadhar() %></td>
<td><%=student.getDOB() %></td>
<td style = "text-align:center"><button type = "submit"><a href="<%=request.getContextPath()%>/editStudentDetails?id =<%=student.getRollno()%>">Edit</a></button></td>

<td style = "text-align:center"><button type = "submit"><a href= "<%=request.getContextPath()%>/deleteStudent?id=<%=student.getRollno()%>">Remove</a></button></td>
</tr>
<% }
%>
</tbody>
</table>
</body>
</html>