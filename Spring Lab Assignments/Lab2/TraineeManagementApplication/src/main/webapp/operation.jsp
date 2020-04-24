<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Operation</title>
<style type="text/css">
	
	table, th, td {
		border:1px solid black;
		text-align:center;	
	}
</style>
</head>
<body>
	<br>
	<h2 style="text-align:center;">Operations</h2>
	<br>
	<table align="center">
		<tr>
			<th>Pick your operation</th>
		</tr>
		<tr>
			<td><a href="addTrainee.jsp">Add a Trainee</a></td>
		</tr>
		<tr>
			<td><a href="deleteTraineeRequest.jsp">Delete a Trainee</a></td>
		</tr>
		<tr>
			<td><a href="modifyTraineeRequest.jsp">Modify a Trainee</a></td>
		</tr>
		<tr>
			<td><a href="retrieveTraineeRequest.jsp">Retrieve a Trainee</a></td>
		</tr>
		<tr><form action="retrieveAll" method="post">
			<td><input type="submit" value="Retrieve all Trainees"></td>
			</form>
		</tr>
	</table>
	<br>
	<div style="text-align:center;"><a href="login.jsp" style="font-size:15px;">Logout</a></div>
</body>
</html>