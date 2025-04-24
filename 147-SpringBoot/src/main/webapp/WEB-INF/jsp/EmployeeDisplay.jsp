<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h2>Employee Details</h2>
<body>
<table>
		<tr>
			<td>Employee ID</td>
			<td><c:out value="${requestScope.emp.id }" /></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><c:out value="${requestScope.emp.name }" /></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><c:out value="${requestScope.emp.gender }" /></td>
		</tr>
		<tr>
			<td>Basic</td>
			<td><c:out value="${requestScope.emp.basic }" /></td>
		</tr>
		<tr>
			<td>Allowance</td>
			<td><c:out value="${requestScope.emp.allowance }" /></td>
		</tr>
		<tr>
			<td>Tax</td>
			<td><c:out value="${requestScope.emp.tax }" /></td>
		</tr>
		<tr>
			<td>Net Salary</td>
			<td><c:out value="${requestScope.emp.netSalary }" /></td>
		</tr>

	</table>
</body>
</html>