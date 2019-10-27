<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Suivi du colis</title>
</head>
<body>
    <h1>Suivi du colis n°${id}</h1>
    <p>Poids : ${poids} grammes</p>
    <p>Valeur : ${valeur}€</p>
    <hr>
    <p>Position actuelle :</p>
    <p>Latitude : ${latCurr}</p>
    <p>Longitude : ${longCurr}</p>
    <p>Emplacement : ${emplCurr}</p>
    <hr>
    <p>Position de destination : </p>
    <p>Latitude : ${latDest}</p>
    <p>Longitude : ${longDest}</p>
    <p>Emplacement : ${emplDest}</p>
    <hr>
    <p>Etat : ${etat}</p>
</body>
</html>
