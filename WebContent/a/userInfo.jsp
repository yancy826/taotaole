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
<title>个人中心</title>
</head>
<body>
	<%
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		User user = (User)request.getSession().getAttribute("user");
		String d = sdf.format(user.getBirthday());
	%>
	<h2>用户个人信息</h2>
	<table>
		<tr>
			<td>用户名:</td>
			<td><input type="text" readonly="readonly" value="${user.username }"/></td>
		</tr>
		<tr>
			<td>性别:</td>
			<td><input type="text" readonly="readonly" value="${user.sex }"/></td>
		</tr>
		<tr>
			<td>生日:</td>
			<td><input type="text" readonly="readonly" value=<%=d %>></td>
		</tr>
		<tr>
			<td>联系方式:</td>
			<td><input type="text" readonly="readonly" value="${user.telephoneNumber }"/></td>
		</tr>
		<tr>
			<td>个性签名：</td>
			<td><textarea readonly="readonly">${user.personalitySignature}</textarea></td>
		</tr>
		
	</table>
	<br>
	<a href="${ctx }/SerchCollectServlet">收藏列表</a>&nbsp;&nbsp;
	<a href="${ctx }/SerchTradeServlet">交易记录</a>&nbsp;&nbsp;
	<a href="${ctx }/a/updateUserInfo.jsp">修改个人信息</a>&nbsp;&nbsp;
	<a href="${ctx }/index.jsp">返回主页</a>
</body>
</html>