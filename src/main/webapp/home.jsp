<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>


<h1>To Insert the details</h1>
	<form action="addEmployee">	
     Id ::   <input type= "text" name ="id"><br><br>
     Name :: <input type= "text" name ="name"><br><br>
     Technology :: <input type= "text" name ="tech"><br><br>
             <input type = "submit"><br>
	
	</form>
<br><br>

<h1>To Fetch the details based on Id</h1>
	<form action="getEmployee" >
     Id ::   <input type= "text" name ="id"><br><br>
     <input type = "submit"><br>
	</form>
	
<h1>To Delete the Employee details based on Id</h1>
	<form action="deleteEmployee" >
     Id ::   <input type= "text" name ="id"><br><br>
     <input type = "submit"><br>
	</form>
		

</body>
</html>