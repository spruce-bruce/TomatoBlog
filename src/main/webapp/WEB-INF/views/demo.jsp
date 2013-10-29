<%-- 
    Document   : demo
    Created on : Oct 27, 2013, 6:38:04 PM
    Author     : aaron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Person</h3>
        <p>Name: ${personObject.name}</p>
        <p>Age: ${personObject.age}</p>
        
        <form action="" method="post">
            <input type="textarea" id="name" name="name" /><br />
            <input type="textarea" id="age" name="age" /><br />
            <button type="submit">Submit</button>
        </form>
    </body>
</html>
