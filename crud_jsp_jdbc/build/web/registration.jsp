<%@page import="com.shamim.dao.UserDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="user" class="com.shamim.bean.User"/>
<jsp:setProperty property="*" name="user"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
    <center>
        <h1>Registration Form</h1>
        <form action="registration.jsp">
            <b>First Name</b>
            <input type="text" name="fname"><br>
            <b>Last Name</b>
            <input type="text" name="lname"><br>
            <b>Username</b>
            <input type="text" name="username"><br>
            <b>Password</b>
            <input type="password" name="password"><br><br>
            <input type="submit" value="Submit">
            <a href="login.jsp"><button type="button">Login</button></a>
        </form>
        <%
            UserDao.save(user);
        %>  
    </center>
</body>
</html>
