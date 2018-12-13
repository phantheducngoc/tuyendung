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
        <link rel="stylesheet" href='<c:url value="../resources/css/search.css"></c:url>'>
        <link rel="stylesheet" href='<c:url value="../resources/css/index.css"></c:url>'>
    

    <title>Việc làm đã ứng tuyển</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<header>
	<div class="container-fluid banner">
	    <div class="row">
	        <img class="banner__img" src='<c:url value="../resources/images/banner-tuyen-dung-taka.jpg"/>' />
	    </div>
	</div>
</header>
<div class="container main__content">
        <div class="card">
            <div class="card-header">
            </div>
            <div class="card-body">
                <div class="row">
                	<c:forEach var="tinTuyenDung" items="${listTinTuyenDung}">
	                	<div class="col-md-4 item">
	                        <div class="item__inside">
	                            <div class="company_logo">
	                                <a href="chitiet/${tinTuyenDung.getMaTinTuyenDung()}">
	                                    <img src='<c:url value="../resources/images/${tinTuyenDung.getHinhAnh()}"/>' />
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

</html>
