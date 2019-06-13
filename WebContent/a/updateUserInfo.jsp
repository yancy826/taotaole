<%@page import="com.taotaole.model.User"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改个人信息</title>
</head>
<body>
	<h2>修改个人信息</h2>
	<%
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		User user = (User)request.getSession().getAttribute("user");
		String d = sdf.format(user.getBirthday());
	%>
	<form action="${ctx }/UpdateUserInfoServlet?id=${user.id}" method="post">
		<table>
			<tr>
				<td>用户名:</td>
				<td><input type="text" name="username" value="${user.username }"/></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input type="password" name="password" value="${user.password }"/></td>
			</tr>
			<tr>
				<td>性别:</td>
				<td><input type="text" name="sex" value="${user.sex }"/></td>
			</tr>
			<tr>
				<td>生日:</td>
				<td><input type="text" name="birthday" value=<%=d %>></td>
			</tr>
			<tr>
				<td>联系方式:</td>
				<td><input type="text" name="telephoneNumber" value="${user.telephoneNumber }"/></td>
			</tr>
			<tr>
				<td>个性签名：</td>
				<td><textarea name="personalitySignature">${user.personalitySignature}</textarea></td>
			</tr>
			<tr>
				<td><input type="submit" value="确定修改"/></td>
			</tr>
		</table>
	</form>
</body>
</html>