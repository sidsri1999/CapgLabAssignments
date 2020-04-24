<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Retrieve Trainee</title>
<style>
td{
	width:50%;
}
</style>
</head>
<body>
	<br>
	<h2 style="text-align:center;">Retrieve Trainee</h2>
	<br>
	<form action="retrieveTrainee" method="post">
		<table align="center" style="width:100%;">
			<tr>
				<td style="text-align:right;">Enter Trainee Id: </td>
				<td ><input type="text" name="traineeId"></td>
			</tr>
		</table>
		<div style="text-align:center;"><input type="submit" value="Retrieve Trainee"></div>
	</form>
</body>
</html>