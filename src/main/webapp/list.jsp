<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客户显示列表</title>
</head>
<body>
	<table border="1">
		<c:forEach items="${users}" var="u" varStatus="vs">
			<tr style='background-color: ${vs.count % 2==0?"gray":""}'>
				<td>${u.id}</td>
				<td>${u.username}</td>
				<td>${u.password}</td>
				<td>${u.age}</td>
				<td>${u.address}</td> </tr>
		</c:forEach>
	</table>
</body>
</html>