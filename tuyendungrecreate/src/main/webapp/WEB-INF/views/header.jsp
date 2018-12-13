<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/header.css">
    <header>
        <div class="container">
            <div class="row header-top">
                <div class="col-md-4 header-top__right">
                    <img src='<c:url value="/resources/images/logo.png"></c:url>' />
                </div>
                <div class="col-md-8 header-top__left">
	                <div class="action">
	                	<c:choose>
	                		<c:when test="${sessionUser eq '' }">
								<a href="${pageContext.request.contextPath}/dangnhap/">Sign in</a>
	                    		<a href="${pageContext.request.contextPath}/dangki/">Sign up</a>
	                    		<a href="${pageContext.request.contextPath}/dangnhapNTD/">Nhà Tuyển Dụng</a>
	                		</c:when>
	                		<c:otherwise>
	                			<a href="${pageContext.request.contextPath}/capNhatThongTin/">${sessionUser}</a>
	                			<a href="${pageContext.request.contextPath}/logOut">Log out</a>
	                		</c:otherwise>
	                	</c:choose>
	                </div>
	                <div class="action">
	                </div>
	            </div>
            </div>
        </div>
        <div class="menu">
            <nav class="navbar navbar-expand-lg navbar-light">
                <div class="container collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="${pageContext.request.contextPath}/">HOME</a>
                        </li>
                        
                        
                        <c:choose>
	                		<c:when test="${sessionUser eq '' }">
	                		</c:when>
	                		<c:otherwise>
	                		 <li class="nav-item">
                            <a class="nav-link" href="${pageContext.request.contextPath}/ungtuyen/">VIỆC LÀM ỨNG TUYỂN</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">VIỆC LÀM PHÙ HỢP</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="${pageContext.request.contextPath}/vieclamquantam">VIỆC LÀM QUAN TÂM</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="${pageContext.request.contextPath}/viecoffer">VIỆC LÀM ĐƯỢC OFFER</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="${pageContext.request.contextPath}/quanlymessage">QUẢN LÝ TIN NHẮN</a>
                        </li>
	                		</c:otherwise>
	                	</c:choose>
                       
                    </ul>
                </div>
            </nav>
        </div>
    </header>