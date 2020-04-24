<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Trainee</title>
<style type="text/css">
	table{
		width:100%;
	}
	td{
		width:50%;
	}
</style>
</head>
<body>
	<br>
	<h2 style="text-align:center;">Add Trainee</h2>
	<br>
	<form action="addTrainee" method="post">
	<table align="center">
		<tr>
			<td style="text-align:right;">Trainee Name:</td>
			<td><input type="text" name="traineeName"></td>
		</tr>
		<tr>
			<td style="text-align:right;">Trainee Location:</td>
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
			<td style="text-align:right;">Trainee Domain:</td>
			<td>
				<select name="traineeDomain">
					  <option value="JEE">JEE</option>
					  <option value=".NET">.NET</option>
					  <option value="Mainframe">Mainframe</option>
				</select>
			</td>
		</tr>
	</table>
	<div style="text-align:center;"><input type="submit" value="Add Trainee"></div>	
	</form>
</body>
</html>