<%--
  Created by IntelliJ IDEA.
  User: Fengli
  Date: 1/21/2018
  Time: 3:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传文件</title>
</head>
<body>
单个文件上传：<br/>
     <form action="/uploadPage/upload" method="post" enctype="multipart/form-data">
     <input type="file" name="file"/>
     <input type="submit" value="提交上传">

     </form>


</body>
</html>
