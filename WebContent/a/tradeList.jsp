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
<title>交易记录</title>
</head>
<body>
	<h2>交易记录</h2>
	<table>
		<tr>
			<th>书名</th>
			<th>卖家名</th>
			<th>价格</th>
			<th>交易时间</th>
			<th>操作</th>
		</tr>
		<c:forEach var="trade"  items="${trades}">
                <tr>
	                <td>${trade.bookName}</td>
                    <td>${trade.sellerName}</td>
                    <td>${trade.amount}</td>
                    <td>${trade.time}</td> 
                    <td><button onclick="location.href='${ctx}/RemoveTradeServlet?id=${trade.id }'">移出记录</button></td>
            	</tr>
        </c:forEach>
	</table>
</body>
</html>