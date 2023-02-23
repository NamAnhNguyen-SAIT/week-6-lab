<%-- 
    Document   : arithmetic
    Created on : 22-Feb-2023, 9:43:08 PM
    Author     : Owner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Arithmetic Calculation</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First number: <input type="number" name="first" value="${first}"><br>
            Second number: <input type="number" name="second" value="${second}"><br>
            <input type="submit" name="calc" value="+">
            <input type="submit" name="calc" value="-">
            <input type="submit" name="calc" value="*">
            <input type="submit" name="calc" value="%"><br>
        </form>
        <p>
            Result: ${message}
        </p>
        //link to other
        <a href="age">Age Calculator</a>
    </body>

</html>
