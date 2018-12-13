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
    <title>Quản lý message</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

    <br/>
    <br/>
    <div class="container">
        <div class="row">
            <div class="col-md-10">
                <div>
                    <div class="control-bar">
                        <ul>
                            <li>
                                <span class="span-btn1">
                                    <a class="control-btn1" href="${pageContext.request.contextPath}/quanlymessage">
                                        Thư nhận
                                    </a>
                                </span>
                            </li>
                            <li>
                                <span class="span-btn2">
                                    <a class="control-btn2" href="${pageContext.request.contextPath}/messagereply">
                                        Thư gửi
                                    </a>
                                </span>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="mail-box">
                    <div class="main-container">
                        <table>
                            <tr>
                                <th class="column1">
                                    From
                                </th>
                                <th class="column2">
                                    subject
                                </th>
                                <th class="column3">
                                    ngày nhận
                                </th>
                                <th class="column4">
                                    xóa
                                </th>
                            </tr>
                            <c:forEach var="message" items="${listMessages}">
                            	<tr>
                                <td class="column1">
                                    <a class="control-btn1" href="quanlymessage/sendMessage/${message.getId()}">
                                        ${message.getTinTuyenDung().getNhaTuyenDung().getTenDangKiHopPhap() }
                                    </a>
                                </td>
                                <td class="column2">
                                    <a class="control-btn1" href="quanlymessage/sendMessage/${message.getId()}">
                                        ${message.getSubject() }
                                    </a>
                                </td>
                                <td class="column3">
                                    ${message.getNgayGui() }
                                </td>
                                <td class="column4">
                                    <input type="checkbox"/>
                                </td>
                            </tr>
                            </c:forEach>
                        </table>
                        <p class="btn-container">
                            <input  class="btn-delete" type="submit" value="Xóa thư">
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>


</body>
</html>