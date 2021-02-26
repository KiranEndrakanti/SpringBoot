<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fetched Employe details</title>
</head>
<body>

<form action="updateEmpId">
	  Id ::   <input type= "text" name ="id" value = ${employe.id} ><br><br>
     Name :: <input type= "text" name ="name" value = ${employe.name}><br><br>
     Technology :: <input type= "text" name ="tech" value = ${employe.tech}><br><br>
             
	<input type ="submit"> 
</form>
</body>
</html>