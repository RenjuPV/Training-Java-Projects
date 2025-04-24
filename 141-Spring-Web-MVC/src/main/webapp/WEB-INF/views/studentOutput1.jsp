<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
			<td><c:out value="${requestScope.studl.rollNumber }"/></td>
			<td>${requestScope.studl.rollNumber}</td>
		</tr>
		<tr>
			<td>Name</td>
			<td><c:out value="${requestScope.studl.name }"/></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><c:out value="${requestScope.studl.gender }"/></td>
		</tr>
		<tr>
			<td>Mark1</td>
			<td><c:out value="${requestScope.studl.mark1 }"/></td>
		</tr>
		<tr>
			<td>Mark2</td>
			<td><c:out value="${requestScope.studl.mark2 }"/></td>
		</tr>
		<tr>
			<td>Total</td>
			<td><c:out value="${requestScope.studl.total }"/></td>
		</tr>
		<tr>
			<td>Average</td>
			<td><c:out value="${requestScope.studl.average }"/></td>
		</tr>
	</table>
</body>
</html>