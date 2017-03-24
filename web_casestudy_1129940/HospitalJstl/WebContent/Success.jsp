<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="java.util.*, com.service.Service,com.beans.Hospital_Beans"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>success</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
<%
Service s=new Service();

 String uname=(String)request.getAttribute("user_name");
 System.out.println(uname);
ArrayList<Hospital_Beans> alist=s.serviceSuccess(uname);
System.out.println(alist);
if(alist.size()>0)
{
%>
 


<table border="1">
<tr>
	<th>Registration Id:</th>
	<th>Name:</th>
	<th>Age:</th>
	<th>Gender:</th>
	<th>Marital Status:</th>
	<th>Phone No:</th>
	<th>Disease Type:</th>
	
</tr>

<%
	for(Hospital_Beans loop:alist)
	{
		%>  
	<tr>
		<td><%=loop.getReference_id() %></td>
		<td><%= loop.getName() %></td>
		<td><%= loop.getAge() %></td>
		<td><%= loop.getGender() %></td>
		<td><%= loop.getMarital_status() %></td>
		<td><%= loop.getPhone_number() %></td>
		<td><%= loop.getDisease_type() %></td>
		
	</tr>
<%} %>

</table>
<%} %>

You have successfully registered

</body>
</html>