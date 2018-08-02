<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<td>#id</td>
		<td>number</td>
		<td>name</td>
		<td>password</td>
		<td>sex</td>
		<td>telephone</td>
		<td>birthday</td>
		<td>classId</td>
	</tr>
	<c:forEach var="s" items="${slist }">
		<tr>
			<td>${s.id }</td>
			<td>${s.number }</td>
			<td>${s.name }</td>
			<td>${s.password }</td>
			<td>${s.sex }</td>
			<td>${s.telephone }</td>
			<td>${s.birthday }</td>
			<td>${s.classId }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>