<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Users</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h3>Users List</h3>

    <form class="form-inline" role="form" action="/search" method="post">
        <input type="text" class="form-control" name="pattern" placeholder="Search">
        <input type="submit" class="btn btn-default" value="Search">
    </form>

    <table class="table table-striped">
        <thead>
        <tr>
            <td><b>userId</b></td>
            <td><b>username</b></td>
            <td><b>email</b></td>
            <td><b>password</b></td>
            <td><b>Action</b></td>
        </tr>
        </thead>
              <tr>
                  <c:forEach var = "users" items="${users}">
                <td>${users.userId}</td>
                <td>${users.username}</td>
                <td>${users.email}</td>
                <td>${users.password}</td>
                <td><a href="/delete?id=${users.username}">Delete</a></td>
                  </c:forEach>
            </tr>
    </table>

    <form class="form-inline" role="form" action="/add_page" method="post">
        <input type="submit" class="btn btn-default" value="Add new">
    </form>
</div>
</body>
</html>