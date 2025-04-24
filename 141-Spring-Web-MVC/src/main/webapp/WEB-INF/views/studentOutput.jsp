<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>Roll Number</td>
			<td>${requestScope.studl.rollNumber}</td>
		</tr>
		<tr>
			<td>Name</td>
			<td>${requestScope.studl.name}</td>
		</tr>
		<tr>
			<td>Gender</td>
			<td>${requestScope.studl.gender}</td>
		</tr>
		<tr>
			<td>Mark1</td>
			<td>${requestScope.studl.mark1}</td>
		</tr>
		<tr>
			<td>Mark2</td>
			<td>${requestScope.studl.mark2}</td>
		</tr>
		<tr>
			<td>Total</td>
			<td>${requestScope.studl.total}</td>
		</tr>
		<tr>
			<td>Average</td>
			<td>${requestScope.studl.average}</td>
		</tr>
	</table>
</body>
</html>