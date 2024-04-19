
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<style>
h3{
	text-align: center;
}
sub{
	text-align: center;
	color:red;
	width:10px;
	height:10px;
}
form{
	border:1px solid black;
	border-radius:15px 15px 15px 15px;
	text-align: center;
}
table{
	padding:30px;
	
}
</style>
<body>
<div className="container">
	<div className="row" >
	<div className="col-3"></div>
	<div className="col-6"></div>
	<form action="addStudent" align="center">
	<table align="center">
	    <h3 >Student Registration From</h3>
         <tr><td>student ID:</td><td><input type="text" class="form-control"  name="stuid" placeholder="student id" /></td></tr>
         <tr><td> frist Name:</td><td><input type="text" class="form-control" name="fname" placeholder="student fristname" /></td></tr>
         <tr><td>Last Name:</td><td><input type="text" class="form-control" name="lname" placeholder="student lastname" /></td></tr>
         <tr><td>  Contact No:</td><td><input type="text" class="form-control" name="contactno" placeholder="student contact" /></td></tr>
         <tr><td> Email id:</td><td><input type="text" class="form-control" name="emailid" placeholder="student emailid" /></td></tr>
         <tr><td> Password:</td><td><input type="text" class="form-control" name="password" placeholder="student password" /></td></tr>
         <tr><td> Address:</td><td><input type="text" class="form-control" name="address" placeholder="student address" /></td></tr>
         <tr><td> <input className="sub" center; type="submit" value="submit " /></td></tr>
	</table>
    </form>
	
	<form action="getStu" >
	<table align="center">
	   <h2>Find Student Information</h2>
	   <tr><td>Enter the id:<input type="text" class="form-control" name="fstuid" /></td></tr>
	   <tr><td> <input className="sub"  type="submit" value="submit " /></td></tr>
     </table>
	 </form>


	 <form action="delStu">
	 <table align="center">
	   <h2>delete Student Data</h2>
	   <tr><td>Enter the id:<input type="text" class="form-control" name="fstuid" /></td></tr>
	  <tr><td> <input className="sub"  type="submit" value="delete " /></td></tr> 
     </table>

     </form>
     <form action="getAllstu">
	  <table align="center">
	   <tr><h2>Display ALL Student Information</h2></tr>
	    <tr> <td> <input className="sub"  type="submit" value="submit " /></td></tr>
	 </table >
	 </form>

	 </form>
	 <div className="col-3"></div>
	 </div>
</div>
    </body>
</html>