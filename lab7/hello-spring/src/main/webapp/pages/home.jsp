<%--
  Created by IntelliJ IDEA.
  User: iftekher
  Date: 3/21/25
  Time: 11:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/style.css"/>
</head>
<body>
    <h1 id="main-heading-id">Welcome ${user.username}</h1>
    <h1>Login Success</h1>
    <%--<%
        boolean login = (boolean) request.getAttribute("login");

        if(login) {
    %>
            <h1>Login Success</h1>
    <%
        } else {
    %>
           <h1>Login Failed</h1>
    <%
        }--%>
    %>

</body>
</html>
