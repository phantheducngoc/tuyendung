<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href='<c:url value="/resources/css/index.css"></c:url>'>
    <link rel="stylesheet" href='<c:url value="/resources/css/message.css"></c:url>'>
    <title>Nội dung message</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

    <br/>
    <br/>
		<div class="container">
			<div class="card text-center">
		  <div class="card-header" style="text-align:left!important">
		   To Công ty: ${message.getTinTuyenDung().getNhaTuyenDung().getTenDangKiHopPhap() }
		  </div>
		  <div class="card-body" style="min-height:300px">
		    <h5 class="card-title" style="text-align:left!important">${message.getSubject()}</h5>
		    <p class="card-text" style="text-align:left!important">${message.getContent()}</p>
		    
		  </div>
		  <div class="card-footer text-muted">
		    <a href="#" class="btn btn-primary">Reply</a>
		  </div>
		</div>
		</div>


</body>
</html>