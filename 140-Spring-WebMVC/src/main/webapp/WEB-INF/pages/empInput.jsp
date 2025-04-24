<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<h1>Employee Input Screen</h1>
	<form:form action="output" method="POST" modelAttribute="emp">
		<table>
			<tr>
				<td>Id</td>
				<td><form:input path="id" /></td>
				<td><form:errors path="id" cssClass="err" /></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssClass="err" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><form:select path="gender">
						<form:option value="MALE">MALE</form:option>
						<form:option value="FEMALE">FEMALE</form:option>
					</form:select></td>
			</tr>
			<tr>
				<td>City</td>
				<td><form:input path="city" /></td>
				<td><form:errors path="city" cssClass="err" /></td>
			</tr>
			<tr>
				<td>Basic Salary</td>
				<td><form:input path="basic"/></td>
				<td><form:errors path="basic" cssClass="err" /></td>

			</tr>
			<tr>

				<td><input type="submit" value="display" /></td>

			</tr>

		</table>
	</form:form>
</body>
</html>