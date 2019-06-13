<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>注册</h2>
	<form action="RegisterServlet" method="post">
		<table>
			<tr>
				<td>用户名</td>
				<td><input type="text" name="username"/></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="text" name="password"/></td>
			</tr>
			<tr>
				<td>生日</td>
				<td><input type="text" name="birthday"/></td>
			</tr>
			<tr>
				<td>性别</td>
				<td><input type="text" name="sex"/></td>
			</tr>
			<tr>
				<td>联系方式</td>
				<td><input type="text" name="telephoneNumber"/></td>
			</tr>
			<tr>
				<td>个性签名</td>
				<td><textarea name="personalitySignature"></textarea></td>
			</tr>
			<tr>
				<td>${warning2}</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="注册"/></td>
			</tr>
		</table>
	</form>
</body>
</html>