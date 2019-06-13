<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>收藏列表</title>
</head>
<body>
	<h2>收藏列表</h2>
	<table>
		<tr>
			<th>卖家名</th>
			<th>书名</th>
			<th>品相</th>
			<th>价格</th>
			<th>操作</th>
		</tr>
		<c:forEach var="collect"  items="${collects}">
                <tr>
	                <td>${collect.sellerName}</td>
	                <td>${collect.bookName}</td>
                    <td>${collect.phase}</td>
                    <td>${collect.amount}</td>
                    <td><button onclick="location.href='${ctx}/RemoveCollectServlet?id=${collect.id }'">移出收藏</button></td>
            	</tr>
        </c:forEach>
	</table>
</body>
</html>