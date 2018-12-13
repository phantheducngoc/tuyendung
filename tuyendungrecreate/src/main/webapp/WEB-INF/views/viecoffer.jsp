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
    <link rel="stylesheet" href='<c:url value="/resources/css/candidateoffer.css"></c:url>'>
    <title>Việc offer</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<br/>
    <div class="container">
        <c:forEach var="offer" items="${listOffer}">
        	<div class="row">
            <div class="col-md-10">
                <div class="col-md-1 left-side">
                    <p>
                        ${offer.getTinTuyenDung().getNgayHetHan() }
                    </p>
                </div>
                <div class="col-md-9 center-side">
                    <div class="header">
                        <header>
                                ${offer.getHeader() }
                        </header>       
                    </div>
                    <div class="main-container">
                        <div>
                            <a href="${pageContext.request.contextPath}/chitiet/${offer.getTinTuyenDung().getMaTinTuyenDung()}">
                                    <img src="resources/images/${offer.getHinhAnh() }" height="42" width="42">
                            </a>
                        </div>
                        <div>
                            <a href="${pageContext.request.contextPath}/chitiet/${offer.getTinTuyenDung().getMaTinTuyenDung()}">
                                <p>${offer.getContent() }</p>
                            </a>
                        </div>
                    </div>
                </div>
                <div class="col-md-1 right-side">
                    <button type="button" class="concern">Lưu</button>
                    <p>Còn ${offer.getRemainedDays() } ngày</p>
                    <button type="button" class="offer">Xem offer</button>
                </div>
            </div>
        </div>
        
        </c:forEach>
    </div>
</body>
</html>