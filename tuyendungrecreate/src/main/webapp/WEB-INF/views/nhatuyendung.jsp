<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

<head>
<jsp:include page="nhatuyendungLink.jsp"></jsp:include>
</head>

<body>
    <!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

	<jsp:include page="leftSideBar.jsp"></jsp:include>
    <!-- Start Welcome area -->
    <div class="all-content-wrapper">

		<jsp:include page="menunhatuyendung.jsp"></jsp:include>
        <div class="section-admin container-fluid">
            <div class="row admin text-center">
                <div class="col-md-12">
                    <div class="row">
                        <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                            <div class="admin-content analysis-progrebar-ctn res-mg-t-15">
                                <h4 class="text-left text-uppercase" style="font-weight:400; font-size:16px;color:#555">Việc làm phù hợp</h4>
                                <div class="row vertical-center-box vertical-center-box-tablet">

                                    <div class="col-xs-9 cus-gh-hd-pro">
                                        <h2 class="text-right no-margin">100</h2>
                                    </div>
                                </div>
                                <div class="progress progress-mini">
                                    <div style="width: 78%;" class="progress-bar bg-green"></div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12" style="margin-bottom:1px;">
                            <div class="admin-content analysis-progrebar-ctn res-mg-t-30">
                                <h4 class="text-left text-uppercase" style="font-weight:400; font-size:16px; color:#555">Lượt xem hồ sơ</h4>
                                <div class="row vertical-center-box vertical-center-box-tablet">

                                    <div class="col-xs-9 cus-gh-hd-pro">
                                        <h2 class="text-right no-margin">50</h2>
                                    </div>
                                </div>
                                <div class="progress progress-mini">
                                    <div style="width: 38%;" class="progress-bar progress-bar-danger bg-red"></div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                            <div class="admin-content analysis-progrebar-ctn res-mg-t-30">
                                <h4 class="text-left text-uppercase" style="font-weight:400; font-size:16px;color:#555">NTD xem hồ sơ</h4>
                                <div class="row vertical-center-box vertical-center-box-tablet">

                                    <div class="col-xs-9 cus-gh-hd-pro">
                                        <h2 class="text-right no-margin">10</h2>
                                    </div>
                                </div>
                                <div class="progress progress-mini">
                                    <div style="width: 20%;" class="progress-bar bg-blue"></div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                            <div class="admin-content analysis-progrebar-ctn res-mg-t-30">
                                <h4 class="text-left text-uppercase" style="font-weight:400; font-size:16px;color:#555">NTD lưu hồ sơ</h4>
                                <div class="row vertical-center-box vertical-center-box-tablet">

                                    <div class="col-xs-9 cus-gh-hd-pro">
                                        <h2 class="text-right no-margin">5</h2>
                                    </div>
                                </div>
                                <div class="progress progress-mini">
                                    <div style="width: 10%;" class="progress-bar bg-purple"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="product-sales-area mg-tb-30">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-9 col-md-9 col-sm-9 col-xs-12">

                                <div class="row">
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                        <div class="caption pro-sl-hd">
                                            <span class="caption-subject text-uppercase">Việc làm đã ứng tuyển mới nhất</span>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                        <div class="actions graph-rp">
                                            <div class="btn-group" data-toggle="buttons">
                                                <label class="btn btn-grey active">
													<input type="radio" name="options" class="toggle" id="option1" checked="">Hôm nay</label>
                                                <label class="btn btn-grey">
													<input type="radio" name="options" class="toggle" id="option2">Tuần trước</label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="author-area-pro">
            <div class="container-fluid">
                <div class="row">

                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                        <div class="personal-info-wrap">
                            <div class="widget-head-info-box">
                                <div class="persoanl-widget-hd">
                                    <h2>Công ty TNHH Thành Phát</h2>
                                    <p style="text-align:left">
                                        Tuyển dụng:</br>
                                        - Nhân viên Thiết kế</br>
                                        - Nhân viên Maketting</br>
                                        - Nhân viên Sale</br>
                                        - Nhân viên lễ tân</br>
                                        - Nhân viên triển khai kế hoạch.
                                    </p>
                                </div>
                                <div class="social-widget-result">
                                    <a href="#">Xem chi tiết &DDotrahd;</a>
                                </div>
                            </div>
                            <div class="widget-text-box">

                                <div class="text-right like-love-list">
                                    <a class="btn btn-xs btn-white"><i class="fa fa-thumbs-up"></i> Lưu </a>
                                    <a class="btn btn-xs btn-primary"><i class="fa fa-heart"></i> Chia sẻ</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                        <div class="author-widgets-single res-mg-t-30">
                            <div class="author-wiget-inner">
                                <div class="persoanl-widget-hd">
                                    <h2>Công ty TNHH Thành Phát</h2>
                                    <p style="text-align:left">
                                        Tuyển dụng:</br>
                                        - Nhân viên Thiết kế</br>
                                        - Nhân viên Maketting</br>
                                        - Nhân viên Sale</br>
                                        - Nhân viên lễ tân</br>
                                        - Nhân viên triển khai kế hoạch.
                                    </p>
                                </div>
                                <div class="social-widget-result social-widget1-result">
                                    <a href="#">Xem chi tiết</a>
                                </div>
                            </div>
                            <div class="widget-text-box">

                                <div class="text-right like-love-list">
                                    <a class="btn btn-xs btn-white"><i class="fa fa-thumbs-up"></i> Lưu </a>
                                    <a class="btn btn-xs btn-primary"><i class="fa fa-heart"></i> Chia sẻ</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                        <div class="personal-info-wrap personal-info-ano res-mg-t-30">
                            <div class="widget-head-info-box">
                                <div class="persoanl-widget-hd">
                                    <h2>Công ty TNHH Thành Phát</h2>
                                    <p style="text-align:left">
                                        Tuyển dụng:</br>
                                        - Nhân viên Thiết kế</br>
                                        - Nhân viên Maketting</br>
                                        - Nhân viên Sale</br>
                                        - Nhân viên lễ tân</br>
                                        - Nhân viên triển khai kế hoạch.
                                    </p>
                                </div>
                                <div class="social-widget-result">
                                    <a href="#">Xem chi tiết</a>
                                </div>
                            </div>
                            <div class="widget-text-box">

                                <div class="text-right like-love-list">
                                    <a class="btn btn-xs btn-white"><i class="fa fa-thumbs-up"></i> Lưu </a>
                                    <a class="btn btn-xs btn-primary"><i class="fa fa-heart"></i> Chia sẻ</a>
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
