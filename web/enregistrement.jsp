<%--
  Created by IntelliJ IDEA.
  User: cedri
  Date: 09/10/2019
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Enregistrement</title>
</head>
<body>
    <h1>Enregistrer un colis</h1>
    <p>test here : ${test}</p>
    <form action="EnregistrementServlet" method="post">
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
        <input type="submit" name="submit">
    </form>
</body>
</html>
