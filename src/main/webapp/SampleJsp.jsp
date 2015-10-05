<%@ page contentType="text/html; charset=UTF-8" %>
<!-- session="false"-->
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <body>
<%
request.getSession().setAttribute("test1","678");
%>

${sessionScope.test1+12}
 ${paramValues.sampleValue[2]} <br>
 ${param.sampleSingleValue} <br>
 </body>
</html>