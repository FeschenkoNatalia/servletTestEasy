<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container">
    <hr>
    <footer>
        <p>&copy; Natalia.com 2017</p>
    </footer>
</div>

<script
        src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

<c:url value="/bootstrap/js/hello.js" var="coreJs" />
<c:url value="/bootstrap/js/bootstrap.min.js" var="bootstrapJs" />

<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>
