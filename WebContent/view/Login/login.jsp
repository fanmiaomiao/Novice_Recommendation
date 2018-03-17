<!DOCTYPE html>
<html lang="en-us">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="icon" href="${pageContext.request.contextPath }/favicon.ico" />
        <link href="${pageContext.request.contextPath }/lib/css/bootstrap.min.css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath }/lib/css/font-awesome.min.css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath }/view/Login/login.css" rel="stylesheet" />
        <script src="${pageContext.request.contextPath }/lib/js/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath }/lib/js/bootstrap/bootstrap.min.js"></script>
        <!--[if lt IE 9]>
        <script src="js/bootstrap/html5shiv.min.js"></script>
        <script src="js/bootstrap/respond.min.js"></script>
        <![endif]-->
        <!--页面加载进度条-->
        <script src="${pageContext.request.contextPath }/lib/js/pace/pace.min.js"></script>
        <script src="${pageContext.request.contextPath }/lib/js/jquery.scrolltopcontrol/scrolltopcontrol.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/lib/js/jquery.extend.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/js/default.js" type="text/javascript"></script>
    </head>
    <body>
        <div class="container">
            <div class="logo">
                <span style="color: skyblue;font-size: 30px;">智慧城市</span>
                <img src="${pageContext.request.contextPath }/image/logo-front.png">
            </div>
            <form class="form-signin" method="post" action="${pageContext.request.contextPath }/manager_login.action">
                <h2 class="form-signin-heading">Login to your account</h2>
                <label for="inputEmail" class="sr-only">User Id </label>
                <input name="managerName" id="inputuserid" class="form-control" placeholder="User Id" required autofocus>
                <div class="blank"></div>
                <label for="inputPassword" class="sr-only">Password</label>
                <input type="password" id="inputPassword" name="managerPwd" class="form-control" placeholder="Password" required>
                <div class="checkbox">
                    <label style="font-size:16px;">
                        <input type="checkbox" value="remember-me" name="remember me"> Remember me
                    </label>
                </div>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
            </form>
            </div> <!-- /container -->
        </body>
    </html>