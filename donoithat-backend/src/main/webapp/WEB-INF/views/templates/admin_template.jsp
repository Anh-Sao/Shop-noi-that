<%-- <%@ page language="java" contentType="text/html"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<link href="resources/img/logo/logo.png" rel="icon">
<title>ADMIN</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.7/angular.js"></script>
<base href="${pageContext.servletContext.contextPath}/">
<link href="resources/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link href="resources/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css">
<link href="resources/css/ruang-admin.min.css" rel="stylesheet">
<!-- <link href="resources/vendor/datatables/dataTables.bootstrap4.min.css"
	rel="stylesheet"> -->


<!-- 	<script
		src="resources/vendor/chart.js/Chart.min.js"></script>
	<script
		src="resources/js/demo/chart-area-demo.js"></script> -->
<!-- <script src="resources/vendor/datatables/jquery.dataTables.min.js"></script>
	<script src="resources/vendor/datatables/dataTables.bootstrap4.min.js"></script>  -->
</head>

<body id="page-top" ng-app="APP">
	<div id="wrapper">
		<!-- Sidebar -->
		<ul class="navbar-nav sidebar sidebar-light accordion"
			id="accordionSidebar">
			<a
				class="sidebar-brand d-flex align-items-center justify-content-center"
				href="admin/index">
				<div class="sidebar-brand-icon">
					<img src="resources/img/logo/logo.png">
				</div>
				<div class="sidebar-brand-text mx-3">AnhSao Group</div>
			</a>
			<hr class="sidebar-divider my-0">
			<li class="nav-item active"><a class="nav-link"
				href="admin/index"> <i class="fas fa-fw fa-tachometer-alt"></i>
					<span>TRANG CHỦ</span></a></li>
			<hr class="sidebar-divider">
			<div class="sidebar-heading">CHỨC NĂNG</div>
			<li class="nav-item"><a class="nav-link collapsed" href="#"
				data-toggle="collapse" data-target="#collapseBootstrap"
				aria-expanded="true" aria-controls="collapseBootstrap"> <i
					class="far fa-fw fa-window-maximize"></i> <span>Quản Lý</span>
			</a>
				<div id="collapseBootstrap" class="collapse"
					aria-labelledby="headingBootstrap" data-parent="#accordionSidebar">
					<div class="bg-white py-2 collapse-inner rounded">
						<a class="collapse-item" href="alerts.html">Nhân Viên</a> <a
							class="collapse-item" href="admin/customer">Khách Hàng</a> <a
							class="collapse-item" href="dropdowns.html">Sản Phẩm</a> <a
							class="collapse-item" href="admin/supplier">Nhà Cung Cấp</a> <a
							class="collapse-item" href="popovers.html">Hóa Đơn</a>
					</div>
				</div></li>
			<li class="nav-item"><a class="nav-link" href="ui-colors.html">
					<i class="far fa-building"></i> <span>Nhà Cung Cấp</span>
			</a></li>

			<li class="nav-item"><a class="nav-link" href="ui-colors.html">
					<i class="fas fa-fw fa-chart-area"></i><span>Thống Kê</span>
			</a></li>
			<hr class="sidebar-divider">
			<div class="sidebar-heading">Ngôn Ngữ</div>
			<li class="nav-item"><a class="nav-link" href="ui-colors.html">
					<i class="fab fa-vimeo-v"></i> <span>Tiếng Việt</span>
			</a></li>
			<li class="nav-item"><a class="nav-link" href="charts.html">
					<i class="fab fa-erlang"></i> <span>English</span>
			</a></li>
			<hr class="sidebar-divider">
			<div class="version" id="version-ruangadmin"></div>
		</ul>
		<!-- Sidebar -->
		<div id="content-wrapper" class="d-flex flex-column">
			<!-- TopBar -->
			<nav
				class="navbar navbar-expand navbar-light bg-navbar topbar mb-4 static-top">
				<button id="sidebarToggleTop"
					class="btn btn-link rounded-circle mr-3">
					<i class="fa fa-bars"></i>
				</button>
				<ul class="navbar-nav ml-auto">
					<li class="nav-item dropdown no-arrow"><a
						class="nav-link dropdown-toggle" href="#" id="searchDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> <i class="fas fa-search fa-fw"></i>
					</a>
						<div
							class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
							aria-labelledby="searchDropdown">
							<form class="navbar-search">
								<div class="input-group">
									<input type="text" class="form-control bg-light border-1 small"
										placeholder="What do you want to look for?"
										aria-label="Search" aria-describedby="basic-addon2"
										style="border-color: #3f51b5;">
									<div class="input-group-append">
										<button class="btn btn-primary" type="button">
											<i class="fas fa-search fa-sm"></i>
										</button>
									</div>
								</div>
							</form>
						</div></li>

					<div class="topbar-divider d-none d-sm-block"></div>
					<li class="nav-item dropdown no-arrow"><a
						class="nav-link dropdown-toggle" href="#" id="userDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> <img class="img-profile rounded-circle"
							src="img/boy.png" style="max-width: 60px"> <span
							class="ml-2 d-none d-lg-inline text-white small">Maman
								Ketoprak</span>
					</a>
						<div
							class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
							aria-labelledby="userDropdown">
							<a class="dropdown-item" href="#"> <i
								class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i> Profile
							</a> <a class="dropdown-item" href="#"> <i
								class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i> Settings
							</a> <a class="dropdown-item" href="#"> <i
								class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i> Activity
								Log
							</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="javascript:void(0);"
								data-toggle="modal" data-target="#logoutModal"> <i
								class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
								Logout
							</a>
						</div></li>
				</ul>
			</nav>
			<!-- Topbar -->
			<!--   	Nạp nội dung trang con -->
			<tiles:insertAttribute name="content"></tiles:insertAttribute>


			<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
				aria-labelledby="exampleModalLabelLogout" aria-hidden="true">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h5 class="modal-title" id="exampleModalLabelLogout">Ohh No!</h5>
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
						</div>
						<div class="modal-body">
							<p>Are you sure you want to logout?</p>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-outline-primary"
								data-dismiss="modal">Cancel</button>
							<a href="login.html" class="btn btn-primary">Logout</a>
						</div>
					</div>
				</div>
			</div>
<!-- 			<footer class="sticky-footer bg-white ">
				<div class="container my-auto">
					<div class="copyright text-center my-auto">
						<span> <b>Team Anh Sao</b>
						</span>
					</div>
				</div>
			</footer> -->
			<!-- Footer -->
			<footer class="sticky-footer bg-white fixed">
				<div class="container my-auto">
				  <div class="copyright text-center my-auto">
					<span> &copy; <script> document.write(new Date().getDate() +'/'+(new Date().getMonth()+1)+"/"+new Date().getFullYear()); </script>
					  <b>Team Anh Sao</b>
					</span>
				  </div>
				</div>
			  </footer>
		</div>
	</div>

	<!-- Scroll to top -->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>
	<script src="resources/js/angular.min.js"></script>

	
	
	<script src="resources/vendor/jquery/jquery.min.js"></script>
	<script src="resources/js/jquery.twbsPagination.js"></script>
	<script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="resources/vendor/jquery-easing/jquery.easing.min.js"></script>
	<script src="resources/js/ruang-admin.min.js"></script>
	<script src="resources/js/dirPagination.js"></script>
</body>
</html>