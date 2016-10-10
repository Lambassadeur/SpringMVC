<%-- 
    Document   : ajouter_genre
    Created on : 10 oct. 2016, 16:27:07
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ajouter genre</h1>
        <div>
            <c:set var="route">
                <spring:url value="/" />
            </c:set>
            <form:form action="${route}ajouter_genre" modelAttribute="genreAct">
                <label>Nom du genre:</label><br/>
                <form:hidden path="id" /><br/>
                <form:input path="nom" /><br/>
                <input type="submit" value="Ajouter" /><br/>
            </form:form>
        </div>    </body>
</html>
