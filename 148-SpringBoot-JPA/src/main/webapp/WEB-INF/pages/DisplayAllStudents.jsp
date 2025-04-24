<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<tr>
			<th>Roll Number</th>
			<th>Name</th>
			<th>Gender</th>
			<th>Mark1</th>
			<th>Mark2</th>
			<th>Total</th>
			<th>Average</th>
		</tr>
		<c:forEach items="${requestScope.studs}" var="s">
			<tr>
				<td><c:out value="${s.rollNumber }"></c:out></td>
				<td><c:out value="${s.name }"></c:out></td>
				<td><c:out value="${s.gender }"></c:out></td>
				<td><c:out value="${s.mark1 }"></c:out></td>
				<td><c:out value="${s.mark2 }"></c:out></td>
				<td><c:out value="${s.total }"></c:out></td>
				<td><c:out value="${s.average }"></c:out></td>

			</tr>
		</c:forEach>
	</table>


	<br>
	<a href="/">Back to Menu</a>
	</br>
</body>
</html>