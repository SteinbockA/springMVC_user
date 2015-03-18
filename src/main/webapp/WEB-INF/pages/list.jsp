<%--
  Created by IntelliJ IDEA.
  User: 亦逍
  Date: 2015/3/15 0015
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>显示用户列表</title>
</head>
<body>
    <a href = "add">添加用户</a>
    <br/>
    <c:forEach items="${users}" var="um">
        ${um.value.username}------
        ${um.value.password}------
        ${um.value.nickname}------
        ${um.value.email}<a href = "${um.value.username}/update">修改</a>
        </br>
    </c:forEach>
</body>
</html>
