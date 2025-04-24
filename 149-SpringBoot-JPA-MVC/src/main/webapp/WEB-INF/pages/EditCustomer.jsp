<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.err{
color:red
}
</style>
</head>
<body>
	<form:form action="UpdateCustomer3" method="post" modelAttribute="cust">
		<table>
			<tr>
				<td><label>ID</label></td>
				<td><form:input path="id" readonly="readonly"/></td>
			</tr>
			<tr>
				<td><label>Name</label></td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssClass="err" /></td>

			</tr>
			<tr>
				<td><label>Balance</label></td>
				<td><form:input path="balance" /></td>
				<td><form:errors path="balance" cssClass="err" /></td>
			</tr>

			<tr>
				<td><label>Email</label></td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssClass="err" /></td>
			</tr>
			<tr>
				<td><label>Phone</label></td>
				<td><form:input path="phone" /></td>
				<td><form:errors path="phone" cssClass="err" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="UPDATE"></td>
			</tr>
		</table>
	</form:form>
<br>
	<a href="/">Back to Menu</a>
	</br>
</body>
</html>