<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update details</title>
</head>
<body>
	<form action="updateemp">
	<input value="${employee.getId() }" type="text" name="id" readonly="readonly">
		<label>Enter details</label> Name<input type="text" name="name" value="${employee.getName() }"><br>
		<br> Mail<input type="email" name="email" value="${employee.getEmail()}"> <br>
		<br> Phone<input type="text" name="phone" value="${employee.getPhone()}"> <br>
		<br> Password<input type="password" name="password" value="${employee.getPassword()}"><br>
		<br> Salary<input type="text" name="sal" value="${employee.getSal()}"><br>
		<br>
		<button type="submit">Save employee</button>
	</form><br>
</body>
</html>