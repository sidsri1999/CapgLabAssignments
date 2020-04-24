<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.l2.model.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Retrieve All Trainees</title>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
</head>
<body>
	<br>
	<h2 style="text-align:center;">All Trainees</h2>
	<br>
	<form>
		<table align="center" style="width:80%;">
			<% ArrayList<Trainee> traineeList = (ArrayList<Trainee>)request.getAttribute("traineeList"); %>
			<tr>
				<th>Trainee Id</th>
				<th>Trainee Name</th>
				<th>Trainee Location</th>
				<th>Trainee Domain</th>
			</tr>
			<% for(Trainee trainee:traineeList) {  %>
				<tr>
				<td><%= trainee.getTraineeId() %></td>
				<td><%= trainee.getTraineeName() %></td>
				<td><%= trainee.getTraineeLocation() %></td>
				<td><%= trainee.getTraineeDomain() %></td>
			</tr>
			<% } %>	
		</table>
		<br>
		<div style="text-align:center;"><a href="operation.jsp" style="font-size:15px;">Back to menu</a></div>
	</form>
</body>
</html>