<%--
  Created by IntelliJ IDEA.
  User: 76803
  Date: 2018/8/6
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<tbody>
<tr class="warning">
    <th>ID</th>
    <th>用户名</th>
    <th>密码</th>
    <th>性别</th>
    <th>住址</th>
</tr>
<c:forEach items="${list}" var="user">
<tr class="active">
    <td width="60" width="40%">${user.id}</td>
    <td width="30%">${user.username}</td>
    <td width="15%">${user.password}</td>
    <td width="20%">${user.sex}</td>
    <td width="10%">${user.address}</td>
</tr>
</c:forEach>
</tbody>
</body>
</html>
