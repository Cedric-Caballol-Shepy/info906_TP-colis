<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        <p>Etat (état actuel = ${currentEtat}):</p>
        <select name="etat">
        <c:forEach items="${etatsList}" var="option">
            <option value="${option}">
                <c:out value="${option}"></c:out>
            </option>
        </c:forEach>
        </select>
        <br>
        <input type="submit" name="submit">
    </form>
    <br>
    <a href="index.jsp">Retour à l'accueil</a>
</body>
</html>
