<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Training Enrollment Application</title>
</head>
<body>
	<br/><h1 align='center'>Training Enrollment Application</h1></br></br>
	<h3 align='center'>Hi you have successfully enrolled for <%= request.getParameter("Name") %></h3>
	<h5 align='center'><% out.print("<a href='Entry.html\'>Home Page</a>");%></h5>
</body>
</html>