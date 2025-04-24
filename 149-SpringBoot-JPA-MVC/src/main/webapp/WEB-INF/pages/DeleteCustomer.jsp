<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<form:form action="DeleteCustomer3" method="post" modelAttribute="cust">
		<table>
			<tr>
				<td><label>Id</label></td>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td><label>Name</label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><label>Balance</label></td>
				<td><form:input path="balance" /></td>
			</tr>

			<tr>
				<td><label>Email</label></td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td><label>Phone</label></td>
				<td><form:input path="phone" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="DELETE"></td>
			</tr>
		</table>
	</form:form>
	<br>
	<a href="/">Back to Menu</a>
	</br>
</body>
</html>