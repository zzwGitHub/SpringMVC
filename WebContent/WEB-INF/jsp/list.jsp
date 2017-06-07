<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function confirm() {
		if (confirm("确定删除")) {
			
		} else{
			
		}
	
	}
</script>
</head>
<body>
<table>
 	<tr><a href="${pageContext.request.contextPath}/addpage.do">添加</a></tr>
	<tr>
		<th>编号</th>
		<th>用户名</th>
		<th>密码</th>
		<th>变更</th>
		<th>删除</th>
	</tr>
	<c:forEach var="user" items = "${users }" >
	<tr>
		<td>${user.ID}</td>
		<td>${user.username}</td>
		<td>${user.password}</td>
		<td><a href="${pageContext.request.contextPath}/updatepage.do?id=${user.id}">修改</a></td>
		<td onclick="confirm()"><a href="${pageContext.request.contextPath}/delete.do?id=${user.id}" >删除</a></td>
	</tr>
	</c:forEach>
	
</table>
</body>
</html>