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
	<h2>
		<c:out value="${requestScope.message }"></c:out>
	</h2>
	<br>
	<a href="ListCustomers">Show All Customers</a>
	</br>
	<br>
	<a href="AddCustomer1">Back</a>
	</br>
	<br>
	<a href="/">Back to Menu</a>
	</br>
</body>
</html>