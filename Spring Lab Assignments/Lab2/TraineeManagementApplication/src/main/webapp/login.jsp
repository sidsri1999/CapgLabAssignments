<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<style>
	h1,h2{
		text-align:center;	
	}
	table{
		align:center;
		width:100%;
	}
	td{
		width:50%;
	}
</style>
</head>
<body>
	<h1>Trainee Management Application</h1>
	<h2>Admin Login</h2>
	<form action="verifyAdmin" method="post">
		<table >
			<tr>
				<td style="text-align:right;">Enter Username</td>
				<td><input type="text" name="userName"></td>
			</tr>
			<tr>
				<td style="text-align:right;">Enter Password</td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align:center;" ><input type="submit" value="Login"></td>
			</tr>	
		</table>
	</form>
</body>
</html>