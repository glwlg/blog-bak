<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>博客乐园</title>
</head>
<body>
<body>
		<h1>博客乐园</h1>
		<a href="blogger/login.jsp">登陆</a> <a href="user/reg.jsp">成为博主</a>

		<h2>热门博客</h2>
		<div id="main">
			<div id="title">
				<a class="title">热门博主</a>
				<ul>
						<li><img align="left" src="images/pic/$ {ulist.uid }_20.jpg"
							onerror="javascript:this.src='images/pic/default_20.jpg'"><a
							href="main.jsp?muid=$ {ulist.uid }">$ {ulist.name }</a></li>
					<li><a href="showAllBloggers.jsp">查看所有博主</a></li>
				</ul>
			</div>
			<div id="blog">
					<h3>$ {hotblog.btitle }</h3>
				<p class="time" align="right">$ {hotblog.btime }</p>
				<p class="content">$ {hotblog.blog }</p>
				<p class="show">
					浏览[$ {hotblog.bsort }] | <a href="main.jsp?muid=${muid }#/bid=${hotblog.bid }&blog.jsp">评论</a>[0]
				</p>
			</div>
		</div>
</body>

</body>
<style type="text/css">
h1 {
	font-family: "Microsoft YaHei UI";
}

body {
	color: white;
	background-color: black;
}

a {
	text-decoration: none;
	font-size: 18px;
	font-family: "Microsoft YaHei UI";
}

a:link {
	color: #FF9;
}

a:visited {
	color: #09C;
}

a:hover {
	color: #F00;
	text-decoration: underline;
}

a:active {
	color: #000;
}

#title li {
	list-style: none;
}

#title li a {
	text-decoration: none;
	font-size: 18px;
	font-family: "Microsoft YaHei UI";
}

#title li a:link {
	color: #09C;
}

#title li a:visited {
	color: #FF9;
}

#title li a:hover {
	color: #F00;
	text-decoration: underline;
}

#title li a:active {
	color: #000;
}

#title {
	float: left;
	margin-top: 30px;
	border-style: double;
	border-color: #999;
}

#blog {
	width: 70%;
	margin-top: 30px;
	border-style: double;
	border-color: #999;
	margin-left: 50px;
}

#main {
	width: 1024px;
}

.title {
	font-family: "Microsoft YaHei UI";
	font-size: 24px;
	font-weight: bold;
	color: white;
}
</style>
</html>