<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.l2.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Retrieve Trainee</title>
<style>
table, th, td {
  border: 2px solid black;
  border-collapse: collapse;
}
td{
	width:50%;
}
</style>
</head>
<body>
	<br>
	<h2 style="text-align:center;">Trainee Retrieved</h2>
	<br>
	
		<p style="font-size:20px;text-align:center">Trainee Added Successfully</p>
		<p style="font-size:20px;text-align:center">Trainee Details</p>	
		<table align="center" style="width:40%;">
			<% Trainee trainee = (Trainee) request.getAttribute("trainee"); %>
			<tr>
				<td>Trainee Id</td>
				<td><%= trainee.getTraineeId() %></td>
			</tr>
			<tr>
				<td>Trainee Name</td>
				<td><%= trainee.getTraineeName() %></td>
			</tr>
			<tr>
				<td>Trainee Location</td>
				<td><%= trainee.getTraineeLocation() %></td>
			</tr>
			<tr>
				<td>Trainee Domain</td>
				<td><%= trainee.getTraineeDomain() %></td>
			</tr>
		</table>
		<br>
	<div style="text-align:center;"><a href="operation.jsp" style="font-size:15px;">Back to menu</a></div>
</body>
</html>