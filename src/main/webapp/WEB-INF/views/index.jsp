
<html>
<head>
<%@ page contentType="text/html; charset=GB2312"%>
<%@ page isELIgnored="false"%>
</head>
<body>
<h2>Hello World!</h2>
<form action="/FirstWebApp/say">
	<input name="name"/>
	<input type="submit" value="提交"/>
</form>
${url}
${sampleValue+1}<br>

${5>6}
${skdfj+322}
<%
request.getSession().setAttribute("merchantId","abc123");

%>
${sessionScope.merchantId}
<form action="SampleJsp.jsp">
 <input type="text" name="sampleValue" value="10">
 <input type="text" name="sampleValue" value="11">
 <input type="text" name="sampleValue" value="12">
 <input type="text" name="sampleSingleValue" value="SingleValue">
 <input type="submit" value="Submit">
 </form>
 
 <form action="sessionTest">
 <input type="submit" value="提交"/>
 </form>
 <img src="http://www.baidu.com/img/bdlogo.png"/>
 <%=request.getContextPath()+"sdf"%>
 22
</body>
</html>
