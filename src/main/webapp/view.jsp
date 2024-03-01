<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Employees</title>
</head>
<body>
	<h1>All employees</h1>
	<hr>
	<table border="4" cellpadding="5">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Salary</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<!--  For each loop of jqva is mimicked here. here emp is an obj of employees list so we can access each obj data by using emp -->
		<c:forEach var="emp" items="${employees }">
		<tr>
		<td>${emp.getId()}</td>
		<td>${emp.getName()}</td>    <!--  All the get methods are given in controller page -->
		<td>${emp.getEmail()}</td>
		<td>${emp.getPhone()}</td>
		<td>${emp.getSal()}</td>
		<!--  Here ? is a concatenating operator -->
		<td><a href="update?id=${emp.getId() }"><button type="button">Update</button></a>
		<td><a href="delete?id=${emp.getId() }"><button type="button">Delete</button></a>
		
		</tr>
		
		
		</c:forEach>
		<tr>
		
		</tr>
		
		
		
		
	</table>
	<br>
	<a href="index.jsp"><button>Back</button></a>

</body>
</html>