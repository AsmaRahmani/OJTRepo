<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
int n1,n2,c;
n1=Integer.parseInt(request.getParameter("n1"));
n2=Integer.parseInt(request.getParameter("n2"));
c=n1+n2;
out.println("Addition of: "+n1 + " and " +n2 + " is "+ c);
%>



</body>
</html>