<%--
  Created by IntelliJ IDEA.
  User: Fengli
  Date: 1/9/2018
  Time: 3:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<form action="/login" method="post">
   <%-- <input type="hidden" name="${_csrf.parameterName}" value="${_crsf.token}"/>--%>
    用户名：<input type="text" name="username"/><br/>
    密码： <input type="password" name="password"/><br/>
    <input type="submit" value="登录"/><br/>
</form>
</body>
</html>
