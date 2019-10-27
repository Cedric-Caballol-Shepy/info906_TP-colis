<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Changer la progression ou suivre le colis ?</title>
</head>
<body>
    <c:set var = "idColis" scope = "page" value = "${param.idColis}"/>
    <h1>Changer la progression ou suivre le colis n°${idColis} ?</h1>
    <a href="ProgressionServlet?idColis=${idColis}">Changer la progression du colis</a>
    <br>
    <a href="SuiviServlet?idColis=${idColis}">Suivre le colis</a>
    <br>
    <a href="index.jsp">Retour à l'accueil</a>
</body>
</html>
