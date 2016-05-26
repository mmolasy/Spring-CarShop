

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Product not found</title>
</head>

<body>

		Brak Produktu o identyfikatorze: <c:out value="${id}"/><br/>
	<a href="<c:url value="/products/allproducts"/>">Wroc do listy produktow</a>
	</body>
</html>