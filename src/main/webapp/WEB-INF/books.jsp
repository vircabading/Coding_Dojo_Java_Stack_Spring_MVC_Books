<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!--/////////////////////////////////////////////////////
//	BOOKS JSP
///////////////////////////////////////////////////////// -->

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!---- CSS LINKS --------------------------------->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Books</title>
</head>
<body>
	<!-- //// HEADER //////// -->
	<header>
		<div class="navbar navbar-dark bg-dark box-shadow">
			<div class="container d-flex justify-content-between">
				<a href="/" class="navbar-brand d-flex align-items-center"> <strong
					class="text-warning">Books</strong>
				</a> <a class="btn btn-secondary " href="/books">HOME</a>
			</div>
		</div>
	</header>

	<!-- //// MAIN AREA //////// -->
	<main role="main">
		<div class="container mt-4">
			<h1>All Books</h1>
			<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Title</th>	
						<th scope="col">Language</th>
						<th scope="col"># of Pages</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="book" items="${ books }">
						<tr>
							<th scope="row">${ book.id }</th>
							<td>
								<a href="/books/${ book.id }">${ book.title }</a>
							</td>
							<td>${ book.language }</td>
							<td>${ book.numberOfPages }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</main>


	<!---- JAVASCRIPT LINKS ---------------------------->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>