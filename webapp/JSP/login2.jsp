<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>获取参数2</h3>
	<form action="/p/p2" method="POST">
	账号：<input name="user.name" type="text" >
	<br/>
	密码：<input name="user.password" type="text" >
	<br/>
	<input type="submit" value="提交" >
	
	</form>
</body>
</html>