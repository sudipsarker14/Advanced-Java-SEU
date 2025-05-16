<%--
  Created by IntelliJ IDEA.
  User: sudip
  Date: 5/16/2025
  Time: 9:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Form</title>
    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="card shadow-sm">
        <div class="card-header bg-primary text-white">
            <h4 class="mb-0">Enter Student Details</h4>
        </div>
        <div class="card-body">
            <form action="save-student" method="post">
                <div class="mb-3">
                    <label class="form-label">Name:</label>
                    <input type="text" name="name" class="form-control" required/>
                </div>
                <div class="mb-3">
                    <label class="form-label">Email:</label>
                    <input type="email" name="email" class="form-control" required/>
                </div>
                <div class="mb-3">
                    <label class="form-label">Mobile:</label>
                    <input type="text" name="mobile" class="form-control" required/>
                </div>
                <div class="mb-3">
                    <label class="form-label">Date of Birth:</label>
                    <input type="date" name="dob" class="form-control" required/>
                </div>
                <button type="submit" class="btn btn-success">Save Student</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
