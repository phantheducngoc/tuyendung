<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

<head>
<jsp:include page="nhatuyendungLink.jsp"></jsp:include>
<link rel="stylesheet" href='<c:out value=""></c:out>'>
</head>

<body>
    <!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

	<jsp:include page="leftSideBar.jsp"></jsp:include>
    <!-- Start Welcome area -->
    <div class="all-content-wrapper">

		<jsp:include page="menunhatuyendung.jsp"></jsp:include>

        <div class="author-area-pro">
            <div class="container-fluid">
                <div class="row">

                    <div class="col-lg-12 col-md-4 col-sm-4 col-xs-12">
                        <div class="personal-info-wrap">
                        	<div>
                        		<div class="form-group row title">
					                <label class="title-name">Tạo tin tuyển dụng</label>
					            </div>
					            <div class="form-group row">
					                <label for="example-text-input" class="col-2 col-form-label">Vị trí tuyển dụng</label>
					                <div class="col-10">
					                    <input class="form-control" type="text" id="example-text-input">
					                </div>
					            </div>
                        	</div>
                        </div>
                    </div>
                 </div>
             </div>
         </div>
        </div>
        <div class="calender-area mg-tb-30">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="calender-inner">
                            <div id='calendar'></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="footer-copyright-area">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="footer-copy-right">
                            <p>Copyright © 2018 <a href="https://colorlib.com/wp/templates/">Colorlib</a> All rights reserved.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>

</html>
