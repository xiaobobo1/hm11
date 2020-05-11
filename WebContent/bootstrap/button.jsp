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
<!-- Standard button -->
<button type="button" class="btn btn-default">（默认样式）Default</button>

<!-- Provides extra visual weight and identifies the primary action in a set of buttons -->
<button type="button" class="btn btn-primary">（首选项）Primary</button>

<button type="button" class="btn btn-success">（成功）Success</button>


<select class="form-control  input-sm">
   <option value="男">男</option>
   <option value="女">女</option>
</select>

</body>
</html>