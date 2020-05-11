<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="${pageContext.request.contextPath}/plugin/kindeditor/themes/default/default.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/plugin/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/plugin/kindeditor/kindeditor.js"></script>
<script src="${pageContext.request.contextPath}/plugin/kindeditor/lang/zh_CN.js"></script>
<script type="text/javascript">
$(function(){//jquery加载
	//text():取文本的内容    text("sf");//赋值
	//html():取html网页的代码     html("<img src='a' width='50'>")
	//val():获取表单中的值      val("0");//赋值
	//attr("img"):取属性img的值      attr("a","b");//给a属性赋值为b
	KindEditor.ready(function(K) {
		var editor = K.editor({
			allowFileManager : true
		});
		K('#myPhotoButton').click(function() {
			editor.loadPlugin('image', function() {
				editor.plugin.imageDialog({
					imageUrl : K('#photoImage').val(),//取值
					clickFn : function(url, title, width, height, border, align) {
						K('#photoImage').val(url);
						alert(url);
						editor.hideDialog();
					}
				});
			});
		});
	})
})
</script>
</head>
<body>

<p><input type="text" id="photoImage" value="" /> 
<input type="button" id="myPhotoButton" value="选择图片" />（网络图片 + 本地上传）</p>


</body>
</html>