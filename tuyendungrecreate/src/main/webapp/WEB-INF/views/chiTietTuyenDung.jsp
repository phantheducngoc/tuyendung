<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>JOB DETAILS</title>
    <link rel="stylesheet" type="text/css" href='<c:url value="https://fonts.googleapis.com/css?family=Lato:100,300,400,300italic"></c:url>'>
    <link rel="stylesheet" href='<c:url value="../resources/css/style.css"></c:url>'>
    <link rel="stylesheet" href='<c:url value="../resources/vendors/css/normalize.css"></c:url>'>
    <link rel="stylesheet" href='<c:url value="../resources/vendors/css/grid.css"></c:url>'>
    <link rel="stylesheet" href='<c:url value="../resources/vendors/css/animate.css"></c:url>'>
    <link rel="stylesheet" href='<c:url value="../resources/vendors/css/ionicons.min.css"></c:url>'>
    <style>
    	.nop-ho-so button{
  		    float: left;
		  background: #ff846e;
		  padding: 15px;
		  text-decoration: none;
		  color: white;
		  font-weight: 300;
		  margin: 30px 0 20px 90px;
    	}
    </style>
</head>

<body>
    <header>
        <div class="header" >
        	<div style="margin-right: 750px;">
        		<img class="logo" src='<c:url value="../resources/images/logo.png"/>'/>
        	</div>
        	<div class="col-md-8 header-top__left" style="margin-top: 50px;">
	                <div class="action">
	                	<c:choose>
	                		<c:when test="${sessionUser eq '' }">
								<a href="${pageContext.request.contextPath}/dangnhap/">Sign in</a>
	                    		<a href="${pageContext.request.contextPath}/dangki/">Sign up</a>
	                		</c:when>
	                		<c:otherwise>
	                			<a style="color: #007bff;text-decoration: none;font-weight: 400;" 
	                			href="${pageContext.request.contextPath}/capNhatThongTin/">${sessionUser}</a>
	                			<a style="color: #007bff;text-decoration: none;font-weight: 400;"
	                			 href="${pageContext.request.contextPath}/logOut">Log out</a>
	                		</c:otherwise>
	                	</c:choose>
	                </div>
	                <div class="action">
	                </div>
	            </div>
            
        </div>
        <nav class="menu">
            <ul class="main-nav">
                <li style="float: left;margin-left: 200px;">
                    <a href='<c:url value="../"></c:url>'>HOME</a>
                </li>
                <c:choose>
	                		<c:when test="${sessionUser eq '' }">
	                		</c:when>
	                		<c:otherwise>
	                		<li>
                    <a href="#">VIỆC LÀM ỨNG TUYỂN</a>
                </li>
                <li>
                    <a href="#">VIỆC LÀM PHÙ HỢP</a>
                </li>
                <li>
                    <a href="#">VIỆC LÀM QUAN TÂM</a>
                </li>
                <li>
                    <a href="#">VIỆC LÀM ĐƯỢC OFFER</a>
                </li>
                <li>
                    <a href="#">QUẢN LÝ TIN NHẮN</a>
                </li>
	                		</c:otherwise>
	                	</c:choose>
                
            </ul>
        </nav>
    </header>
    <section class="job-detail">
        <div class="row detail-item">
            <h3>${tinTuyenDung.getChucDanh()}</h3>
                <h4>${tinTuyenDung.getNhaTuyenDung().getTenDangKiHopPhap()}</h4>
                <div class="info-job">
                    <a id="viecquantam" href="#" class="btn">
                        <i class="icon ion-md-star-outline"></i> Lưu việc làm</a>
                    <a href="#" class="btn">
                        <i class="icon ion-md-share-alt"></i> Chia sẻ</a>
                    <div style="padding-top:15px">
                        <i class="icon ion-md-stopwatch" style="float: left;"></i>
                        <h5>Hạn nộp hồ sơ:</h5>
                        <span> &nbsp; ${tinTuyenDung.getNgayHetHan()}</span>
                    </div>
                    <p>Lượt xem: 1,160 | Mã: NTD2425097 | Ngày đăng: ${tinTuyenDung.getNgayDang()}</p>
                </div>
                <input type="hidden" value="${tinTuyenDung.getMaTinTuyenDung()}" id="maTinTuyenDung"/>
                <div class="nop-ho-so">
                    <button class="nopHoSo" href="">NỘP HỒ SƠ</button>
                </div>
        <div class="row info">
            <ul class="info-left">
                <li><i class="icon ion-md-cash"></i>  &nbsp;Mức lương: ${tinTuyenDung.getMucLuongToiThieu()} – ${tinTuyenDung.getMucLuongToiDa()} triệu</li>
                <li><i class="icon ion-md-briefcase"></i> &nbsp;Kinh nghiệm: 4 năm</li>
                <li><i class="icon ion-md-ribbon"></i> &nbsp;Yêu cầu bằng cấp: Đại học</li>
                <li><i class="icon ion-md-person"></i> &nbsp;Số lượng cần tuyển: 1</li>
                <li><i class="icon ion-md-bulb"></i> &nbsp;Ngành nghề: IT phần cứng/mạng, IT phần mềm, Công nghệ cao</li>
            </ul>
            <ul class="info-right">
                <li><i class="icon ion-md-home"></i> &nbsp;Địa điểm làm việc: Việc làm TP.HCM</li>
                <li><i class="icon ion-md-contacts"></i> &nbsp;Chức vụ: Quản lý cấp trung</li>
                <li><i class="icon ion-md-today"></i> &nbsp;Hình thức làm việc: Toàn thời gian cố định</li>
                <li><i class="icon ion-md-clock"></i> &nbsp;Thời gian thử việc: 2 tháng</li>
                <li><i class="icon ion-md-happy"></i> &nbsp;Yêu cầu độ tuổi: Không yêu cầu độ tuổi</li>
            </ul>
        </div>
        </div>



    </section>
    <section class="chitiet-ss">
        <div class="row chitietcv">
        <h4>Thông tin tuyển dụng IT Manager</h4>
        <h4>MÔ TẢ CÔNG VIỆC</h4>
        <p>
             - Trực tiếp triển khai thực hiện các nhiệm vụ được giao từ TGĐ.</br> - Quản lý phòng CNTT, đưa ra các kế hoạch chính sách; tham
            mưu trực tiếp cho Ban GĐ về mảng CNTT trong Công ty.</br> - Triển khai xây dựng hệ thống và chiến lược ứng dụng và chính sách
            CNTT trong toàn bộ Tổng Công ty và các Công ty thành viên </br>- Tham gia triển khai xây dựng hệ thống phần mềm CNTT phù hợp với
            tình hình của công ty. </br>- Vận hành ổn định, hiệu quả hệ thống thông tin hiện có.</br> - Phụ trách vận hành hệ thống CNTT của công
            ty và các đơn vị thành viên.</br> - Thiết lập hệ thống máy chủ cục bộ, mạng nội bộ, internet, wifi, camera, máy chấm công, điện
            thoại bàn.</br> - Đảm bảo an ninh hệ thống về camera, wifi, server</br> - Quản lý hệ thống mạng nội bộ, file server, sửa chữa khắc
            phục sự cố máy tính, hệ thống mạng.</br> - Tiếp nhận, phân tích yêu cầu, phân tích user case, tư vấn và thiết kế giải pháp. Nêu
            yêu cầu chuyên môn đối với phần mềm với các nhà thầu để tiến hành xây dựng, chỉnh sửa.</br> - Ứng dụng các công nghệ mới vào đào
            tạo trực tuyến (3D, Vitual Class Room, Google Glass, Hangout, Oculus, Hologen, Emotive, Robostics,...)</br> - Xây dựng các công
            cụ tự động hóa cho người dùng cuối (End User).</br> - Định kỳ báo cáo hoạt động của hệ thống phần mềm theo yêu cầu của Ban giám
            đốc.</br> - Giám sát thực hiện hệ thống các quy trình, quy định, hướng dẫn sử dụng hệ thống thông tin.</br> - Nghiên cứu, tham mưu
            tư vấn cho BLĐ Công ty về các ứng dụng công nghệ thông tin mới và phát triển các dự án nhằm tăng năng suất lao động.</br>
        </p>
        <h5>QUYỀN LỢI ĐƯỢC HƯỞNG</h5>
        <p>
             Thưởng:</br> - Thưởng nhân các ngày lễ, tết và các sự kiện đặc biệt của công ty. - Thưởng thành tích định kỳ và đột xuất cho
            cá nhân hoặc tập thể.</br> - Thưởng sáng kiến cải tiến kỹ thuật, nâng cao hiệu quả hoạt động kinh doanh.</br> Bảo hiểm:</br> - Bảo hiểm
            Xã hội, Y tế, Thất nghiệp theo quy định của nhà nước - Bảo hiểm sức khoẻ chất lượng cao (cho cấp quản lý)</br> - Bảo hiểm tai
            nạn 24 / 24.</br> Phúc lợi khác:</br> - Trợ cấp nhân các sự kiện đặc biệt của CB-CNV - Hỗ trợ tiền tàu xe dịp tết</br> - Chương trình du
            lịch trong và ngoài nước hàng năm</br> - Khám sức khỏe tổng quát định kỳ tại những trung tâm y tế chất lượng, uy tín -</br> Các hoạt
            động văn hóa, văn nghệ, thể thao dành cho CB-CNV
        </p>
        <h5>YÊU CẦU KHÁC</h5>
        <p>* Chuyên môn:</br> - Có kinh nghiệm với các phần mềm quản lý ERP </br>- Có kiến thức tốt trong lĩnh vực CNTT chuyên ngành Quản trị
        mạng.</br> - Có hiểu biết về quản trị website, email. </br>- Kinh nghiệm: Tối thiểu: 02 năm kinh nghiệm ở vị trí tương đương.</br> * Kỹ
        năng</br> - Có kỹ năng giao tiếp tốt, linh hoạt, chủ động, sáng tạo trong công việc, có khả năng làm việc độc lập và theo nhóm.</br>
        - Có đức tính trung thực, hòa đồng, chủ động trong việc với tinh thần trách nhiệm cao, tôn trọng, hòa nhã với đồng nghiệp.</br>
        - Tuyệt đối bảo mật thông tin trong Công ty.</br> * Ưu tiên:</br> - Tốt nghiệp Đại Học chuyên ngành CNTT </br>- Có kỹ năng lập trình về
        PHP, C#, MVC, ASP.net SQL server …. </br>- Có kinh nghiệm làm việc từ 2 năm trở lên, đã từng là team leader.</br> - Chịu đựng được
        áp lực cao.</br> - Không ngại khó học hỏi công nghê mới.</br> - Nắm vững các kiến thức cở sở đã được đào tạo ở ĐH. - Trên 27 tuổi.</p>

        <h5>HÌNH THỨC NỘP HỒ SƠ</h5>
        <p>Bấm vào nút NỘP HỒ SƠ để ứng tuyển</p>
        <div style="padding-top:15px; float:left">
            <i class="icon ion-md-stopwatch" style="float: left;"></i>
            <h5 style="float:left">&nbsp;Hạn nộp hồ sơ:</h5>
            <span style="font-size:80%; color:#ff826c"> &nbsp; 06/12/2018</span>
        </div>
        <div class="nop-ho-so">
        </div>
        </div>

    </section>
    <section class="chitiet-ss">
        <div class="row chitietcv">
            <h4>
                 THÔNG TIN LIÊN HỆ
            </h4>
            <h5>NGƯỜI LIÊN HỆ</h5>
            <p>Công ty Cổ Phần Đối Tác Dimonds</p>
            <h5>ĐỊA CHỈ LIÊN HỆ</h5>
            <p>628C, Xa lộ Hà Nội, P.An Phú, Thảo Điền, Q.2, Tp.HCM</p>
            <span class="last">Vui lòng bấm nút "Nộp hồ sơ" để ứng tuyển vào vị trí công việc này.</span>
        </div>
    </section>

</body>
<footer>
        <div class="row">
            <div class="col span-1-of-2">
                <ul class="footer-nav">
                    <li><a href="#">Quản lý</a></li>
                    <li><a href="#">Chuyên môn</a></li>
                    <li><a href="#">Nhà Tuyển Dụng</a></li>
                    <li><a href="#">Điều khoản</a></li>
                </ul>
            </div>
            <div class="col span-1-of-2">
                <ul class="social-icons">
                    <li><a href="#"><i class="icon ion-logo-facebook"></i></a></li>
                    <li><a href="#"><i class="icon ion-logo-twitter"></i></a></li>
                    <li><a href="#"><i class="icon ion-logo-googleplus"></i></a></li>
                    <li><a href="#"><i class="icon ion-logo-instagram"></i></a></li>
                </ul>
            </div>
        </div>
        <div class="row">
            <p>
                Copyright &copy; 2018 by Sam Dong. All rights reserved
            </p>
        </div>
    </footer>
 <script type="text/javascript" src="${pageContext.request.contextPath}/resources/bootstrap/js/js.js"></script>
 <script type="text/javascript" src="${pageContext.request.contextPath}/resources/bootstrap/js/custom.js"></script>
</html>
