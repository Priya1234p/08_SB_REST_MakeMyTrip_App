<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Get your Ticket Info</h2>
<form action="searchTicket">
Ticket Id : <input type ="text" name="ticketId"/>
<input type="submit" value="Search" />
</form>
<hr/>
<table>
<tr>
<td>Ticket Id</td>
<td>${ticket.ticketId}</td>
</tr>

<tr>
<td>Ticket Status</td>
<td>${ticket.ticketStatus}</td>
</tr>

<tr>
<td>From</td>
<td>${ticket.fromplace}</td>
</tr>

<tr>
<td>To</td>
<td>${ticket.to}</td>
</tr>

<tr>
<td>Ticket Cost</td>
<td>${ticket.tktCost}</td>
</tr>

<tr>
<td>Train Num</td>
<td>${ticket.trainNum}</td>
</tr>

</table>

<a href="/">Go Back</a>
</body>
</html>