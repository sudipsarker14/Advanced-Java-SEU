<%--
  Created by IntelliJ IDEA.
  User: sudip
  Date: 3/28/2025
  Time: 7:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Register</title>
</head>
<body>
<h2>Register</h2>
<form action="/register" method="post">
  <label>Username:</label>
  <input type="text" name="username" required>
  <br>
  <label>Password:</label>
  <input type="password" name="password" required>
  <br>
  <button type="submit">Register</button>
</form>
</body>
</html>

