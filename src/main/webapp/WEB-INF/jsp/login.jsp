<%--
  Created by IntelliJ IDEA.
  User: Fengli
  Date: 12/21/2017
  Time: 3:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path=request.getContextPath();
    request.setAttribute("path",path);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="get" action="${path}/loginUser/login">
    用户名：<input type="text"name="username"/><br/>
    密码：<input type="text" name="password"/>
    <input type="submit" value="登录"/>
</form>

</body>
</html>