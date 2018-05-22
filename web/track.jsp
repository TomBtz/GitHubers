<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: thomas
  Date: 22/05/18
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<body>
<h1> Githubers - Potter'World</h1>
<div class="container">
    <div class="row">
        <form method="post" action="track">
            <label for="login">Login to track</label> : <input type="text" name="login" id="login" />
            <input type="submit"/>
        </form>
    </div>
</div>
</body>
</html>
