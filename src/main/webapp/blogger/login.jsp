<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/login.css" >
</head>
 <body>
   <div class="login">
	<div class="login-top">
		<h1>登陆</h1>
		<form action="blogger_login" method="post">
			<input  type="text" value="用户名或邮箱" id="blogger.userName" name="username" onfocus="if (this.value == '用户名或邮箱') {this.value = '';}" onblur="if (this.value == '') {this.value = '用户名或邮箱';}">
			<input type="password" value="password" id="blogger.password" name="password" onfocus="if (this.value == 'password') {this.value = '';}" onblur="if (this.value == '') {this.value = 'password';}">
	    <div class="forgot">
	    	${msg }<a href="blogger/pwdFindBack.jsp">忘记密码</a>
	    	<input type="submit" value="登陆" >
	    </div>
	    </form>
	</div>
	<div class="login-bottom">
		<h3>新用户? &nbsp;<a href="blogger/reg.jsp">注册</a></h3>
	</div>
</div>	
  </body>
</html>