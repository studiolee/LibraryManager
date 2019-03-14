<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>图书信息管理中心</title>
    <meta http-equiv="content-type"content="text/html; charset=utf-8" />
    
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/div.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/time.js"></script>
  </head>
  
  <body>
<div id="header">
	<div>
		<h1>Welcome to our Library Manager System !</h1>
	</div>
	<div>
		<div id="times">
            
        </div>
	</div>
</div>

<div id="nav">
<h2>用户信息管理界面</h2>
	<h3>欢迎你，${rd.rname}</h3>
	<div>
		<a href="${pageContext.request.contextPath}/reader/searchYourInfo?rno1=${rd.rno}"><b>查询你的所有信息</b></a>
	</div>
	<div>
		<a href="${pageContext.request.contextPath}/book/findBookListByRNO?rno2=${rd.rno}"><b>查询你所借的所有书籍</b></a>
	</div>
	<div>
		<h3><a href="${pageContext.request.contextPath}/reader/toBookInfo">前往书籍信息管理页面</a></h3>
	</div>
</div>
<div id="section">
	<div>
		<c:if test="${not empty rdInfo}">
		<table border="1" align="center" cellpadding="2" >
			<tr>
				<th>读者姓名</th><th>读者号</th><th>证件有效性</th><th>联系方式</th><th>借书数量</th><th>操作</th>
			</tr>
			<tr>
				<td>${rdInfo.rname}</td><td>${rdInfo.rno}</td><td>${rdInfo.rstate}</td><td>${rdInfo.tel}</td><td>${rdInfo.jyCount}</td>
				<td><a href="${pageContext.request.contextPath}/reader/openUpdateReaderInfo?rno3=${rdInfo.rno}">修改信息</a></td>
			</tr>
		</table>
		</c:if>
	</div>
	<div>
		<c:if test="${not empty rdInfoToUpdate}">
			<h3>请在下方修改你的信息</h3>
			<form action="${pageContext.request.contextPath}/reader/updateReader" method="POST" enctype="multipart/form-data">
				<table>
					<tr>
						<td>姓名</td>
						<td><input name="rname" value="${rdInfoToUpdate.rname}" type="text"/></td>
					</tr>
					<tr>
						<td>读者号</td>
						<td><input name="rno" value="${rdInfoToUpdate.rno}" type="text"/></td>
					</tr>
					<tr>
						<td>联系电话</td>
						<td><input name="tel" value="${rdInfoToUpdate.tel}" type="text"></td>
					</tr>
					<tr>
						<td>头像</td>
						<td>
						 	<c:if test="${rdInfoToUpdate.pic != null}">
						 		<img alt="图片不被支持" src="/pic/${rdInfoToUpdate.pic}" width="80" height="100">
						 	</c:if>
						 	<input type="file" name="reader_pic"/>
						</td>
					</tr>
					<tr>
						<td><input value="提交" type="submit"/></td>
					</tr>
				</table>
			</form>
		</c:if>
	</div>
	<div>
		<c:choose>
			<c:when test="${not empty bookList}">
				<table border="1" align="center" cellpadding="2">
					<tr>
						<th>图书名</th><th>作者</th><th>出版社</th><th>应该归还的日期</th><th>图书种类</th>
					</tr>
					<c:forEach items="${bookList}" var="book">
					<tr>
						<td>${book.bname}</td><td>${book.author}</td><td>${book.pub}</td><td>${book.dateFormat}</td><td>${book.bkname}</td>
					</tr>
					</c:forEach>
				</table>
			</c:when>
			<c:otherwise>
				<b>${message3}</b>
			</c:otherwise>
		</c:choose>
	</div>
</div>
<div id="footer">
leeray@163
</div>
 
  </body>
</html>
