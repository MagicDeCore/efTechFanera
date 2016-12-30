<%--
  Created by IntelliJ IDEA.
  User: MagicDeCore
  Date: 20.12.2016
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="contexPath" value="${pageContext.request.contextPath}"/>

<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">



    <link href="${contexPath}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <title>Welcome</title>

</head>
<body>

<div class="container">
    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
        <h2> Вы вошли как  ${pageContext.request.userPrincipal.name}</h2>
    </c:if>


    <h4 class="text-center"><a href="${contextPath}/registration">Создать нового пользователя</a></h4>
    <h4 class="text-center"><a href="${contextPath}/addfanera">Добавить товар Фанера</a></h4>
    <a onclick="document.forms['logoutForm'].submit()">Выйти</a>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contexPath}/resources/bootstrap/js/bootstrap.js"></script>

</body>
</html>
