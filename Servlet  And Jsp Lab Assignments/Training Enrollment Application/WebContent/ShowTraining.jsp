<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,com.tea.dto.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Training Enrollment Application</title>
	<style>
	table,th,td{
		border: 1px solid black;
		border-collapse: collapse;
	}
	</style>
</head>
<body>
	
	<br/>
	<h1 align='center'>Training Enrollment Application</h1><br/><br/>
	<table align="center">
		<%
			ArrayList<TrainingInfo> tInfo = (ArrayList<TrainingInfo>) request.getAttribute("trainingInfo");
		%>
		<tr>
			<th>Training Id</th>
			<th>Training Name</th>
			<th>Available Seats</th>
			<th>Enroll</th>
		</tr>
		<tr>
			<td><%= tInfo.get(0).getTrainingId() %></td>
			<td><%= tInfo.get(0).getTrainingName() %></td>
			<td><%= tInfo.get(0).getAvailableSeats() %></td>
			<td><% out.print("<a href='SetTraining?Id="+tInfo.get(0).getTrainingId()+"&Name="+tInfo.get(0).getTrainingName()+"&Seats="+tInfo.get(0).getAvailableSeats()+"'>Enroll</a>");%></td>
		</tr>
		<tr>
			<td><%= tInfo.get(1).getTrainingId() %></td>
			<td><%= tInfo.get(1).getTrainingName() %></td>
			<td><%= tInfo.get(1).getAvailableSeats() %></td>
			<td><% out.print("<a href='SetTraining?Id="+tInfo.get(1).getTrainingId()+"&Name="+tInfo.get(1).getTrainingName()+"&Seats="+tInfo.get(1).getAvailableSeats()+"'>Enroll</a>");%></td>
		</tr>
		<tr>
			<td><%= tInfo.get(2).getTrainingId() %></td>
			<td><%= tInfo.get(2).getTrainingName() %></td>
			<td><%= tInfo.get(2).getAvailableSeats() %></td>
			<td><% out.print("<a href='SetTraining?Id="+tInfo.get(2).getTrainingId()+"&Name="+tInfo.get(2).getTrainingName()+"&Seats="+tInfo.get(2).getAvailableSeats()+"'>Enroll</a>");%></td>
		</tr>	
	</table>	
</body>
</html>