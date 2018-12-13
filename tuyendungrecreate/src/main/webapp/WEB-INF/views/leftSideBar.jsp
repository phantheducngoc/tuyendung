<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

    <div class="left-sidebar-pro">
        <nav id="sidebar" class="">
			<div class="nalika-profile">
				<div class="profile-dtl">
					<a href="#"><img src="${pageContext.request.contextPath}/resources/profile/img/notification/diem.png" alt="" /></a>
					<h2>Diễm<span class="min-dtn">Trình</span></h2>
				</div>
				<div class="profile-social-dtl">
					<ul class="dtl-social">
						<li><a href="#"><i class="icon nalika-facebook"></i></a></li>
						<li><a href="#"><i class="icon nalika-twitter"></i></a></li>
						<li><a href="#"><i class="icon nalika-linkedin"></i></a></li>
					</ul>
				</div>
			</div>
            <div class="left-custom-menu-adp-wrap comment-scrollbar">
                <nav class="sidebar-nav left-sidebar-menu-pro">
                    <ul class="metismenu" id="menu1">
                        <li class="active">
                            <a class="has-arrow" href="${pageContext.request.contextPath}/dangtintuyendung">
								   <i class="icon nalika-pie-chart icon-wrap"></i>
								   <span class="mini-click-non">Đăng tin tuyển dụng</span>
								</a>

                        </li>
                        <li>
                            <a class="has-arrow" href="#" aria-expanded="false"><i class="icon nalika-bar-chart icon-wrap"></i> <span class="mini-click-non">Tìm ứng viên</span></a>
                        </li>
                        <li>
                            <a class="has-arrow" href="#" aria-expanded="false"><i class="icon nalika-diamond icon-wrap"></i> <span class="mini-click-non">Quản lý hồ sơ</span></a>

                        </li>
                    </ul>
                </nav>
            </div>
        </nav>
    </div>
</html>
