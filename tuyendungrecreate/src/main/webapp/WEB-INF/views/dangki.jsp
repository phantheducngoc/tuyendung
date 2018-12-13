<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang ="en">
<head>
	<link href="<c:url value='../resources/bootstrap/css/bootstrap.min.css'></c:url>" rel="stylesheet" />
    <link href="<c:url value='../resources/css/register.css'></c:url>" rel="stylesheet" />
    
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
  	<div class="container">
        <div class="row main">
            <div class="main-login main-center">
            <h5>Sign up.</h5>
                <form:form class="" method="post" action="" modelAttribute="ungVien">
                    <div class="form-group">
                        <label for="email" class="cols-sm-2 control-label">Your Email</label>
                        <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
                                <form:input type="text" class="form-control" name="email" id="email"  placeholder="Enter your Email" path="email"/>
                            </div>
                        </div>
                    </div>
                    <div>
	                            <form:errors path="email" cssStyle="color:red;display:block"></form:errors>
                    </div>
                    <div class="form-group">
                        <label for="password" class="cols-sm-2 control-label">Password</label>
                        <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                <form:input type="password" class="form-control" name="password" id="password"  placeholder="Enter your Password" path="password"/>
                            </div>
                        </div>
                    </div>
                    <div>
                    			<form:errors path="password" cssStyle="color:red;display:block"></form:errors>
                    </div>
                    <div class="form-group">
                        <label for="confirm" class="cols-sm-2 control-label">Confirm Password</label>
                        <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                <input type="password" class="form-control" name="confirm" id="confirm"  placeholder="Confirm your Password"/>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <button type="submit" class="btn action">Register</button>
                    </div>
                </form:form>
            </div>
        </div>
	</div>
</body>
</html>