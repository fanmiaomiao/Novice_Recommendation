﻿<!DOCTYPE html>
<html lang="en-us">
  <head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <script src="lib/js/jquery.min.js"></script>
    <script src="lib/js/bootstrap/bootstrap.min.js"></script>
    <script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=93P0vD822oVV3CnwEw48U6uWbmcpGGGo"></script>
    <script type="text/javascript" src="lib/js/Heatmap_min.js"></script>
    <!--[if lt IE 9]>
    <script src="js/bootstrap/html5shiv.min.js"></script>
    <script src="js/bootstrap/respond.min.js"></script>
    <![endif]-->
    <!--页面加载进度条-->
    <script src="lib/js/pace/pace.min.js"></script>
    <script src="lib/js/jquery.scrolltopcontrol/scrolltopcontrol.js" type="text/javascript"></script>
    <script src="lib/js/jquery.extend.js" type="text/javascript"></script>
    <script src="js/app.js" type="text/javascript"></script>
    <script src="js/default.js" type="text/javascript"></script>
    <script src="js/index.js" type="text/javascript"></script>
    
    <link rel="icon" href="favicon.ico" />
    <link href="lib/css/pace/dataurl.css" rel="stylesheet" type="text/css" />
    <link href="lib/css/bootstrap.min.css" rel="stylesheet" />
    <link href="lib/css/bootstrap-responsive.min.css" rel="stylesheet" />
    <link href="lib/css/style-responsive.css" rel="stylesheet" />
    <link href="lib/css/font-awesome.min.css" rel="stylesheet" />
    <link href="css/default.css" rel="stylesheet" type="text/css" />
    <link href="css/style.css" rel="stylesheet" type="text/css" />
  </head>
  <body class="page-header-fixed">
    <!-- BEGIN HEADER -->
    <div class="header navbar navbar-inverse navbar-fixed-top">
      <!-- BEGIN TOP NAVIGATION BAR -->
      <div class="navbar-inner">
        <div class="container-fluid">
          <!-- BEGIN LOGO -->
          <a class="brand" href="index.html">
            <span style="color: skyblue;font-size: 25px;">智慧城市</span>
            <img src="image/logo-front.png">
          </a>
          <!-- END LOGO -->
          <!-- BEGIN USER -->
          <ul class="nav pull-right">
            <li class="dropdown user">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                <img alt="" src="image/avater_manager.jpg" />
                <span class="username">manager</span>
                <i class="fa fa-angle-down"></i>
              </a>
              <ul class="dropdown-menu">
                <li><a href="views/User-profile/User-profile.html"><i class="fa fa-user"></i> My Profile</a></li>
                <li><a href="#"><i class="fa fa-tasks"></i> My Tasks</a></li>
                <li class="divider"></li>
                <li><a href="views/Login/login.html"><i class="fa fa-sign-out fa-fw"></i> Log Out</a></li>
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
            <a href="index.html">
              <i class="fa fa-home fa-fw"></i>
              <span class="title">&nbsp;主页面</span>
            </a>
          </li>
          <li>
            <a href="views/Mac-track/Mac-track.html">
              <i class="fa fa-mobile-phone fa-fw"></i>
              <span class="title">添加商家</span>
              
            </a>
          </li>

          <li  class="has-sub" >
            <a href="javascript:void(0);">
              <i class="fa fa-angle-double-down fa-fw"></i>
              <span class="title">&nbsp;AP排行榜</span>
              <span class="arrow "></span>
            </a>
            <ul class="sub-menu">
              <li><a href="views/AP-rank/all-rank.html"><i class="fa fa-hospital-o fa-fw"></i>&nbsp;总排行榜</a></li>
              <li><a href="views/AP-rank/quarter-rank.html"><i class="fa fa-train fa-fw"></i>&nbsp;最近两小时排行榜</a></li>
              <li><a href="views/AP-rank/month-rank.html"><i class="fa fa-coffee fa-fw"></i>&nbsp;近10分钟排行榜</a></li>
            </ul>
          </li>
          <li>
            <a href="views/connect/AP-manage.html">
              <i class="fa fa-hospital-o fa-fw"></i>
              <span class="title">&nbsp;用户连接管理</span>
            </a>
          </li>
          
          <li>
            <a href="views/User-manage/User-manage.html">
              <i class="fa fa-user fa-fw"></i>
              <span class="title">&nbsp;商家管理</span>
            </a>
          </li>
          <li>
            <a href="views/Contact/contact.html">
              <i class="fa fa-user fa-fw"></i>
              <span class="title">&nbsp;联系我们</span>
            </a>
          </li>
        </ul>
      </div>
    </div>
    <div class="page-content" style="width:90%;">

      <!--content-page-->
      <ul class="breadcrumb">
        <li>当前位置：</li>
        <li class="active">主页面</li>
      </ul>

      <div style="background-image:url(image/3.png); width: 1000px;height: 730px;">
        <table align="center">
          <tr>
            <td align="center" width="150px" height="150px" bgcolor="gray"><a href="views/Mac-track/merchant.html">1</a></td>
            <td align="center" width="150px" height="150px" bgcolor="green"><a href="views/Mac-track/Mac-track.html">2</a></td>
            <td align="center" width="150px" height="150px" bgcolor="gray"><a href="#">3</a></td>
            <td align="center" width="150px" height="150px" bgcolor="green"><a href="#">4</a></td>
            <td align="center" width="150px" height="150px" bgcolor="gray"><a href="#">5</a></td>
            <td align="center" width="150px" height="150px" bgcolor="green"><a href="#">6</a></td>
          </tr>
        </table>
      </div>
    </div>

  </body>
</html>