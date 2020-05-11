<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<input type="text" id="test1">
<script src="${pageContext.request.contextPath}/plugin/layDate-v5.0.9/laydate/laydate.js"></script>
<script>
//执行一个laydate实例
laydate.render({
  elem: '#test1' //指定元素
});
</script>
</body>
</html>