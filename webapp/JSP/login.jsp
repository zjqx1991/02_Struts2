<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>请登陆</h2>
	<form action="/l/login" method="POST">
	账号：<input name="name" type="text" >
	<br/>
	密码：<input name="password" type="text" >
	<br/>
	<input type="submit" value="提交" >
	
	</form>
</body>
</html>