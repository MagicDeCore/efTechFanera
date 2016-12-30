<%--&lt;%&ndash;--%>
  <%--Created by IntelliJ IDEA.--%>
  <%--User: MagicDeCore--%>
  <%--Date: 20.12.2016--%>
  <%--Time: 18:48--%>
  <%--To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--&lt;%&ndash;<%@ page contentType="text/html;charset=UTF-8" language="java" %>&ndash;%&gt;--%>

<%--<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>


<%--<c:set var="contexPath" value="${pageContext.request.contextPath}"/>--%>



<%--<html>--%>
<%--<head>--%>
    <%--<meta charset="utf-8">--%>
    <%--<meta http-equiv="X-UA-COMPATIBLE" content="IE=edge">--%>
    <%--<meta name="viewport" content="width=device-width, initial-scale=1">--%>
    <%--<meta name="description" content="">--%>
    <%--<meta name="author" content="">--%>



    <%--<link href="${contexPath}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">--%>


    <%--<title>Registration</title>--%>

    <%--<script src="http://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>--%>
    <%--<script src="http://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>--%>

<%--</head>--%>
<%--<body>--%>

<%--<div class="container">--%>
    <%--<form:form method="POST" modelAttribute="userForm" class="form-signin">--%>
        <%--<h2 class="form-signin-heading">Create New Account</h2>--%>
        <%--<spring:bind path="username">--%>
            <%--<div class="form-group ${status.error ? 'has-error' : ''}">--%>
                <%--<form:input type="text" path="username" class="form-control" placeholder="Username" autofocus="true"></form:input>--%>
                <%--<form:errors path="username"></form:errors>--%>
            <%--</div>--%>
        <%--</spring:bind>--%>

        <%--<spring:bind path="password">--%>
            <%--<div class="form-group ${status.error ? 'has-error' : ''}">--%>
                <%--<form:input type="password" path="password" class="form=control" placeholder="Password"></form:input>--%>
                <%--<form:input path="password"></form:input>--%>
            <%--</div>--%>
        <%--</spring:bind>--%>

        <%--<spring:bind path="passwordConfirm">--%>
            <%--<div class="form-group ${status.error ? 'has-error' : ''}">--%>
                <%--<form:input type="password" path="passwordConfirm" class="form=control" placeholder="Confirm Your Password"></form:input>--%>
                <%--<form:input path="passwordConfirm"></form:input>--%>
            <%--</div>--%>
        <%--</spring:bind>--%>

        <%--<button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>--%>

    <%--</form:form>--%>
<%--</div>--%>

<%--<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>--%>
<%--<script src="${contexPath}/resources/bootstrap/js/bootstrap.js"></script>--%>

<%--</body>--%>
<%--</html>--%>
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

    <title>Создать пользователя</title>

    <%--<link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">--%>
    <%--<link href="${contextPath}/resources/css/common.css" rel="stylesheet">--%>


    <%--<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>--%>
    <%--<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>--%>

</head>

<body>

<div class="container">

    <form:form method="POST" modelAttribute="userForm" class="form-signin">
        <h4 class="form-signin-heading">Введите данные нового пользователя</h4>
        <spring:bind path="username">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="username" class="form-control" placeholder="Имя пользователя"
                            autofocus="true"></form:input>
                <form:errors path="username"></form:errors>
            </div>
        </spring:bind>

        <spring:bind path="password">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="password" path="password" class="form-control" placeholder="Пароль"></form:input>
                <form:errors path="password"></form:errors>
            </div>
        </spring:bind>

        <spring:bind path="confirmPassword">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="password" path="confirmPassword" class="form-control"
                            placeholder="Подтвердите пароль"></form:input>
                <form:errors path="confirmPassword"></form:errors>
            </div>
        </spring:bind>

        <button class="btn btn-lg btn-primary btn-block" type="submit">Подтвердить</button>
    </form:form>

</div>
<!-- /container -->

<link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="${contextPath}/resources/css/faneraAdding.css" rel="stylesheet">


<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

<%--<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>--%>
<%--<script src="${contextPath}/resources/js/bootstrap.min.js"></script>--%>
</body>
</html>