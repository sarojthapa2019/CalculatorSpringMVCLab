<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Calculate</title>
</head>
<body>
<c:if test="${errors != null}">
<ul>
<c:forEach var="e" items="${errors}">
    <li>
        ${e}
    </li>
</c:forEach>
</ul>
</c:if>
<form action="calculate" method="post">
    <input type = "text" name = "add1" size = "2"  value = "<c:out value="${calculator.add1}"></c:out> " />+
    <input type = "text" name = "add2" value = "${calculator.add2}" size = "2"/>=<input type = "text" name = "sum" value = "${calculator.sum}"  size = "2" readonly/><br/>
    <input type = "text" name = "mult1" value = "${calculator.mult1}" size = "2"/>*
    <input type = "text" name = "mult2" value = "${calculator.mult2}"  size = "2"/>=<input type = "text" name = "product" value = "${calculator.product}"   size = "2" readonly/><br/>
    <input type = "submit" value = "Submit"/>

</form>
</body>
</html>