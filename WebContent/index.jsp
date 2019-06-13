<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>主页</title>
		<link href="css/header.css" rel="stylesheet" type="text/css">
		<link href="css/index_main.css" rel="stylesheet" type="text/css">
		<link rel="Stylesheet" type="text/css" href="css/loginDialog.css" />
		<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
		<script language="JavaScript" src="js/lunbotu.js"></script>
		<script language="JavaScript" src="js/directory.js"></script>
	</head>
	<body>
		<div id="LoginBox">
			<div class="row1">
				&nbsp;&nbsp;&nbsp;&nbsp;登录
				<a href="javascript:void(0)" title="关闭窗口" class="close_btn" id="closeBtn">×</a>
			</div>
			<form action="LoginServlet" method="post">
				<div class="row">
					用户名: <span class="inputBox">
                <input type="text" id="txtName" name="username" placeholder="账号" />
            </span>
					<a href="javascript:void(0)" title="提示" class="warning" id="warn">*</a>
				</div>
				<div class="row">
					密&nbsp;&nbsp;&nbsp;&nbsp;码: <span class="inputBox">
                <input type="password" id="txtPwd" name="password" placeholder="密码" />
            </span>
					<a href="javascript:void(0)" title="提示" class="warning" id="warn2">*</a>
				</div>
				<div class="row">
					<button href="#" id="loginbtn">登录</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="register.html" id="zhuce">注册</a>
				</div>
			</form>

		</div>
		<script type="text/javascript" src="js/login.js">
		</script>
		<div style="text-align:center;">
		</div>
		<div id="header">
			<div class="header_logo">
				<a href="index.jsp">
					<img src="img/logo.png" />
				</a>
			</div>
			<div class="header_link">
				<a href="login.jsp">登录</a>/<a href="register.jsp">注册</a>
				|
				<a href="${ctx }/a/userInfo.jsp">个人中心</a>
				|
				<a href="${ctx }/a/launch.jsp">上架图书</a>
				|
			</div>
			<!--搜索-->
			<div id="search">
				<form action="SerchServlet" method="post" name="search">
					<input type="text" id="ii" name="serchContent" class="search_text" onkeydown="if (event.keyCode==13) {}" onblur="if(this.value=='')value='搜索图书，如：计算机';" onfocus="if(this.value=='搜索图书，如：计算机')value='';" value="搜索图书，如：计算机" />
					<input type="image" src="img/search.jpg" class="search_button" onclick="if(document.forms['search'].serchContent.value=='搜索图书，如：计算机')document.forms['search'].serchContent.value='';" alt="Search" />
					<div id="hot">
						<span>热搜：</span>
						<span><a href="SerchServlet?serchContent=高等数学">高等数学</a></span>
						<span><a href="SerchServlet?serchContent=jisanji">三国志</a></span>
					</div>
				</form>
			</div>
		</div>

		<div id="main">
			<!--轮播图-->
			<div id="tuijian">推荐</div>
			<div id="lunbotu">
				<!--第一个轮播图-->
				<div id="container">
					<div id="list" style="left: -250px;">
						<img src="img/5.jpg" alt="1" />
						<img src="img/1.jpg" alt="1" />
						<img src="img/2.jpg" alt="2" />
						<img src="img/3.jpg" alt="3" />
						<img src="img/4.jpg" alt="4" />
						<img src="img/5.jpg" alt="5" />
						<img src="img/1.jpg" alt="5" />
					</div>
					<div id="buttons">
						<span index="1" class="on"></span>
						<span index="2"></span>
						<span index="3"></span>
						<span index="4"></span>
						<span index="5"></span>
					</div>
					<a href="javascript:;" id="prev" class="arrow">&lt;</a>
					<a href="javascript:;" id="next" class="arrow">&gt;</a>
				</div>
				<!--第二个轮播图-->
				<div id="container2">
					<div id="list2" style="left: -250px;">
						<img src="img/5.jpg" alt="1" />
						<img src="img/1.jpg" alt="1" />
						<img src="img/2.jpg" alt="2" />
						<img src="img/3.jpg" alt="3" />
						<img src="img/4.jpg" alt="4" />
						<img src="img/5.jpg" alt="5" />
						<img src="img/1.jpg" alt="5" />
					</div>
					<div id="buttons2">
						<span index="1" class="on"></span>
						<span index="2"></span>
						<span index="3"></span>
						<span index="4"></span>
						<span index="5"></span>
					</div>
					<a href="javascript:;" id="prev2" class="arrow">&lt;</a>
					<a href="javascript:;" id="next2" class="arrow">&gt;</a>
				</div>
				<!--第三个轮播图-->
				<div id="container3">
					<div id="list3" style="left: -250px;">
						<img src="img/5.jpg" alt="1" />
						<img src="img/1.jpg" alt="1" />
						<img src="img/2.jpg" alt="2" />
						<img src="img/3.jpg" alt="3" />
						<img src="img/4.jpg" alt="4" />
						<img src="img/5.jpg" alt="5" />
						<img src="img/1.jpg" alt="5" />
					</div>
					<div id="buttons3">
						<span index="1" class="on"></span>
						<span index="2"></span>
						<span index="3"></span>
						<span index="4"></span>
						<span index="5"></span>
					</div>
					<a href="javascript:;" id="prev3" class="arrow">&lt;</a>
					<a href="javascript:;" id="next3" class="arrow">&gt;</a>
				</div>
				<div id="notice">
					<div id="notice_title">公告</div>
					<div id="notice_content">
						如果你无法简洁的表达你的想法，那只说明你还不够了解它。 -- 阿尔伯特·爱因斯坦
					</div>
				</div>
			</div>
			<!--排行榜-->
			<div id="rebang">
				热榜
			</div>
			<div id="rankList">
				<div id="rank1">
					<div id="rank1_title">交易榜</div>
					<ol>
						<li>
							<a href>红楼梦</a>
						</li>
						<li>
							<a href>三国演义</a>
						</li>
						<li>
							<a href>西游记</a>
						</li>
						<li>
							<a href>史书</a>
						</li>
						<li>
							<a href>三字经</a>
						</li>
						<li>
							<a href>诗经</a>
						</li>
						<li>
							<a href>唐诗三百首</a>
						</li>
						<li>
							<a href>道德经</a>
						</li>
					</ol>
				</div>
				<div id="rank2">
					<div id="rank2_title">人气榜</div>
					<ol>
						<li>
							<a href>红楼梦</a>
						</li>
						<li>
							<a href>三国演义</a>
						</li>
						<li>
							<a href>西游记</a>
						</li>
						<li>
							<a href>史书</a>
						</li>
						<li>
							<a href>三字经</a>
						</li>
						<li>
							<a href>诗经</a>
						</li>
						<li>
							<a href>唐诗三百首</a>
						</li>
						<li>
							<a href>道德经</a>
						</li>
					</ol>
				</div>
				<div id="rank3">
					<div id="rank3_title">新书榜</div>
					<ol>
						<li>
							<a href>红楼梦</a>
						</li>
						<li>
							<a href>三国演义</a>
						</li>
						<li>
							<a href>西游记</a>
						</li>
						<li>
							<a href>史书</a>
						</li>
						<li>
							<a href>三字经</a>
						</li>
						<li>
							<a href>诗经</a>
						</li>
						<li>
							<a href>唐诗三百首</a>
						</li>
						<li>
							<a href>道德经</a>
						</li>
					</ol>
				</div>
			</div>
			<!--目录-->
			<div id="directory_fenlei">分类</div>
			<div id="directory">
				<div id="directory_buttons">
					<div id="directory_button1" onclick="dirClick1()">
						<span>专业</span>
					</div>
					<div id="directory_button2" onclick="dirClick2()">
						<span>年级</span>
					</div>
					<div id="directory_button3" onclick="dirClick3()">
						<span>其他</span>
					</div>
				</div>

				<div id="dictory_contents">
					<!--按专业-->
					<div id="directory_content1">
						<ul>
							<li>
								<a href="#">软件工程</a>
							</li>
							<li>
								<a href="#">计算机科学与技术专业</a>
							</li>
							<li>
								<a href="#">计算机科学与技术专业</a>
							</li>
							<li>
								<a href="#">教育技术学</a>
							</li>
							<li>
								<a href="#">图书情报与档案管理类</a>
							</li>
							<li>
								<a href="#">物理学（公费师范）</a>
							</li>
							<li>
								<a href="#">物理学（非公费师范）</a>
							</li>
							<li>
								<a href="#">化学（非公费师范）</a>
							</li>
							<li>
								<a href="#">化学（公费师范）</a>
							</li>
							<li>
								<a href="#">数学与应用数学</a>
							</li>
							<li>
								<a href="#">数学与应用数学（公费师范）</a>
							</li>
							<li>
								<a href="#">心理学（非公费师范）</a>
							</li>
							<li>
								<a href="#">英语（公费师范）</a>
							</li>
							<li>
								<a href="#">工商管理类</a>
							</li>
							<li>
								<a href="#">生物科学（公费师范）</a>
							</li>
							<li>
								<a href="#">经济学类</a>
							</li>
							<li>
								<a href="#">化学</a>
							</li>
							<li>
								<a href="#">统计学</a>
							</li>
							<li>
								<a href="#">地理科学（公费师范）</a>
							</li>
							<li>
								<a href="#">生物科学（非公费师范）</a>
							</li>
							<li>
								<a href="#">地理科学（非公费师范）</a>
							</li>
							<li>
								<a href="#">教育学类</a>
							</li>
							<li>
								<a href="#">金融学类（中外合作办学）</a>
							</li>
							<li>
								<a href="#">工商管理类</a>
							</li>
							<li>
								<a href="#">物流管理与工程类</a>
							</li>
							<li>
								<a href="#">公共管理类（中外合作办学）</a>
							</li>
							<li>
								<a href="#">外国语言文学类</a>
							</li>
							<li>
								<a href="#">汉语言文学（非公费师范）</a>
							</li>
							<li>
								<a href="#">英语</a>
							</li>
							<li>
								<a href="#">商务英语</a>
							</li>
							<li>
								<a href="#">日语</a>
							</li>
							<li>
								<a href="#">汉语言文学（公费师范）</a>
							</li>
							<li>
								<a href="#">图书情报与档案管理类</a>
							</li>
							<li>
								<a href="#">思想政治教育（公费师范）</a>
							</li>
							<li>
								<a href="#">历史学（公费师范）</a>
							</li>
							<li>
								<a href="#">地理科学（非公费师范）</a>
							</li>
							<li>
								<a href="#">法学</a>
							</li>
							<li>
								<a href="#">行政管理</a>
							</li>
							<li>
								<a href="#">新闻传播学类</a>
							</li>
							<li>
								<a href="#">俄语</a>
							</li>
							<li>
								<a href="#">政治学类</a>
							</li>
							<li>
								<a href="#">外国语言文学类</a>
							</li>
							<li>
								<a href="#">哲学</a>
							</li>
							<li>
								<a href="#">学前教育</a>
							</li>
							<li>
								<a href="#">小学教育（公费师范）</a>
							</li>
							<li>
								<a href="#">金融学类（中外合作办学）</a>
							</li>
							<li>
								<a href="#">工商管理类（中外合作办学）</a>
							</li>
							<li>
								<a href="#">物流管理与工程类（中外合作办学）</a>
							</li>
							<li>
								<a href="#">公共管理类（中外合作办学） </a>
							</li>

						</ul>
					</div>
					<!--按年级-->
					<div id="directory_content2">
						<ul>
							<li>
								<a href="#">
									大一
								</a>
							</li>
							<li>
								<a href="#">
									大二
								</a>
							</li>
							<li>
								<a href="#">
									大三
								</a>
							</li>
							<li>
								<a href="#">
									大四
								</a>
							</li>
							<li>
								<a href="#">
									研一
								</a>
							</li>
							<li>
								<a href="#">
									研二
								</a>
							</li>
							<li>
								<a href="#">
									研三
								</a>
							</li>
						</ul>
					</div>
					<div id="directory_content3">
						<ul>
							<li>
								<a href="#">文学小说</a>
							</li>
							<li>
								<a href="#">人文社科</a>
							</li>
							<li>
								<a href="#">科技IT</a>
							</li>
							<li>
								<a href="#">文教考试</a>
							</li>
							<li>
								<a href="#">经管励志</a>
							</li>
							<li>
								<a href="#">生活艺术</a>
							</li>
						</ul>
					</div>
				</div>
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