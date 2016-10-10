<%-- 
    Document   : modifier_genre
    Created on : 10 oct. 2016, 14:43:43
    Author     : admin
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Modifier genre</h1>
        <div>
            <c:set var="route">
                <spring:url value="/" />
            </c:set>
            <form:form action="${route}modifier_genre" modelAttribute="genreAct">
                <label>Nom du genre:</label><br/>
                <form:hidden path="id" /><br/>
                <form:input path="nom" /><br/>
                <input type="submit" value="Modifier" /><br/>
            </form:form>
        </div>
    </body>
</html>
