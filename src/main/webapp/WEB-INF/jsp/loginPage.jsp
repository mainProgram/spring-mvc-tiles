<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 28/09/2024
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <title><tiles:insertAttribute name="title"/></title>
    <link rel="stylesheet" type="text/css"  href="<c:url value="/resources/public/css/style.css" />" />
</head>
<body>
    <tiles:insertAttribute name="content"/>
</body>
</html>
