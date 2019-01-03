<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 


First Name:<c:out value="${param.fname}"></c:out>
Last Name:<c:out value="${param.pass}"></c:out>


<c:forEach var="number" begin="5" end="10">  
<c:out value="${number}"></c:out>  
</c:forEach>  