

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Lista czesci.</title>
</head>

<body>

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
		
		Przeznaczenie produktu:</br>
		
		<c:forEach items="${product.typesOfCar}"
			var="auto">
		**************************************************</br>
		Marka: <c:out value="${auto.brand}"></c:out>
			<br />
		Model: <c:out value="${auto.model}"></c:out>
			<br />
		Generacja: <c:out value="${auto.generation}"></c:out>
			<br />
		Wersja Nadwoziowa: <c:out value="${auto.bodyVersion}"></c:out>
			<br />
			
		</c:forEach>
		<a href="<c:url value="/products/allproducts"/>">Wroc do listy produktow</a>
		

</body>
</html>