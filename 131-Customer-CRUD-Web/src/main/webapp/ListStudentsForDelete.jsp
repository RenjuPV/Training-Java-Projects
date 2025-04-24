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
			<th>ID</th>
			<th>Name</th>
			<th>Balance</th>
			<th>Email</th>
			<th>Phone</th>
		</tr>
		<c:forEach items="${requestScope.custs}" var="cust">
			<tr>
				<td><c:out value="${cust.id }"></c:out></td>
				<td><c:out value="${cust.name }"></c:out></td>
				<td><c:out value="${cust.balance }"></c:out></td>
				<td><c:out value="${cust.email }"></c:out></td>
				<td><c:out value="${cust.phone }"></c:out></td>
				<td><a href="DeleteCustomer2?txt_id=${pageScope.cust.id }">Delete</a></td>

			</tr>
		</c:forEach>
	</table>



</body>
</html>