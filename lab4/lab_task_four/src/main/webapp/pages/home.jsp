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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<h2>Welcome to the Home Page</h2>
<h3>Registered Courses:</h3>

<table class="table">
    <thead class="thead-dark">
    <tr>
        <th scope="col">#</th>
        <th scope="col">Course Name</th>
        <th scope="col">Course Code</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <c:forEach var="course" items="${courses}">
    <tr>
        <th scope="row">${course.id}</th>
        <td>${course.courseName}</td>
        <td>${course.courseCode}</td>
    </tr>
    </c:forEach>

    </tbody>
</table>
</body>
</html>
