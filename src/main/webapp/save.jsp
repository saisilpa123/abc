<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="save">
		<label>Enter details</label> Name<input type="text" name="name"><br>
		<br> Mail<input type="email" name="email"> <br>
		<br> Phone<input type="text" name="phone"> <br>
		<br> Password<input type="password" name="password"><br>
		<br> Salary<input type="text" name="sal"><br>
		<br>
		<button type="submit">Save employee</button>
	</form><br>
	<a href="index.jsp"><button>Back</button></a>
</body>
</html>