<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Rechercher un colis</title>
</head>
<body>
<h1>Rechercher un colis</h1>
<form action="RechercheServlet" method="post">
    Identifiant : <input type="number" name="idColis">
    <input type="submit" name="submit">
    <br>
    <a href="index.jsp">Retour à l'accueil</a>
</form>
</body>
</html>
