<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp"%>

<%--
  Created by IntelliJ IDEA.
  User: thomas
  Date: 18/04/18
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
    <body>
        <h1> Githubers</h1>
        <div class="container">
            <div class="row">
                <c:forEach items="${githubers}" var="githuber">
                        <div class="col-xs-1"></div>
                            <ul class="list-group">
                                <li class="list-group-item"><img src="${githuber.getAvatarUrl()}"></li>
                                <li class="list-group-item">Name : ${githuber.getNameGithuber()}</li>
                                <li class="list-group-item">m@il : ${githuber.getEmail()}</li>
                                <li class="list-group-item">Login : ${githuber.getLogin()}</li>
                                <li class="list-group-item">ID : ${githuber.getId()}</li>
                            </ul>
                        <div class="col-xs-1"></div>
                </c:forEach>
            </div>
        </div>
    </body>
</html>
