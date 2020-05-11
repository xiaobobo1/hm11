<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/plugin/css/bootstrap.3.3.7.css" >
<link rel="stylesheet" href="${pageContext.request.contextPath}/plugin/css/bootstrap-theme.css" >

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="${pageContext.request.contextPath}/plugin/js/jquery.min.js" ></script>
<script src="${pageContext.request.contextPath}/plugin/js/bootstrap3.3.7.min.js" ></script>


</head>
<body>
<form class="form-inline">
  <div class="form-group">
    <label class="sr-only" for="exampleInputEmail3">邮箱地址:</label>
    <input type="email" class="form-control" id="exampleInputEmail3" placeholder="Email">
  </div>
  <div class="form-group">
    <label class="sr-only" for="exampleInputPassword3">密码:</label>
    <input type="password" class="form-control" id="exampleInputPassword3" placeholder="Password">
  </div>
  <div class="checkbox">
    <label>
      <input type="checkbox">记住我
    </label>
  </div>
  <button type="submit" class="btn btn-default">Sign in</button>
</form>
</body>
</html>