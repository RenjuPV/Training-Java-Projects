<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- view -->
	<jsp:useBean id="emp" class="com.training.model.Employee"
		scope="request"></jsp:useBean>
	<table>
		<tr>
			<td>Id</td>
			<td><jsp:getProperty property="id" name="emp" /></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><jsp:getProperty property="name" name="emp" /></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><jsp:getProperty property="gender" name="emp" /></td>
		</tr>
		<tr>
			<td>Basic Salary</td>
			<td><jsp:getProperty property="basicSalary" name="emp" /></td>
		</tr>
		<tr>
			<td>Allowance</td>
			<td><jsp:getProperty property="allowance" name="emp" /></td>
		</tr>
		<tr>
			<td>Deduction</td>
			<td><jsp:getProperty property="deduction" name="emp" /></td>
		</tr>
		<tr>
			<td>Net Salary</td>
			<td><jsp:getProperty property="netSalary" name="emp" /></td>
		</tr>
	</table>
</body>
</html>