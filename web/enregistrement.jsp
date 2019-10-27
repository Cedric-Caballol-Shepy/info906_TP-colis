<%--
  Created by IntelliJ IDEA.
  User: cedri
  Date: 09/10/2019
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Enregistrement</title>
</head>
<body>
    <h1>Enregistrer un colis</h1>
    <div>
        <c:if test="${not empty idColis}">
            <p>Vous avez enregistré le colis : ${idColis}</p>
        </c:if>
    </div>
    <form method="post">
        Poids : <input type="number" name="poids"> g
        Valeur : <input type="number" step="0.01" name="valeur"> €
        <p>Position d'origine : </p>
        Latitude : <input type="text" name="latitudeOrig">
        Longitude : <input type="text" name="longitudeOrig">
        Emplacement : <input type="text" name="emplacementOrig">
        <p>Position de destination : </p>
        Latitude : <input type="text" name="latitudeDest">
        Longitude : <input type="text" name="longitudeDest">
        Emplacement : <input type="text" name="emplacementDest">
        <br>
        <input type="submit" name="submit">
    </form>
    <br>
    <a href="index.jsp">Retour à l'accueil</a>
</body>
</html>
