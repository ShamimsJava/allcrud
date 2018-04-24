<%@page import="com.shamim.dao.UserDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update</title>
    </head>
    <body>
        <jsp:useBean id="user" class="com.shamim.bean.User"/>
        <jsp:setProperty property="*" name="user"/>
        
        <%
            UserDao.update(user);
            response.sendRedirect("display.jsp");
        %>
        
    </body>
</html>
