<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <h1>Post form</h1>
    <form:form commandName="post">
        <label for="slug">Slug: </label>
        <form:input path="slug" />

        <label for="title">Title: </label>
        <form:input path="title" />

        <label for="body">Body: </label>
        <form:textarea path="body" />
    </form:form>
</body>
</html>
