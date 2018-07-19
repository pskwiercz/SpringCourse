<%--
  Created by IntelliJ IDEA.
  User: prsk
  Date: 19.07.2018
  Time: 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>

    <form:form action="processForm" modelAttribute="student">

        First Name: <form:input path="firstName"/>

        <br><br>
        Last Name: <form:input path="lastName"/>

        <br><br>
        <form:select path="country">
            <%--<form:option value="Brasil" label="Brasil"/>--%>
            <%--<form:option value="Poland" label="Poland"/>--%>

            <form:options items="${student.countries}"/>

        </form:select>

        <br><br>
        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
