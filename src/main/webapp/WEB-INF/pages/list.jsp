<%--
  Created by IntelliJ IDEA.
  User: 12961
  Date: 2020/5/31
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

        <h3>查询所有的账户信息</h3>

        <c:forEach items="${list}" var="account">
            ${account.name}
            ${account.money}
            <br/>
        </c:forEach>
        <br/>
</body>
</html>
