<%-- 
    Document   : list_of_myReferals
    Created on : 23 Aug, 2015, 1:32:56 PM
    Author     : prashant
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table border="1px">
            <c:forEach var="list" items="${myReferalList}">
                <tr>
                    <td>${team.jobTitle}</td>
                    <td>${team.companyName}</td>
                    <td>${team.experience}</td>
                    <td>${team.senderName}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
