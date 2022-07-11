<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Lista - Usuario</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</head>
<body>
<header>
    <nav class="navbar mb-3 px-5" style="background-color: #e3f2fd;">
        <a class="navbar-brand" href="/lista-socio">
            <img src="../../../img/ClubSocial_logo-baixa2.png" alt="40" width="32" height="32" class="d-inline-block align-text-top"> GRESMC
        </a>
    </nav>
</header>
<div class="container">
    <table class="table">
        <thead>
            <tr>
                <th scope="col">Matricula</th>
                <th scope="col">Nome</th>
                <th scope="col">Telefone</th>
                <th scope="col">Setor</th>
                <th scope="col">Status</th>
                <th scope="col"></th>
            </tr>
        </thead>
        <tbody>
            <jsp:useBean id="userViewDTOS" scope="request" type="java.util.List"/>
            <c:forEach items="${userViewDTOS}" var="userViewDTO">
                <tr>
                    <th scope="row">${userViewDTO.registration()}</th>
                    <td>${userViewDTO.name()}</td>
                    <td>${userViewDTO.mobile()}</td>
                    <td>${userViewDTO.workSector()}</td>
                    <td>${userViewDTO.active() ? 'ativo': 'inativo'}</td>
                    <td>
                        <form action="/novo-socio/${userViewDTO.id()}">
                            <input class="btn btn-secondary btn-sm" type="submit" value="Editar">
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
<footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
    <div class="container">
        <p class="text-center text-muted">&copy; 2022 Gresmc</p>
    </div>
</footer>
</body>
</html>