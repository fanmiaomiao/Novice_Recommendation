<%@ page contentType="text/html; charset=utf8"%>
<!DOCTYPE html>
<html lang="en-us">
  <head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <script src="${pageContext.request.contextPath }/lib/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath }/lib/js/bootstrap/bootstrap.min.js"></script>
    <script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=cGZxldFBKNqlpa0dsA0I8qBZG6VDQjRn"></script>
    <script type="text/javascript" src="http://api.map.baidu.com/library/Heatmap/2.0/src/Heatmap_min.js"></script>
    <!--[if lt IE 9]>
    <script src="js/bootstrap/html5shiv.min.js"></script>
    <script src="js/bootstrap/respond.min.js"></script>
    <![endif]-->
    <!--页面加载进度条-->
    <script src="${pageContext.request.contextPath }/lib/js/pace/pace.min.js"></script>
    <script src="${pageContext.request.contextPath }/lib/js/jquery.scrolltopcontrol/scrolltopcontrol.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/lib/js/jquery.extend.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/app.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/default.js" type="text/javascript"></script>
    <script src="user-manage.js" type="text/javascript"></script>

    <link rel="icon" href="${pageContext.request.contextPath }/favicon.ico" />
    <link href="${pageContext.request.contextPath }/lib/css/pace/dataurl.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath }/lib/css/bootstrap.min.css" rel="stylesheet" />
    <link href="${pageContext.request.contextPath }/lib/css/bootstrap-responsive.min.css" rel="stylesheet" />
    <link href="${pageContext.request.contextPath }/lib/css/style-responsive.css" rel="stylesheet" />
    <link href="${pageContext.request.contextPath }/lib/css/font-awesome.min.css" rel="stylesheet" />
    <link href="${pageContext.request.contextPath }/css/default.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css" />
    <link href="user-manage.css" rel="stylesheet" type="text/css" />
  </head>
  <body class="page-header-fixed">
    <!-- BEGIN HEADER -->
    <div class="header navbar navbar-inverse navbar-fixed-top">
      <!-- BEGIN TOP NAVIGATION BAR -->
      <div class="navbar-inner">
        <div class="container-fluid">
          <!-- BEGIN LOGO -->
          <a class="brand"  href="${pageContext.request.contextPath }/index.html">
            <span style="color: skyblue;font-size: 25px;">智慧城市</span>
            <img src="${pageContext.request.contextPath }/image/logo-front.png">
          </a>
          <!-- END LOGO -->
          <!-- BEGIN USER -->
          <ul class="nav pull-right">
            <li class="dropdown user">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                <img alt="" src="${pageContext.request.contextPath }/image/avater_manager.jpg" />
                <span class="username">manager</span>
                <i class="fa fa-angle-down"></i>
              </a>
              <ul class="dropdown-menu">
                <li><a href="${pageContext.request.contextPath }/view/User-profile/User-profile.html"><i class="fa fa-user"></i> My Profile</a></li>
                <li><a href="#"><i class="fa fa-tasks"></i> My Tasks</a></li>
                <li class="divider"></li>
                <li><a href="${pageContext.request.contextPath }/view/Login/login.html"><i class="fa fa-sign-out fa-fw"></i> Log Out</a></li>
              </ul>
            </li>
          </ul>
          <!-- END USER -->
        </div>
      </div>
      <!-- END TOP NAVIGATION BAR -->
    </div>
    <!-- END HEADER -->
    <!-- BEGIN CONTAINER -->
    <div class="page-container row-fluid">
      <!-- BEGIN SIDEBAR -->
      <div class="page-sidebar nav-collapse">
        <!-- BEGIN SIDEBAR MENU -->
        <ul class="page-sidebar-menu">
          <li>
            <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
            <div class="sidebar-toggler hidden-phone"></div>
            <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
          </li>
          <li class="start">
            <a href="${pageContext.request.contextPath }/index.html">
              <i class="fa fa-home fa-fw"></i>
              <span class="title">&nbsp;主页面</span>
            </a>
          </li>
          <li>
            <a href="${pageContext.request.contextPath }/view/Mac-track/Mac-track.html">
              <i class="fa fa-mobile-phone fa-fw"></i>
              <span class="title"> &nbsp;添加商家</span>
              
            </a>
          </li>
          <!-- <li>
            <a href="${pageContext.request.contextPath }/view/People-track/People-track.html">
              <i class="fa fa-hospital-o fa-fw"></i>
              <span class="title">&nbsp;人流轨迹</span>
            </a>
          </li> -->
          
          <li  class="has-sub" >
            <a href="javascript:void(0);">
              <i class="fa fa-angle-double-down fa-fw"></i>
              <span class="title">&nbsp;AP排行榜</span>
              <span class="arrow "></span>
            </a>
            <ul class="sub-menu">
              <li><a href="${pageContext.request.contextPath }/view/AP-rank/all-rank.html"><i class="fa fa-hospital-o fa-fw"></i>&nbsp;总排行榜</a></li>
              <li><a href="${pageContext.request.contextPath }/view/AP-rank/quarter-rank.html"><i class="fa fa-train fa-fw"></i>&nbsp;最近两个小时排行榜</a></li>
              <li><a href="${pageContext.request.contextPath }/view/AP-rank/month-rank.html"><i class="fa fa-coffee fa-fw"></i>&nbsp;最近10分钟排行榜</a></li>
            </ul>
          </li>
          <li>
            <a href="${pageContext.request.contextPath }/view/connect/AP-manage.html">
              <i class="fa fa-hospital-o fa-fw"></i>
              <span class="title">&nbsp;AP管理</span>
            </a>
          </li>
          <li>
            <a href="User-manage.html">
              <i class="fa fa-user fa-fw"></i>
              <span class="title">&nbsp;商家管理</span>
            </a>
          </li>
          <li>
            <a href="${pageContext.request.contextPath }/view/Contact/contact.html">
              <i class="fa fa-user fa-fw"></i>
              <span class="title">&nbsp;联系我们</span>
            </a>
          </li>
        </ul>
      </div>
    </div>
    <div class="page-content">
      <!--content-page-->
      <ul class="breadcrumb">
        <li>当前位置：</li>
        <li class="active">用户管理</li>
      </ul>
      <div id="page-container">
        <div class="search">
          <input type="text"  style="height: 45px;width:300px;display: inline-block;" class="form-control search-input" placeholder="请输入查询点用户编号......">
          <button type="button" class="btn btn-default">Search</button>
          <button type="button" class="btn btn-default" onclick="AddAp('.add-ap')" style="margin-left: 50px;color:white;">Add</button>
        </div>
        <div class="ap-table">
        <table id="cs_table" class="datatable"></table>
      </div>
		<form id="form1" method="post" action="${pageContext.request.contextPath }/merchant_update.action">
			<div id="shuru">
				商户名称：<input type="text" id="merchantName" name="merchantName"><br> 
				对应AP：<input type="text" id="ap" name="ap.apId"><br> 
				账号：<input type="text" id="account" name="merchantAccount"><br> 
				密码：<input type="password" id="pwd" name="merchantPwd"><br>
				<input type="submit" value="确定修改"> 
				<input type="reset" value="取消">
			</div>
		</form>
    </div>

      <div id="mask" class="mask"></div>


    <div class="pop del-ap">
      <div class = "head">
        <span>删除用户</span>
      </div>
      <div class="body">
        <div class="content">确定删除该用户吗</div>
        <div class="button-group">
          <button type="button" onclick="CancelDeleteAp('.del-pop')" class="btn btn-default"> 取消</button>
          <button type="button" onclick="CancelDeleteAp('.del-pop')" class="btn btn-default" style="background-color: #da4453; color: white;"> 确定</button>
        </div>
      </div>
    </div>
    <div class="pop add-ap">
      <div class ="head">
        <span>增加用户</span>
      </div>
      <div class="body">
        <div class="name" style="margin-bottom: 10px;">
          <label>用户名</label>
          <input type="text" placeholder="Name">
        </div>
        <div class="location" style="margin-bottom: 10px;">
          <label style="width: 46px;">对应ap</label>
          <input type="text" placeholder="121.2324" class="m-wrap medium">
        </div>
        <div class="location" style="margin-bottom: 10px;">
          <label style="width: 46px;">账号</label>
          <input placeholder="29.2324" class="m-wrap medium">
        </div>
        <div class="location" style="margin-bottom: 10px;">
          <label style="width: 46px;">密码</label>
          <input placeholder="29.2324" class="m-wrap medium">
        </div>
        <div class="remark">
          <label style="width: 46px;">备注</label>
          <select class="medium m-wrap" tabindex="1" style="height: 33px;">
            <option value="Category 1"> 医院</option>
            <option value="Category 2"> 学校 </option>
            <option value="Category 3"> 车站</option>
            <option value="Category 4"> 广场 </option>
            <option value="Category 4"> 其他 </option>
          </select>
        </div>
        <div class="button-group">
          <button type="button" onclick="CancelAddAp('.add-ap')" class="btn btn-default" > 取消</button>
          <button type="button" onclick="CancelAddAp('.add-ap')" class="btn btn-default" style="background-color: #00acac; color: white;"> 保存</button>
        </div>
      </div>
    </div>
    
    
    <a href="#top" id="goTop"><i class="fa fa-angle-up fa-3x"></i></a>
    </div>
  </body>
</html>