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
			<th>Customer Id</th>
			<th>Name</th>
			<th>Balance</th>
			<th>Email</th>
			<th>Phone</th>
		</tr>
		<c:forEach items="${requestScope.custs}" var="c">
			<tr>
				<td><c:out value="${c.id }"></c:out></td>
				<td><c:out value="${c.name }"></c:out></td>
				<td><c:out value="${c.balance }"></c:out></td>
				<td><c:out value="${c.email }"></c:out></td>
				<td><c:out value="${c.phone }"></c:out></td>
				<td><a href="DeleteCustomer2?txt_id=${pageScope.c.id }">Delete</a></td>
			</tr>
		</c:forEach>
	</table>


	<br>
	<a href="/">Back to Menu</a>
	</br>
</body>
</html>