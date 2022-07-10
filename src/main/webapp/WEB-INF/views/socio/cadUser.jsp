<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    <title>Document</title>
</head>
<body>
<div class="container">
    <div class="mb-5 p-2 bg-secondary text-white text-center rounded">
        <h1>Ficha Cadastral</h1>
    </div>
    <form:form action="/novo-socio" modelAttribute="newUserDTO" method="post">
        <div class="row mb-3">
            <div class="col">
                <form:label path="company" cssClass="form-label" >Empresa</form:label>
                <form:select path="company" cssClass="form-select" value="${company}">
                    <form:option value="" label="--Selecione--"/>
                    <c:forEach items="${companies}" var="company">
                        <form:option value="${company}" label="${company.getDisplayName()}"/>
                    </c:forEach>
                </form:select>
            </div>
            <div class="col">
                <form:label path="registration" cssClass="form-label">Matricula</form:label>
                <form:input path="registration" cssClass="form-control" value="" id="registration" />
            </div>
        </div>
        <div class="mb-3">
            <form:label path="name" cssClass="form-label">Nome</form:label>
            <form:input path="name" cssClass="form-control" value="" id="name" />
        </div>
        <div class="row mb-3">
            <div class="col">
                <form:label path="rg" cssClass="form-label">RG</form:label>
                <form:input path="rg" cssClass="form-control" value="" id="rg" />
            </div>
            <div class="col">
                <form:label path="cpf" cssClass="form-label">CPF</form:label>
                <form:input path="cpf" cssClass="form-control" value="" id="cpf" />
            </div>
            <div class="col">
                <form:label path="maritalStatus" cssClass="form-label">Estado civil</form:label>
                <form:select path="maritalStatus" cssClass="form-select" value="" id="maritalStatus">
                    <form:option value="" label="--Selecione--"/>
                    <c:forEach items="${maritalStatuses}" var="maritalStatus" >
                        <form:option value="${maritalStatus}" label="${maritalStatus.getDisplayName()}"/>
                    </c:forEach>
                </form:select>
            </div>
        </div>
        <div class="mb-3">
            <form:label path="address" cssClass="form-label">Endereço</form:label>
            <form:input path="address" cssClass="form-control" value="" id="address" />
        </div>
        <div class="row mb-3">
            <div class="col">
                <form:label path="district" cssClass="form-label">Bairro</form:label>
                <form:input path="district" cssClass="form-control" value="" id="district" />
            </div>
            <div class="col">
                <form:label path="city" cssClass="form-label">Cidade</form:label>
                <form:input path="city" cssClass="form-control" value="" id="city" />
            </div>
        </div>
        <div class="row mb-3">
            <div class="col">
                <form:label path="phone" cssClass="form-label">Tel residencial</form:label>
                <form:input path="phone" cssClass="form-control" value="" id="phone"/>
            </div>
            <div class="col">
                <form:label path="mobile" cssClass="form-label">Celular</form:label>
                <form:input path="mobile" cssClass="form-control" value="" id="mobile"/>
            </div>
        </div>
        <div class="row mb-3">
            <div class="col">
                <form:label path="workSector" cssClass="form-label">Setor</form:label>
                <form:input path="workSector" cssClass="form-control" value="" id="workSector"/>
            </div>
            <div class="col">
                <form:label path="workSectorPhone" cssClass="form-label">Tel setor</form:label>
                <form:input path="workSectorPhone" cssClass="form-control" value="" id="workSectorPhone"/>
            </div>
        </div>
        <div class="row mb-3">
            <div class="col-12">
                <input class="btn btn-primary" type="submit" value="Cadastrar"/>
            </div>
        </div>
    </form:form>
</div>
</body>
</html>