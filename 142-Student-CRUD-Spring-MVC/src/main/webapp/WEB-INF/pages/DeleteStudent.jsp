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
	<form:form action="DeleteStudent3" method="post" modelAttribute="stud">
		<table>
			<tr>
				<td><label>Roll Number</label></td>
				<td><form:input path="rollNumber" /></td>
			</tr>
			<tr>
				<td><label>Name</label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><label>Gender</label></td>
				<td><form:select path="gender">
						<form:option value="M">MALE</form:option>
				<form:option value="F">FEMALE</form:option>
				</form:select></td>
			</tr>

			
			
			<tr>
				<td><label>Mark1</label></td>
				<td><form:input path="mark1" /></td>
			</tr>
			<tr>
				<td><label>Mark2</label></td>
				<td><form:input path="mark2" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="DELETE"></td>
			</tr>
		</table>
	</form:form>
<br>
	<a href="index.jsp">Back to Menu</a>
	</br>
</body>
</html>