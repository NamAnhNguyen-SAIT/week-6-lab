
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <p>Hello ${username}</p> 
        
        <form method="post" action="shoppinglist">
            <input type="hidden" name="action" value="Logout">
            <a href="ShoppingList">Log Out</a>
            <br>
        </form>
        
      
        
        <%-- form of adding items --%>
        <form action="" method="POST">
            <h2>Add Item</h2>
            <label for="item">Add item</label>
            <input type="text" name="item">
            <input type="submit" name="Add Item">
            <input type="hidden" name="action" value="Add">
        </form>
        
        <%-- shopping list  --%> 
        <form method="post" action="shoppinglist">
            <ul>
                <c:forEach var="item" items="${itemArray}" varStatus="listIndex">
                    <li><input type="radio" name="listItem" value="${listIndex.index}">${item}</li>
                </c:forEach>
            </ul>
            <c:if test="${itemArray.size() > 0}">
                <input type="submit" name="action" value="Delete">
            </c:if>
        </form>
        
    </body>
</html>