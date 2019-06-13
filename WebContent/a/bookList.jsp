<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.taotaole.model.Book"%>
<%@page import="com.taotaole.service.BookService"%>
<%@page import="com.taotaole.model.Book"%>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta charset="utf-8">
		<title></title>
		<link href="../css/header.css" rel="stylesheet" type="text/css">
		<link href="../css/list.css" rel="stylesheet" type="text/css">
		<link href="../css/fenye.css" rel="stylesheet" type="text/css">
		<script language="JavaScript" src="../js/jquery-3.3.1.min.js"></script>
		<script language="JavaScript" src="../js/paginathing.js"></script>
	</head>

	<body>
	<%
		BookService bs = new BookService();
		if(session.getAttribute("books")==null){
			List<Book> books = bs.query();
			session.setAttribute("books", books);
		}
	%>
		<div id="header">
			<div class="header_logo">
				<a href="../index.jsp">
					<img src="../img/logo.png" />
				</a>
			</div>
			<div class="header_link">
				<a href="${ctx }/a/userInfo.jsp">个人中心</a>
				|
				<a href="${ctx }/a/launch.jsp">上架图书</a>
				|
			</div>
			<!--搜索-->
			<!--搜索-->
			<div id="search">
				<form action="${ctx }/SerchServlet" method="post" name="search">
					<input type="text" id="ii" name="serchContent" class="search_text" onkeydown="if (event.keyCode==13) {}" onblur="if(this.value=='')value='搜索图书，如：计算机';" onfocus="if(this.value=='搜索图书，如：计算机')value='';" value="搜索图书，如：计算机" />
					<input type="image" src="../img/search.jpg" class="search_button" onclick="if(document.forms['search'].serchContent.value=='搜索图书，如：计算机')document.forms['search'].serchContent.value='';" alt="Search" />
					<div id="hot">
						<span>热搜：</span>
						<span><a href="#">高等数学</a></span>
						<span><a href="#">三国志</a></span>
					</div>
				</form>
			</div>
		</div>
		<div id="main">
			<div id="fenlei">
				<div class="has_children">
					<button>专业</button>
					<a>软件工程</a>
					<a>计算机科学与技术专业</a>
					<a>计算机科学与技术专业</a>
					<a>教育技术学</a>
					<a>图书情报与档案管理类</a>
					<a>物理学（公费师范）</a>
					<a>物理学（非公费师范）</a>
					<a>化学（非公费师范）</a>
					<a>化学（公费师范）</a>
					<a>数学与应用数学</a>
					<a>数学与应用数学（公费师范）</a>
					<a>心理学（非公费师范）</a>
					<a>英语（公费师范）</a>
					<a>生物科学（公费师范）</a>
					<a>经济学类</a>
					<a>化学</a>
					<a>统计学</a>
					<a>地理科学（公费师范）</a>
					<a>生物科学（非公费师范）</a>
					<a>生物科学（非公费师范）</a>
					<a>教育学类</a>
					<a>金融学类</a>
					<a>工商管理类</a>
					<a>计算机</a>
					<a>外国语言文学类</a>
					<a>汉语言文学（非公费师范）</a>
					<a>英语</a>
					<a>商务英语</a>
					<a>日语</a>
					<a>汉语言文学（公费师范）</a>
					<a>图书情报与档案管理类</a>
					<a>思想政治教育（公费师范）</a>
					<a>历史学（公费师范）</a>
					<a>地理科学（非公费师范）</a>
					<a>法学</a>
					<a>行政管理</a>
					<a>新闻传播学类</a>
					<a>俄语</a>
					<a>政治学类</a>
					<a>哲学</a>
					<a>外国语言文学类</a>
					<a>物流管理与工程类</a>
					<a>学前教育</a>
					<a>小学教育（公费师范）</a>
					<a>公共管理类</a>
					<a>金融学类（中外合作办学）</a>
					<a>工商管理类（中外合作办学）</a>
					<a>物流管理与工程类（中外合作办学）</a>
					<a>公共管理类（中外合作办学）</a>

				</div>
				<div class="has_children">
					<button>年级</button>
					<a>大一</a>
					<a>大二</a>
					<a>大三</a>
					<a>大四</a>
					<a>研一</a>
					<a>研二</a>
					<a>研三</a>
				</div>
				<div class="has_children">
					<button>其他</button>
					<a>文学小说</a>
					<a>人文社科</a>
					<a>科技IT</a>
					<a>文教考试</a>
					<a>经管励志</a>
					<a>生活艺术</a>
				</div>
				<script language="JavaScript" src="../js/fenlei.js"></script>
			</div>
			<div id="list">
				<div id="sort">
					<span>综合排序</span>&nbsp|
					<span>出版时间</span>&nbsp|
					<span>上架时间</span>&nbsp|
					<span>价格</span>
				</div>
				<!--商品条目-->
				<div class="list-group">
				
					<c:forEach var="book"  items="${books}">
                		<div class="item">
                			<img src="../img/book/${book.image }">
	                		<div class="item_name">${book.bookName}</div>
	                		<div class="item_pinxiang">${book.phase}</div>
	                		<div class="item_price">￥${book.currentCost}</div>
	                		<div class="item_others">${book.author}/${book.press}</div>
            				<button onclick="location.href='/ttl/a/details.jsp?id=${book.id }'">查看详情</button>
            			</div>
        			</c:forEach>
        			
				</div>
				<script language="JavaScript" src="../js/fenyedaima.js"></script>
				<!--以上为24个商品条目-->
			</div>
		</div>

		<div id="footer">
			<p>
				<a href="#">使用条件</a>
				&nbsp
				<a href="#">隐私声明</a>
				&nbsp; All Rights Reserved
			</p>
		</div>

	</body>

</html>