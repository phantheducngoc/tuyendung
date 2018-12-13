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
    <link rel="stylesheet" href='<c:url value="../resources/bootstrap/css/bootstrap.min.css"></c:url>'>
    <link rel="stylesheet" href='<c:url value="../resources/bootstrap/js/bootstrap.min.js"></c:url>'>
    <link rel="stylesheet" href='<c:url value="../resources/css/header.css"></c:url>'>
    <link rel="stylesheet" href='<c:url value="../resources/css/hoSoUngVien.css"></c:url>'>
    
<title>Thông tin hồ sơ</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="container">
			<table class="table">
            <thead>
              <tr>
                <th style="width:400px;">Thông tin cá nhân</th>
            </tr>
            </thead>
            <tbody>
            	<tr>
                <td>Ảnh cá nhân</td>
                <td><img alt="" style ="height: 150px;width: 200px" src='<c:url value = "../resources/images/${ungVien.getHinhAnhCaNhan()}"></c:url>'></td>
              </tr>
              <tr>
                <td>Họ và tên</td>
                <td>${ungVien.getTenUngVien()}</td>
              </tr>
              <tr>
                <td>Email</td>
                <td>${ungVien.getEmail() }</td>
              </tr>
              <tr>
                <td>Địa chỉ</td>
                <td>${ungVien.getDiaChi() }</td>
              </tr>
              <tr>
                <td>Điện thoại</td>
                <td>${ungVien.getDienThoai() }</td>
              </tr>
              
            </tbody>
          </table>
          <a class="btnChange" href="updateProfile/">Change</a>
 </div>
 
 <br/>
 <div class="container">
		 <table class="table">
            <thead>
              <tr>
                <th style="width:400px;">Trình độ học vấn</th>
            </tr>
            </thead>
            <tbody>
              <tr>
                <td>Trình độ</td>
                <td>${ungVien.getBangTotNghiep().getTrinhDoHocVan().getTenTrinhDo() }</td>
              </tr>
            	<tr>
                <td>Tên trường</td>
                <td>${ungVien.getBangTotNghiep().getTruongHoc().getTenTruong() }</td>
              </tr>
              <tr>
                <td>Tên ngành</td>
                <td>${ungVien.getBangTotNghiep().getNganhHoc().getTenNganh() }</td>
              </tr>
              <tr>
                <td>Năm nhập học</td>
                <td>${ungVien.getBangTotNghiep().getNamNhapHoc()}</td>
              </tr>
              <tr>
                <td>Năm tốt nghiệp</td>
                <td>${ungVien.getBangTotNghiep().getNamTotNghiep()}</td>
              </tr>
            </tbody>
          </table>
          <a class="btnChange" href="updateEducation/">Change</a>
 </div>
</body>
</html>