<%@page import="com.shamim.dao.UserDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="user" class="com.shamim.bean.User"/>
<jsp:setProperty property="*" name="user"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
    <center>
        <h1>Login Form</h1>
        <form action="login.jsp">
            <b>Username</b>
            <input type="text" name="username"><br>
            <b>Password</b>
            <input type="password" name="password"><br><br>
            <input type="submit" value="Login">
            <a href="registration.jsp"><button type="button">New Registration</button></a>
        </form>

        <%
            boolean status = UserDao.validate(user);
            if (status) {
                response.sendRedirect("display.jsp");
            }
        %>
    </center>
</body>
</html>
