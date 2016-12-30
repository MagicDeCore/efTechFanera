<%--
  Created by IntelliJ IDEA.
  User: MagicDeCore
  Date: 26.12.2016
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Add Fanera</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/faneraAdding.css" rel="stylesheet">


    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

</head>

<body>

<div class="container">

    <form:form method="POST" modelAttribute="faneraForm" class="form-signin">
        <h4 class="form-signin-heading">Введите Данные о Фанере</h4>
        <spring:bind path="faneraName">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="faneraName" class="form-control"
                            placeholder="Название Фанеры:"
                            autofocus="true"></form:input>
                <form:errors path="faneraName"></form:errors>
            </div>
        </spring:bind>

        <spring:bind path="sizeFormat">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="sizeFormat" class="form-control"
                            placeholder="Формат листов:"></form:input>
                <form:errors path="sizeFormat"></form:errors>
            </div>
        </spring:bind>

        <spring:bind path="depth">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="depth" class="form-control"
                            placeholder="Толщина листа:"></form:input>
                <form:errors path="depth"></form:errors>
            </div>
        </spring:bind>

        <spring:bind path="treatment">
        <div class="form-group ${status.error ? 'has-error' : ''}">
            <form:input type="text" path="treatment" class="form-control"
                        placeholder="Вид обработки:"></form:input>
            <form:errors path="treatment"></form:errors>
        </div>
        </spring:bind>

        <spring:bind path="water_resistance">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="water_resistance" class="form-control"
                            placeholder="Степень водостойкости"></form:input>
                <form:errors path="water_resistance"></form:errors>
            </div>
        </spring:bind>

        <spring:bind path="wetness">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="wetness" class="form-control"
                            placeholder="Влажность:"></form:input>
                <form:errors path="wetness"></form:errors>
            </div>
        </spring:bind>

        <spring:bind path="material">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="material" class="form-control"
                            placeholder="Сырье:"></form:input>
                <form:errors path="material"></form:errors>
            </div>
        </spring:bind>

        <spring:bind path="description">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="description" class="form-control"
                            placeholder="Описание:"></form:input>
                <form:errors path="description"></form:errors>
            </div>
        </spring:bind>

        <spring:bind path="image">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="file" path="image" class="form-control"
                            placeholder="Изображение:"></form:input>
                <form:errors path="image"></form:errors>
            </div>
        </spring:bind>

        <button class="btn btn-lg btn-primary btn-block" type="submit">Подтвердить</button>
    </form:form>

</div>
<!-- /container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>