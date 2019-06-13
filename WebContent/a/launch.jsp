<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上架图书</title>
</head>
<body>
	<h2>填写图书信息</h2>
	<form action="${ctx }/LaunchBookServlet" method="post">
		<table>
			<tr>
				<td>书名</td>
				<td><input type="text" name="bookName"/></td>
			</tr>
			<tr>
				<td>作者</td>
				<td><input type="text" name="author"/></td>
			</tr>
			<tr>
				<td>装帧</td>
				<td><input type="text" name="binding"/></td>
			</tr>
			<tr>
				<td>原价</td>
				<td><input type="text" name="originalCost"/></td>
			</tr>
			<tr>
				<td>现价</td>
				<td><input type="text" name="currentCost"/></td>
			</tr>
			<tr>
				<td>出版社</td>
				<td><input type="text" name="press"/></td>
			</tr>
			<tr>
				<td>出版时间</td>
				<td><input type="text" name="pressTime"/></td>
			</tr>
			<tr>
				<td>品相</td>
				<td><input type="text" name="Phase"/></td>
			</tr>
			<tr>
				<td>开本</td>
				<td><input type="text" name="bookSize"/></td>
			</tr>
			<tr>
				<td>页数</td>
				<td><input type="text" name="pageNum"/></td>
			</tr>
			<tr>
				<td>年级</td>
				<td><input type="text" name="grade"/></td>
			</tr>
			<tr>
				<td>专业</td>
				<td><input type="text" name="profession"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="上架图书"/></td>
			</tr>
		</table>
	</form>
</body>
</html>