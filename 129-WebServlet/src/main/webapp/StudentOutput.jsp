<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<td>RollNumber</td>
			<td>${requestScope.stud.rollNumber }</td>
			
		</tr>
		<tr>
			<td>Name</td>
			<td>${requestScope.stud.name }</td>
			
		</tr>
		<tr>
			<td>Gender</td>
				<td>${requestScope.stud.gender }</td>
			
		</tr>
		<tr>
			<td>Mark1</td>
			<td>${requestScope.stud.mark1 }</td>
			
		</tr>
		<tr>
			<td>Mark2</td>
				<td>${requestScope.stud.mark2 }</td>
			
		</tr>
		<tr>
			<td>Total</td>
			<td>${requestScope.stud.total }</td>
			
		</tr>
		<tr>
			<td>Average</td>
				<td>${requestScope.stud.average }</td>
			
		</tr>
	</table>
</body>
</html>