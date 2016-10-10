<%-- 
    Document   : genre_lister
    Created on : 10 oct. 2016, 11:01:49
    Author     : admin
--%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste des genres</title>
    </head>
    <body>
        <h1>Liste des genres</h1>
        <a href="<spring:url value="ajouter_genre" />">Ajouter genre</a>

        <br/><br/>
         <c:forEach items="${genres}" var="genreAct">
            <!--option value="{genreAct.id}">{genreAct.nom}</option-->
            ${genreAct.nom}
            <a href="supprimer_genre/${genreAct.id}">Supprimer</a>
            <a href="modifier_genre/${genreAct.id}">Modifier</a>
            <br/>
        </c:forEach> 
    </body>
</html>
