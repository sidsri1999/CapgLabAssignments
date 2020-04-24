<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.l2.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
td{
	width:50%;
}
</style>
</head>
<body>
	<br>
	<h2 style="text-align:center;">Modify Trainee</h2>
	<br>
	<p style="font-size:20px;text-align:center">Trainee Details</p>	
		<table align="center" style="width:40%;">
			<% Trainee trainee = (Trainee) request.getAttribute("traineeObject"); %>
			<% int id = trainee.getTraineeId(); %>
			<tr>
				<td style="text-align:right;">Trainee Id: </td>
				<td><%= trainee.getTraineeId() %></td>
			</tr>
			<tr>
				<td style="text-align:right;">Trainee Name: </td>
				<td><%= trainee.getTraineeName() %></td>
			</tr>
			<tr>
				<td style="text-align:right;">Trainee Location: </td>
				<td><%= trainee.getTraineeLocation() %></td>
			</tr>
			<tr>
				<td style="text-align:right;">Trainee Domain: </td>
				<td><%= trainee.getTraineeDomain() %></td>
			</tr>
		</table>
		<p style="font-size:20px;text-align:center">Modify Trainee</p>	
	<form action="modifyTrainee" method="post">
	<table align="center" style="width:90%;">
		<tr>
			<td style="text-align:right;">Trainee Id: </td>
			<td><input type="text" name="traineeId" value="<%= id%>" disabled>
					<input type="hidden" name="traineeId" value="<%= id%>"></td>
		</tr>
		<tr>
			<td style="text-align:right;">Trainee Name: </td>
			<td><input type="text" name="traineeName" value="<%= trainee.getTraineeName()%>"></td>
		</tr>
		<tr>
			<td style="text-align:right;">Trainee Location: </td>
			<td>
				<input type="radio" name="traineeLocation" value="Chennai" checked="checked">
				<label>Chennai</label>
				<input type="radio" name="traineeLocation" value="Bangalore">
				<label>Bangalore</label>
				<input type="radio" name="traineeLocation" value="Pune">
				<label>Pune</label>
				<input type="radio" name="traineeLocation" value="Mumbai">
				<label>Mumbai</label>
			</td>
		</tr>
		<tr>
			<td style="text-align:right;">Trainee Domain: </td>
			<td>
				<select name="traineeDomain">
					  <option value="JEE">JEE</option>
					  <option value=".NET">.NET</option>
					  <option value="Mainframe">Mainframe</option>
				</select>
			</td>
		</tr>
	</table>
	<br>
	<div style="text-align:center;"><input type="submit" value="Modify Trainee"></div>	
	</form>
</body>
</html>