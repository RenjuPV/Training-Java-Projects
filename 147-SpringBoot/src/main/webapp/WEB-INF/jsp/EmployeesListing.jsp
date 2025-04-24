<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h2>Employees List</h2>
<body>
	<table border="1">
		
		<td><b>Id</b></td>
		<td><b>Name</b></td>
		<td><b>Gender</b></td>
		<td><b>Basic</b></td>
		<td><b>Allowance</b></td>
		<td><b>Tax</b></td>
		<td><b>NetSalary</b></td>
		
		<c:forEach items="${requestScope.emps }" var="e">
			<tr>
				<td><c:out value="${e.id }" /></td>
				<td><c:out value="${e.name }" /></td>
				<td><c:out value="${e.gender }" /></td>
				<td><c:out value="${e.basic }" /></td>
				<td><c:out value="${e.allowance }" /></td>
				<td><c:out value="${e.tax }" /></td>
				<td><c:out value="${e.netSalary }" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>