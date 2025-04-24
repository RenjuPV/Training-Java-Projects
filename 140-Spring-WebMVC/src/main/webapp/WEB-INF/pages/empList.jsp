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
			<th>Id</th>
			<th>Name</th>
			<th>Gender</th>
			<th>City</th>
			<th>Basic</th>
		</tr>
		<c:forEach items="${requestScope.emps }" var="e">
			<tr>
				<td><c:out value="${e.id}"></c:out></td>
				<td><c:out value="${e.name }"></c:out></td>
				<td><c:out value="${e.gender }"></c:out></td>
				<td><c:out value="${e.city }"></c:out></td>
				<td><c:out value="${e.basic }"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>