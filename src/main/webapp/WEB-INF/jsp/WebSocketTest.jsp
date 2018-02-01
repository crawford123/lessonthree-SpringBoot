<%--
  Created by IntelliJ IDEA.
  User: Fengli
  Date: 1/9/2018
  Time: 5:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WebSocket广播式</title>
    <script src="/sockjs.min.js"></script>
    <script src="/stomp.min.js"></script>
    <script src="/jquery.min.js"></script>
</head>
<body onload="disconnect()">
       <button id="connect" onclick="connect()">连接</button>
       <button id="disconnect" onclick="disconnect()" disabled="disabled">断开连接</button><br/>
       <div id="inputDiv">
           输入名称：<input type="text" id="name"/><br/>
         <button id="sendName" onclick="sendName()">发送</button><br/>
         <p id="response"></p>
       </div>
</body>
</html>
