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
	<form action="DeleteCustomer3" method="post">
		<table>
			<tr>
				<td><label>Id</label></td>
				<td><input type="text" name="txt_id"
					value="${requestScope.cust.id}"></td>
			</tr>
			<tr>
				<td><label>Name</label></td>
				<td><input type="text" name="txt_name"
					value="${requestScope.cust.name}"></td>
			</tr>
			<tr>
				<td><label>Balance</label></td>
				<td><input type="text" name="txt_balance"
					value="${requestScope.cust.balance}"></td>
			</tr>
			

			<%--  	<c:choose>
				<c:when test="${requestScope.stud.gender=='M'}">
					<tr>
						<td><label>Gender</label></td>
						<td><input type="radio" name="rad_gender" value="Male" checked="checked">MALE
							<input type="radio" name="rad_gender" value="Female">FEMALE
						</td>
					</tr>
				</c:when>
				<c:when test="${requestScope.stud.gender=='F'}">
					<tr>
						<td><label>Gender</label></td>
						<td><input type="radio" name="rad_gender" value="Male">MALE
							<input type="radio" name="rad_gender" value="Female" checked="checked">FEMALE
						</td>
					</tr>
				</c:when>

			</c:choose> --%>
			
			<tr>
				<td><label>Email</label></td>
				<td><input type="text" name="txt_email"
					value="${requestScope.cust.email}"></td>
			</tr>
			<tr>
				<td><label>Email</label></td>
				<td><input type="text" name="txt_phone"
					value="${requestScope.cust.email}"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="DELETE"></td>
			</tr>
		</table>
	</form>

</body>
</html>