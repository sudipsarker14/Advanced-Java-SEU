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
    <title>Home</title>
</head>
<body>
<h2>Welcome to the Home Page</h2>
<h3>Registered Courses:</h3>
<table border="1">
    <thead>
    <tr>
        <th>Course Name</th>
        <th>Course Code</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="course" items="${courses}">
        <tr>
            <td>${course.courseName}</td>
            <td>${course.courseCode}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>

