<%--
  Created by IntelliJ IDEA.
  User: iftekher
  Date: 3/21/25
  Time: 11:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7" crossorigin="anonymous">
</head>
<body>
    <h1>Hello</h1>
    <img src="/logo.png" alt="logo"/>
<%--`   <form action="/demo/login" method="POST">--%>
<%--        <input type="text" name="username"/> <br/>--%>
<%--        <input type="password" name="password"/> <br/>--%>
<%--        <input type="submit" value="Login">--%>
<%--    </form>--%>

    <div class="container">
        <form action="/demo/login" method="POST">
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Username</label>
                <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
            </div>
            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">Password</label>
                <input type="password" class="form-control" id="exampleInputPassword1">
            </div>
            <button type="submit" class="btn btn-primary">Login</button>
        </form>
    </div>

</body>
</html>
