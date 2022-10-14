<%-- 
    Document   : index
    Created on : 28-Sep-2022, 2:36:20 pm
    Author     : mohit
--%>

<%@page import="com.practice.ConnectionProvider"%>
<%@page  import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello, Mohit this side....</h1>
        
        <%!
        
        Connection con=ConnectionProvider.getConnection();
        %>
        
        <h1><%= con%></h1>
    </body>
</html>
