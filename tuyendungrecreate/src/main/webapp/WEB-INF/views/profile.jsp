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
    <link rel="stylesheet" href='<c:url value = "../../resources/bootstrap/css/bootstrap.min.css"></c:url>' />
    <link rel="stylesheet" href='<c:url value = "../../resources/css/reset.css"></c:url>' />
    <link rel="stylesheet" href='<c:url value = "../../resources/css/profile.css"></c:url>' />
    <link rel="stylesheet" href='<c:url value = "../../resources/css/header.css"></c:url>' />
    
    <title>Profile</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
    <br/>
    <div class="container">
    	<form:form action="" method="POST" modelAttribute="ungVien" enctype="multipart/form-data">
        <div>
            <div class="form-group row title">
                <label class="title-name">Thông tin chung</label>
            </div>
            <div class="form-group row">
                <label for="example-text-input" class="col-2 col-form-label">Họ tên</label>
                <div class="col-10">
                    <form:input class="form-control" type="text" id="example-text-input" path="tenUngVien" value="${ungVien.getTenUngVien() }"/>
                </div>
            </div>
            <div class="form-group row">
                <label for="example-search-input" class="col-2 col-form-label">Ngày sinh</label>
            </div>
            <div class="form-group row">
                <label for="example-email-input" class="col-2 col-form-label">Email</label>
                <div class="col-10">
                    <form:input class="form-control" type="email" id="example-email-input" value="${ungVien.getEmail() }" path="email"/>
                </div>
            </div>
            <div class="form-group row">
                    <label for="example-text-input" class="col-2 col-form-label">Điện thoại</label>
                    <div class="col-10">
                        <form:input class="form-control" type="text" id="example-text-input" value="${ungVien.getDienThoai() }" path="dienThoai"/>
                    </div>
                </div>
            <div class="form-group row">
                <label for="example-text-input" class="col-2 col-form-label">Địa chỉ</label>
                <div class="col-10">
                    <form:input class="form-control" type="text" 	id="example-text-input" value="${ungVien.getDiaChi() }" path="diaChi"/>
                </div>
            </div>
            
            
             <div class="form-group row">
                    <label for="example-url-input" class="col-2 col-form-label">Ảnh cá nhân</label>
                    <div class="col-10">
                        <input type="file" name="hinhAnh" accept="image/*" id="hinhAnh">
                    </div>
            </div>
            <div class="btn-zone">
                <input type="submit" class="btn-save" value="Save">
            </div>
        </div>
    </form:form>
    	<div>
    		
    	</div>
           

    </div>
    
</body>
<script src='<c:url value = "../../resources/bootstrap/js/js.js"></c:url>'></script>
</html>