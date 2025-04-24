<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Add New Customer Details</h1>
	<hr>
	<form method="post" action="AddCustomer2">
		<table border="1">
			<tr>
				<td><label>Id</label></td>
				<td><input type="text" name="txt_id"></td>
			</tr>
			<tr>
				<td><label>Name</label></td>
				<td><input type="text" name="txt_name"></td>
			</tr>
			<tr>
				<td><label>Balance</label></td>
				<td><input type="text" name="txt_balance"></td>

			</tr>
			<tr>
				<td><label>Phone Number</label></td>
				<td><input type="text" name="txt_phone"></td>
			</tr>
			<tr>
				<td><label>Email</label></td>
				<td><input type="text" name="txt_email"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="SUBMIT"></td>
			</tr>
		</table>
	</form>
</body>
</html>