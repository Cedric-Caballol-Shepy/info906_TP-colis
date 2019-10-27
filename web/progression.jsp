<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Changer la progression du colis</title>
</head>
<body>
    <h1>Changer la progression du colis</h1>
    <form method="post">
        Colis : <input type="number" name="idColis" value="${idColis}">
        <p>Nouvelle position : </p>
        Latitude : <input type="text" name="latitude">
        Longitude : <input type="text" name="longitude">
        Emplacement : <input type="text" name="emplacement">
        <br>
        <input type="submit" name="submit">
    </form>
</body>
</html>
