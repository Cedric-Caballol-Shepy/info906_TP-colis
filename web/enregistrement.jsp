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
    <form action="EnregistrementServlet">
        Poids : <input type="number" name="poids">
        Valeur : <input type="number" name="valeur"> €
        <p>Position d'origine : </p>
        Latitude : <input type="text" name="latitude">
        Longitude : <input type="text" name="longitude">
        Emplacement : <input type="text" name="emplacement">
        <p>Position de destination : </p>
        Latitude : <input type="text" name="latitude">
        Longitude : <input type="text" name="longitude">
        Emplacement : <input type="text" name="emplacement">
        <input type="submit" name="submit">
    </form>
</body>
</html>
