<%@page import="com.shamim.dao.UserDao"%>
<%@page import="com.shamim.bean.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Page</title>
    </head>
    <body>
    <center>
        <%
            String id = request.getParameter("id");
            User user = UserDao.getRecordById(Integer.parseInt(id));
        %>

        <h1>Update Form</h1>
        <form action="updateprocess.jsp">
            <input type="hidden" name="id" value="<%=user.getId()%>">
            <b>First Name</b>
            <input type="text" name="fname" value="<%=user.getFname()%>"><br>
            <b>Last Name</b>
            <input type="text" name="lname" value="<%=user.getLname()%>"><br>
            <b>Username</b>
            <input type="text" name="username" value="<%=user.getUsername()%>"><br>
            <b>Password</b>
            <input type="password" name="password" value="<%=user.getPassword()%>"><br><br>
            <input type="submit" value="Update">
        </form>
    </center>
</body>
</html>
