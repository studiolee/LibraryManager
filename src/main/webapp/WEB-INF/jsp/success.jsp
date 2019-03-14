<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>图书信息管理中心</title>
    <meta http-equiv="content-type"content="text/html; charset=utf-8" />
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/div.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/time.js"></script>
  </head>
  
  <body>
<div id="header">
<h1>Welcome to our Library Manager System !</h1>
	<div>
		<div id="times">
            
        </div>
	</div>
</div>

<div id="nav">
<h2>书籍信息查找界面</h2>
	<h3>欢迎你，${rd.rname}</h3>
	<div>
		<h3>根据书名来查找书籍，可以输入部分书名</h3>
		<form action="${pageContext.request.contextPath}/book/findBookByName">
			<input name = "bname" type="text"/>
			<input value="查询" type="submit">
		</form>
	</div>
	<div>
		<h3>根据书号来查找书籍</h3>
		<form action="${pageContext.request.contextPath}/book/findBookByBNO">
			<input name = "bno" type="text"/>
			<input value="查询" type="submit">
		</form>
	</div>
	<div>
		<h3><a href="${pageContext.request.contextPath}/reader/toUserInfo">前往用户信息管理页面</a></h3>
	</div>
</div>

<div id="section">
	<div>
	<c:choose>
		<c:when test="${not empty bookList}">
		<table border="1" align="center">
			<tr>
				<th>图书名称</th><th>作者</th><th>出版社</th><th>图书类别</th><th>操作</th>
			</tr>
		<c:forEach items="${bookList}" var="book">
			<tr>
				<td>${book.bname}</td><td>${book.author}</td><td>${book.pub}</td><td>${book.bkname}</td>
				<td><a href="">预约</a>
			</tr>
		</c:forEach>
		</table>
		</c:when>
		<c:otherwise>
			<b>${message1}</b>
		</c:otherwise>
	</c:choose>
	</div>
	<div>
		<!-- 用choose代替if提高系统的健壮性 -->
		<c:choose>
			<c:when test="${not empty _book}">
				<table border="1" align="center">
				<tr>
					<th>图书名称</th><th>作者</th><th>出版社</th><th>图书类别</th><th>操作</th>
				</tr>
				<tr>
					<td>${_book.bname}</td><td>${_book.author}</td><td>${_book.pub}</td><td>${_book.bkname}</td>
					<td><a href="">预约</a>
				</tr>
				</table>
			</c:when>
			<c:otherwise>
				<b>${message2}</b>
			</c:otherwise>
		</c:choose>
	</div>
</div>
<div id="footer">
leeray@163
</div>
 
  </body>
</html>
