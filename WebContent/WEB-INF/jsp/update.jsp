<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/update.do" method="post">
	<table>
		<tr>
			<td colspan="2">用户信息修改</td>
		</tr>
		<tr>
			<th>用户名</th>
			<th><input type="text" name="username" value = "${user.username }"/></th>
		</tr>
		<tr>
			<th>密码</th>
			<th><input type="text" name="password" value = "${user.password }"/></th>
		</tr>
		<tr>
			<th colspan="2">
				<input type="submit" value="提    交"/>
				<input type="hidden" name="id" value="${user.id }"/>
			</th>
		</tr>
	</table>
</form>
</body>
</html>