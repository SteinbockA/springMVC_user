<%--
  Created by IntelliJ IDEA.
  User: 亦逍
  Date: 2015/3/15 0015
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>修改用户</title>
</head>
<body>
    <form:form method="POST" modelAttribute="user">
        Username:<form:input path="username"/><br/>
        Password:<form:password path="password"/><br/>
        Nickname:<form:input path="nickname"/><br/>
        Email:<form:input path="email"/><br/>
        <input type="submit" value="更新"/>
    </form:form>
</body>
</html>
