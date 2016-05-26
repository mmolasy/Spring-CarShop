<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Dodaj nowy produkt</title>
<style type="text/css">
            ala {
                padding-left: 10px;
                color: red;
            }
        </style>
</head>

<body>

<form:form action="/products/add" modelAttribute="product" method="POST">
Id:
<form:input path="id" id="id"/>
<form:errors path="id" cssclass="error"></form:errors><br/>
Nazwa:
<form:input path="name" id="name"></form:input>
<form:errors path="name" element="ala" cssclass="error"></form:errors><br/>
Kategoria:
<form:input path="category" id="category"></form:input>
<form:errors path="category" cssclass="error"></form:errors><br/>
Cena:
<form:input path="price" id="price"></form:input>
<form:errors path="price" cssclass="error"></form:errors><br/>
Opis:
<form:input path="description" id="description"></form:input>
<form:errors path="description" cssclass="error"></form:errors><br/>

<input type="submit" value="Dodaj produkt"/>

</form:form>


</body>
		
</html>
