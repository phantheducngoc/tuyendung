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
    <link rel="stylesheet" href='<c:url value="resources/bootstrap/css/bootstrap.min.css"></c:url>'>
    <link rel="stylesheet" href='<c:url value="resources/bootstrap/js/bootstrap.min.js"></c:url>'>
    <link rel="stylesheet" href='<c:url value="resources/css/index.css"></c:url>'>
    <link rel="stylesheet" href='<c:url value="resources/css/search.css"></c:url>'>

    <title>SearchResults</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<header>
	<div class="container-fluid banner">
	    <div class="row">
	        <img class="banner__img" src='<c:url value="resources/images/banner-tuyen-dung-taka.jpg"/>' />
	    </div>
	</div>
</header>
<div class="container">

	<form:form action= "searchJobs" modelAttribute="searchForm">
		<div class="search-conditions">
			<div>
				<form:input type="text" value = "${freeKeyword}" path = "freeKeyword"/>
			</div>
			<div class="col-md-3">
				 <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
                         Ngành nghề
                 </button>
            	 <!-- Button to Open the Modal -->
                 <!-- The Modal -->
                 <div class="modal" id="myModal">
                 	<div class="modal-dialog">
  		                  <div class="modal-content">
  		                  		<!-- Modal Header -->
                                <div class="modal-header">
              	                      <h4 class="modal-title">Chọn ngành nghề</h4>
                                      <button type="button" class="close" data-dismiss="modal">&times;</button>
                                </div>
                                <!-- Modal body -->
                                <div class="modal-body">
                                	<div class="row">
                                		<div class="col-md-6 left-side-box">
                                			<ul class="list-group">
	                                			<c:forEach var="linhVuc" items="${listLinhVuc}">
	                                				<li class="list-group-item job-type">
	                                					<a class="nav-link job-type-name" href="#">${linhVuc.getTenLinhVuc()}</a>
	                                					<div class="nganhNghe">
				                                            <ul class="nganhnghe-parent">
					                                            
							                                            	<c:forEach var="nganhnghe" items="${linhVuc.getNganhNghe()}">
							                                                <li class="list-group-item job-name">
							                                                    <label class="form-check-label">
							                                                            <form:checkbox class="form-check-input" 
							                                                            value="${nganhnghe.getMaNganhNghe()}"
							                                                            path="maNganhNghe"/>${nganhnghe.getTenNganhNghe()}
							                                                    </label>
							                                                </li>
						                                                </c:forEach>
					                                             
				                                            </ul>
				                                            </div>
	                                				</li>
	                                			</c:forEach>	
                                			</ul>
                                		</div>
                                		<div class="col-md-6"></div>
                                		
                                	</div>
                                </div>
        				  </div>         			
                 	</div>
                 </div>
			</div>
			<div class="col-md-9">
            </div>
		</div>
		<br/>
        <div class="btnSearch-holder">
            <input class="btnSearch" type="submit" value="Search"/>
        </div>
	</form:form>
</div>
<div class="container main__content">
        <div class="card">
            <div class="card-header">
                Kết quả
            </div>
            <div class="card-body">
                <div class="row">
                	<c:forEach var="tinTuyenDung" items="${listTinTuyenDung}">
	                	<div class="col-md-4 item">
	                        <div class="item__inside">
	                            <div class="company_logo">
	                                <a href="chitiet/${tinTuyenDung.getMaTinTuyenDung()}">
	                                    <img src='<c:url value="resources/images/${tinTuyenDung.getHinhAnh()}"/>' />
	                                </a>
	                            </div>
	                            <div class="company_name">
	                                <a href="chitiet/${tinTuyenDung.getMaTinTuyenDung()}">${tinTuyenDung.getChucDanh()}</a>
	                                <p class="text">${tinTuyenDung.getNhaTuyenDung().getTenDangKiHopPhap()}</p>
	                                <div class="time">
	                                    <p class="salary"><span>${tinTuyenDung.getMucLuongToiThieu()}</span>
	                                    				  <span>triệu - </span>
	                                     			      <span>${tinTuyenDung.getMucLuongToiDa()}</span> 
	                                     			      <span>triệu</span>
	                                    </p>
	                                    <p class="date">${tinTuyenDung.getNgayHetHan()}</p>
	                                </div>
	                            </div>
	                        </div>
	                    </div>
                	</c:forEach>
                </div>
            </div>
        </div>
    </div>
</body>

<script src='<c:url value = "resources/bootstrap/js/bootstrap.js"></c:url>'></script>
<script src='<c:url value = "resources/bootstrap/js/js.js"></c:url>'></script>
<script src='<c:url value = "resources/bootstrap/js/bootstrap.min.js"></c:url>'></script>
<script>
$("#checkAll").click(function(){
    $('input:checkbox').not(this).prop('checked', this.checked);
});
</script>
</html>
