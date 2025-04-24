<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="emp" class="com.training.model.Employee" scope="request"></jsp:useBean>
	
	<jsp:setProperty property="id" name="emp" param="txt_id" />
	<jsp:setProperty property="name" name="emp" param="txt_name" />
	<jsp:setProperty property="gender" name="emp" param="rad_gender" />
	<jsp:setProperty property="basicSalary" name="emp" param="txt_basicSalary" />
	
<jsp:forward page="test10.jsp"></jsp:forward>
</body>
</html>