

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Lista czesci.</title>
</head>

<body>

	<c:forEach items="${lista}" var="product">
		<br />
		Id produktu: <c:out value="${product.id}"></c:out>
		<br />
		Nazwa produktu: <c:out value="${product.name}"></c:out>
		<br />

		Kategoria: <c:out value="${product.category}"></c:out>
		<br />

		Cena: <c:out value="${product.price}"></c:out>
		<br />

		Opis produktu: <c:out value="${product.description}"></c:out>
		<br />
		
		<a href="/products/getbyid?id=<c:out value='${product.id}' />">Zobacz
			szczegoly</a>			<br/>
		
		--------------------------------------------------
	</c:forEach>
</body>
</html>
