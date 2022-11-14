<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
h2{
text-align:center;
}
img {
  border-radius: 70%;
}
#image{
float: right;  
}
#addNewStudent{
text-align:center;
}
#logout{
float:right}
</style>
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
<form action = "insertStudentDetails" method ="post">
<div id = "addNewStudent"><b style = "font-size:22px"><u>Add New Student</u></b></div><br>
<div>
<label>RollNo:</label>
<input type = "text" class = "rollno" name = "Rollno"><br><br>
</div>
<div>
<label>First Name:</label>
<input type = "text" class = "firstName" name = "fname">
<label>Middle Name:</label>
<input type = "text", style = "float:middle" class = "middlename" name ="mname">
<span style = "float:right">
<input type = "text" style="float:right" class = "lastname" name = "lname">
<label>Last Name:</label>
</span>
</div><br><br>
<div>
<label>Father Name:</label>
<input type = "text" class = "fatherName" name = "fathername">
<span style = "float:right">
<input type = "text" style="float:right" name = "mothername">
<label>Mother Name:</label>
</span>
</div><br><br>
<div>
<label>Aadhar Number:</label>
<input type = "text" class = "aadharNumber" name="aadhar">
<span style = "float:right">
<input type = "text" style="float:right" value = +91- name = "phoneNumber" >
<input type = "text" style="float:right" value = +91- name = "phoneNumber" >
<label>Phone Number:</label>
</span>
</div><br><br>
<div>
<label>Gender:</label>
<input type = "radio" id = "Male" value = "M" name = "gender">
<label>Male</label>
<input type = "radio" id = "Female" value = "F" name = "gender">
<label>Female</label>
<span style = "float:right">
<input type = "date" style="float:right" name = "date">
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
<input type = "password" style="float:right" name = "password">
<label>Password:</label>
</span>
</div><br><br>
<button type = "submit" name = "submit" style = "float:right">Submit</button>
</form>
</body>
</html>