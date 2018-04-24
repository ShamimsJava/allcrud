<%@page import="com.shamim.dao.UserDao"%>
<%@page import="java.util.List"%>
<%@page import="com.shamim.bean.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="user" class="com.shamim.bean.User"/>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
    List<User> list = UserDao.getAllRecords();
    request.setAttribute("list", list);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Records</title>
    </head>
    <body>
    <center>
        <h2>All users information</h2>
        <h3><a href="registration.jsp">Add New Record</a></h3>
        <table border="1" width="70%">
            <tr>
                <th>Id</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Username</th>
                <th>Password</th>
                <th>Update</th>
                <th>Delete</th>
            </tr>
            <c:forEach var="user" items="${list}">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.fname}</td>
                    <td>${user.lname}</td>
                    <td>${user.username}</td>
                    <td>${user.password}</td>
                    <td><a href="update.jsp?id=${user.getId()}">Update</a></td>
                    <td><a href="delete.jsp?id=${user.getId()}">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
        <h3><a href="login.jsp">Logout</a></h3>
    </center>
</body>
</html>
