<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

 	<title>注册界面</title>
	<meta http-equiv="content-type"content="text/html; charset=utf-8" />
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
<style>
#header {
   background-color:black;
   height:20%;
   color:white;
   text-align:center;
   padding:5px;
}
#nav {
    line-height:30px;
    background-color:#eeeeee;
    height:70%;
    width:350px;
    float:left;
    padding:5px;	      
}
#section {
    width:700px;
    float:left;
    padding:10px;
    text-align:center;	 
}
#footer {
    background-color:black;
    height:10%;
    color:white;
    clear:both;
    text-align:center;
   padding:5px;	 	 
}
</style>
</head>

<body>
	<div id="header">
<h1>Welcome!</h1>
</div>

<div id="nav">
<pre>
try{
Thread.sleep(1000*60*60*24);
} catch (InterruptedException e){
	Sysotem("每天都想睡一天")
}
</pre>
</div>

<div id="section">
<h2>请填写注册信息</h2>
	<form action="${pageContext.request.contextPath}/reader/register" method="POST">
		<table align="center">
			<tr>
				<td>姓名</td>
				<td><input name="rname" type="text" /></td>
			</tr>
			<tr>
				<td>读者号</td>
				<td><input name="rno" type="text" /></td>
			</tr>
			<tr>
				<td>电话</td>
				<td><input name="tel" type="text" /></td>
			</tr>
			<tr>
				<td><input value="注册" type="submit"></td>
			</tr>
		</table>
	</form>
</div>
	
<div id="footer">
leeray@163
</div>
	
	
</body>
</html>
