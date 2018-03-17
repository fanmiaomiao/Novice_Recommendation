<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>管理员登录</title>
</head>
<body>
<form id="form1" name="form1" method="post" action="${pageContext.request.contextPath }/manager_login.action">
  <label>管理员姓名：
  <input type="text" name="managerName" />
  </label>
  <p>
    <label>管理员密码：
    <input type="text" name="managerPwd" />
    </label>
  </p>
  <p>
    <label>
    <input type="submit" name="Submit" value="提交" />
    </label>
  </p>
</form>
</body>
</html>