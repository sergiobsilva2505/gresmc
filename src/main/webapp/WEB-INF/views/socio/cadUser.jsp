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
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    <title>Cadastro Usuario</title>
</head>
<body>
<header>
    <nav class="navbar mb-3" style="background-color: #e3f2fd;">
        <div class="container">
            <a class="navbar-brand" href="#">
                <img src="../../../img/ClubSocial_logo-baixa2.png" alt="30" width="24" height="24" class="d-inline-block align-text-top">
                GRESMC
            </a>
        </div>
    </nav>
</header>
<div class="container">
    <div class="mb-5 p-1 bg-secondary text-white text-center rounded">
        <h2>Ficha Cadastral</h2>
    </div>
    <form:form action="/novo-socio${not empty userDTO.id() ? '/' : ''}${userDTO.id()}" modelAttribute="userDTO" cssClass="row g-3 mb-3" method="post">
        <form:hidden path="id" />
        <div class="col-md-6">
            <form:label path="company" cssClass="form-label" >Empresa</form:label>
            <form:select path="company" cssClass="form-select" value="${company}">
                <form:option value=""  label="--Selecione--"/>
                <c:forEach items="${companies}" var="company">
                    <form:option value="${company}" label="${company.getDisplayName()}"/>
                </c:forEach>
            </form:select>
        </div>
        <div class="col-md-6">
            <form:label path="registration" cssClass="form-label">Matricula</form:label>
            <form:input path="registration" cssClass="form-control"  id="registration" />
        </div>
        <div class="col-md-12">
            <form:label path="name" cssClass="form-label">Nome</form:label>
            <form:input path="name" cssClass="form-control"  id="name" />
        </div>
        <div class="col-md-4">
            <form:label path="rg" cssClass="form-label">RG</form:label>
            <form:input path="rg" cssClass="form-control" id="rg" />
        </div>
        <div class="col-md-4">
            <form:label path="cpf" cssClass="form-label">CPF</form:label>
            <form:input path="cpf" cssClass="form-control" id="cpf" />
        </div>
        <div class="col-md-4">
            <form:label path="maritalStatus" cssClass="form-label">Estado civil</form:label>
            <form:select path="maritalStatus" cssClass="form-select"  id="maritalStatus">
                <form:option value=""  label="--Selecione--"/>
                <c:forEach items="${maritalStatuses}" var="maritalStatus" >
                    <form:option value="${maritalStatus}" label="${maritalStatus.getDisplayName()}"/>
                </c:forEach>
            </form:select>
        </div>
        <div class="col-md-2">
            <form:label path="cep" cssClass="form-label" for="cep">CEP</form:label>
            <form:input path="cep" cssClass="form-control" type="text" id="cep"/>
        </div>
        <div class="col-md-5">
            <form:label path="address" cssClass="form-label">Endereço</form:label>
            <form:input path="address" cssClass="form-control"  id="address" />
        </div>
        <div class="col-md-1">
            <form:label path="number" cssClass="form-label">Num.</form:label>
            <form:input path="number" cssClass="form-control"  id="number" />
        </div>
        <div class="col-md-4">
            <form:label path="complement" for="complement" cssClass="form-label">Complemento</form:label>
            <form:input path="complement" type="text" name="complement" cssClass="form-control"  id="complement" />
        </div>
        <div class="col-md-5">
            <form:label path="district" cssClass="form-label">Bairro</form:label>
            <form:input path="district" cssClass="form-control"  id="district" />
        </div>
        <div class="col-md-5">
            <form:label path="city" cssClass="form-label">Cidade</form:label>
            <form:input path="city" cssClass="form-control"  id="city" />
        </div>
        <div class="col-md-2">
            <form:label path="uf" cssClass="form-label" for="uf">UF</form:label>
            <form:input path="uf" cssClass="form-control" type="text" id="uf"/>
        </div>
        <div class="col-md-6">
            <form:label path="phone" cssClass="form-label">Tel residencial</form:label>
            <form:input path="phone" cssClass="form-control"  id="phone"/>
        </div>
        <div class="col-md-6">
            <form:label path="mobile" cssClass="form-label">Celular</form:label>
            <form:input path="mobile" cssClass="form-control"  id="mobile"/>
        </div>
        <div class="col-md-6">
            <form:label path="workSector" cssClass="form-label">Setor</form:label>
            <form:input path="workSector" cssClass="form-control"  id="workSector"/>
        </div>
        <div class="col-md-6">
            <form:label path="workSectorPhone" cssClass="form-label">Tel setor</form:label>
            <form:input path="workSectorPhone" cssClass="form-control"  id="workSectorPhone"/>
        </div>
<%--        <div class="col-md-12">--%>
<%--            <div class="p-1 bg-secondary text-white text-center rounded">--%>
<%--                <h2>Dependentes</h2>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--        <div class="col-md-4">--%>
<%--            <label for="dependentName" class="form-label">Nome</label>--%>
<%--            <input type="text" class="form-control"  id="dependentName"/>--%>
<%--        </div>--%>
<%--        <div class="col-md-4">--%>
<%--            <label for="relationship" class="form-label">Parentesco</label>--%>
<%--            <input type="text" class="form-control"  id="relationship"/>--%>
<%--        </div>--%>
<%--        <div class="col-md-3">--%>
<%--            <label for="dependentBirthDate" class="form-label">Data de Nascimento</label>--%>
<%--            <input type="date" class="form-control"  id="dependentBirthDate"/>--%>
<%--        </div>--%>
<%--        <div class="col-md-1">--%>
<%--            <label class="form-label">Adicionar</label>--%>
<%--            <button class="btn btn-primary form-control" type="button"> + </button>--%>
<%--        </div>--%>
        <div class="col-md-12">
            <form:label path="comments" cssClass="form-label">Observações</form:label>
            <form:textarea path="comments" class="form-control" id="comments" rows="5" />
        </div>
        <div class="col-md-12">
            <span>Ativo?</span>
            <div class="btn-group" role="group" aria-label="Basic radio toggle button group">
                <form:radiobutton class="btn-check" path="active" id="btnradio1" value="true"/>
                <form:label class="btn btn-outline-success" path="active" for="btnradio1">Sim</form:label>

                <form:radiobutton class="btn-check" path="active" id="btnradio2" value="false"/>
                <form:label class="btn btn-outline-danger" path="active" for="btnradio2">Não</form:label>
            </div>
        </div>
        <div class="col-md-12">
            <div class="col-12">
                <input class="btn btn-primary" type="submit" value="Cadastrar"/>
            </div>
        </div>
    </form:form>
</div>
<footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
    <div class="container">
        <p class="text-center text-muted">&copy; 2022 Gresmc</p>
    </div>
</footer>
</body>
</html>