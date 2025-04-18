<%--
  Created by IntelliJ IDEA.
  User: sudip
  Date: 4/18/2025
  Time: 1:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <!-- Loop through the courses list and display each course -->
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
