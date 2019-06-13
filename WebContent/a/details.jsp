<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.taotaole.model.Book"%>
<%@page import="java.util.*" %>
<%@page import="com.taotaole.service.BookService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书详情页</title>
</head>
<body>
	<% 
         BookService bs = new BookService();
         Book book = bs.serchBookById(Integer.valueOf(request.getParameter("id")));
      	 request.getSession().setAttribute("book", book);
         String d1 = new String();
      	 String d2 = new String();
      	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
      	 d1 = sdf.format(book.getGroundingTime());
      	 d2 = sdf.format(book.getPressTime());  
    %>
	<h1>图书详情</h1>
    <hr>
    <center>
      <img width="200" height="300" src="../img/book/${book.image }">
      <table width="750" height="60" cellpadding="0" cellspacing="0" border="0">
        <tr>
          <!-- 图书详情 -->
          
          
          <td width="70%" valign="top">
             <table>
               <tr>
                 <td>书名：${book.bookName}</td> 
               </tr>
               <tr>
                 <td>作者：${book.author}</td>
               </tr>
               <tr>
                 <td>上书时间：<%=d1 %></td>
               </tr> 
               <tr>
                 <td>装帧：${book.binding}</td>
               </tr> 
               <tr>
                 <td>原价：${book.originalCost}</td>
               </tr> 
               <tr>
                 <td>现价：${book.currentCost}</td>
               </tr> 
               <tr>
                 <td>出版社：${book.press}</td>
               </tr> 
               <tr>
                 <td>出版时间：<%=d2 %></td>
               </tr> 
               <tr>
                 <td>品相：${book.phase}</td>
               </tr> 
               <tr>
                 <td>开本：${book.bookSize}</td>
               </tr> 
               <tr>
                 <td>页数：${book.pageNum}</td>
               </tr> 
               <tr>
                 <td>年级：${book.grade}</td>
               </tr> 
               <tr>
                 <td>专业：${book.profession}</td>
               </tr> 
             </table>
          </td>
        </tr>
      </table>
      
      <form action="${ctx }/ContactOfSellerServlet" method="post">
      	<input type="submit" value="购买此书"/>
      </form>
      <form action="${ctx }/CollectBookServlet" method="post">
      	<input type="submit" value="收藏此书"/>
      </form>
    </center>
</body>
</html>