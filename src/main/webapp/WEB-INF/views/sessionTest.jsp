sessionTest
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
	<body>
		<core:forEach var="i" begin="1" end="10" step="1">
			${i}
		</core:forEach>
	</body>
</html>