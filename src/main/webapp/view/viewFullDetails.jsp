<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ViewStudentDetails</title>
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
.logout{
float:right;
}
#viewStudent{
text-align:center;
}
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
</div><br><br> 
<button type = "submit" onclick = "openLogin()" class = "logout">Logout</button><hr>
<form>
<div id = "viewStudent"><b style = "font-size:22px"><u>View Student Details</u></b></div><br>
</div>
<label>First Name:</label>
<input type = "text" class = "firstName"  value = "Shubham" readonly = "readonly">
<span style = "float:right">
<input type = "text" style="float:right" name = "lastName" value = "Pareta" readonly = "readonly">
<label>Last Name:</label>
</span>
</div><br><br>
<div>
<label>Father Name:</label>
<input type = "text" class = "fatherName" value = "Dinanath Pareta" readonly = "readonly">
<span style = "float:right">
<input type = "text" style="float:right" name = "motherName" value = "Anita Pareta" readonly = "readonly">
<label>Mother Name:</label>
</span>
</div><br><br>
<div>
<label>Aadhar Number:</label>
<input type = "text" class = "aadharNumber" name = "Aadhar" value = "7565-2567-5434" readonly = "readonly">
<span style = "float:right">
<input type = "text" style="float:right" value = +91-7976845092 name = "phoneNumber" readonly = "readonly">
<input type = "text" style="float:right" value = +91-8579324624 name = "phoneNumber" readonly = "readonly">
<label>Phone Number:</label>
</span>
</div><br><br>
<div>
<label>Gender:</label>
<input type = "radio"  id = "Ma_le" name = "male" Checked>
<label>Male</label>
<input type = "radio" id = "Fem_ale" name = "female">
<label>Female</label>
<span style = "float:right">
<input type = "text" style="float:right" name = "dob" value = "22-10-1998" readonly = "readonly">
<label>DOB:</label>
</span>
</div><br><br>
<div>
<label>Branch:</label>
<input type = "text" id = "B_name" name = "branch" value = "Computer Science">
</div><br><hr>
<h2><u>Check Your Result</u></h2>
<label>Choose Semester:</label>
<select>
	<option value =" "></option>
	<option value = "1">1</option>
	<option value = "2">2</option>
	<option value = "3">3</option>
	<option value = "4">4</option>
	<option value = "5">5</option>
	<option value = "6">6</option>
	<option value = "7">7</option>
	<option value = "8">8</option>
</select>
<button type = "submit" style ="background-color:blue; color:white">Check</button>
</form>
</body>
</html>