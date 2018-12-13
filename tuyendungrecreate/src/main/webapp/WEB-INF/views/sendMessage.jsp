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
		  <strong>From</strong> Công ty: ${message.getTinTuyenDung().getNhaTuyenDung().getTenDangKiHopPhap() }
		  </div>
		  <div class="card-body" style="min-height:300px">
		    <h5 class="card-title" style="text-align:left!important">${message.getSubject()}</h5>
		    <p class="card-text" style="text-align:left!important">${message.getContent()}</p>
		    
		  </div>
		  <div class="card-footer text-muted">
		    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
                         Reply
             </button>
              <div class="modal" id="myModal">
                 	<div class="modal-dialog">
  		                  <div class="modal-content">
  		                  		<!-- Modal Header -->
                                <div class="modal-header">
              	                      <h4 class="modal-title">Reply</h4>
                                      <button type="button" class="close" data-dismiss="modal">&times;</button>
                                </div>
                                <!-- Modal body -->
                                <div class="modal-body">
                                	<div class="row" style="display:flex">
                                		<div class="col-md-2 left-side-box" style="margin-bottom:10px">
                                			<p>Tiêu đề</p>
                                			<p>Nội dung</p>
                                		</div>
                                		<div class="col-md-10 righit-side-box">
                                			<input type = "text"/ style="margin-bottom:10px;width:350px">
       			                            <textarea rows="" cols="" style="min-height:200px;width:350px "></textarea>
                                			
                                		</div>
                                		
                                	</div>
                                	<div class="btnSearch-holder">
							            <button style="height:30px;width:72px">Send</button>
							        </div>
                                </div>
        				  </div>         			
                 	</div>
		  </div>
		</div>
		</div>
	</div>


</body>
<script src='<c:url value = "../../resources/bootstrap/js/bootstrap.js"></c:url>'></script>
<script src='<c:url value = "../../resources/bootstrap/js/js.js"></c:url>'></script>
<script src='<c:url value = "../../resources/bootstrap/js/bootstrap.min.js"></c:url>'></script>
</html>