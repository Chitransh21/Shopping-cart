<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.shipcart.connection.DbCon"%>
<%@page import="com.shipcart.model.*"%>
<%@page import="java.util.*"%>
<%@page import= "java.text.DecimalFormat" %>
<%@page import= "com.shipcart.model.dao.*"%>
<%
DecimalFormat dcf = new DecimalFormat("#.##");
request.setAttribute("dcf",dcf);

User auth = (User) request.getSession().getAttribute("auth");

List<Order>orders =  null;
if (auth != null) {
	request.setAttribute("auth", auth);
	OrderDao orderDao = new OrderDao(DbCon.getConnection());
	orders = orderDao.userOrders(auth.getId());
} else {
	response.sendRedirect("login.jsp");
}
ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
if (cart_list != null) {
	request.setAttribute("cart_list", cart_list);
}
%>

<!DOCTYPE html>
<html>
<head>
<!-- https://getbootstrap.com/docs/4.0/getting-started/introduction/ -->
<title>Orders Page</title>
<%@include file="includes/head.jsp"%>
</head>
<body>
	<%@include file="includes/navbar.jsp"%>

	<div class="contanier">
		<div class="card-header my-3">All Orders</div>
		<table class="table table-light">
			<thread>
			<tr>
				<th scope="col">Date</th>
				<th scope="col">Name</th>
				<th scope="col">Category</th>
				<th scope="col">Quantity</th>
				<th scope="col">Price</th>
				<th scope="col">Cancel</th>
			</tr>
			</thread>
			
			<tbody>
			<%
			if(orders != null){
				for(Order o : orders){%>
				<tr>
					<td><%= o.getDate() %></td>
					<td><%= o.getName() %></td>
					<td><%= o.getCategory() %></td>
					<td><%= o.getQuantity() %></td>
					<td>$<%=dcf.format(Double.parseDouble(o.getPrice().substring(1)))  %></td>
					<td><a class ="btn btn-sm btn-danger" href="cancel-order?id=<%= o.getOrdedrId()%>"> Cancel </a></td>
				</tr>
				<%}
			}
			
			%>
			
			</tbody>
			
			
		</table>

	</div>


	<%@include file="includes/footer.jsp"%>
</body>
</html>