<%--
  Created by IntelliJ IDEA.
  User: 12961
  Date: 2021/11/15
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <a href="account/findAll">测试SpringMVC查询</a>

    <h3>测试包</h3>
    <form action="account/save" method="post">
        姓名：<input type="text" name="name"/><br/>
        金额：<input type="text" name="money"/><br/>
        <input type="submit" value="保存">
    </form>

</body>
</html>
