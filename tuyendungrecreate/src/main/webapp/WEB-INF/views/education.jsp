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
    
    <title>Education</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
    <br/>
    <div class="container">
    	<form:form action="" method="POST" modelAttribute="ungVien">
        <div>
            <div class="form-group row title">
                <label class="title-name">Thông tin học vấn</label>
            </div>
            <div class="form-group row">
                <label  class="col-2 col-form-label">Trình độ học vấn</label>
                <div class="col-10">
                	<form:select path="bangTotNghiep.trinhDoHocVan.maTrinhDo">
                		<form:options items="${listTrinhDo }"/>
                	</form:select>
                </div>
            </div>
            <div class="form-group row">
                <label class="col-2 col-form-label">Tên trường</label>
                <div class="col-10">
                	<form:select path="bangTotNghiep.truongHoc.maTruong">
                		<form:options items="${mapTruongHoc }"/>
                	</form:select>
                </div>
            </div>
            <div class="form-group row">
                <label for="example-email-input" class="col-2 col-form-label">Tên Ngành</label>
                <div class="col-10">
                		<form:select path="bangTotNghiep.nganhHoc.maNganh">
                		<form:options items="${mapNganhHoc }"/>
                		</form:select>
                </div>
            </div>
            <div class="form-group row">
                    <label for="example-text-input" class="col-2 col-form-label">Năm nhập học</label>
                    <div class="col-10">
                    	<form:input path="bangTotNghiep.namNhapHoc" value="${ungVien.getBangTotNghiep().getNamNhapHoc() }"/>
                    </div>
                </div>
            <div class="form-group row">
                <label for="example-text-input" class="col-2 col-form-label">Năm tốt nghiệp</label>
                        <form:input path="bangTotNghiep.namTotNghiep" value="${ungVien.getBangTotNghiep().getNamTotNghiep() }"/>
                <div class="col-10">
                </div>
            </div>
            <div class="btn-zone">
                <input type="submit" class="btn-save" value="Save">
            </div>
        </div>
    </form:form>
    	</div>
</body>
<script src='<c:url value = "../../resources/bootstrap/js/js.js"></c:url>'></script>
</html>