<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/plugin/css/bootstrap.3.3.7.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/plugin/css/bootstrap-theme.css" rel="stylesheet">
<!-- boostraptable -->
<link href="${pageContext.request.contextPath}/plugin/css/bootstrap-table.css" rel="stylesheet">
</head>
<body>
<table id="table"></table>

    
<script type="text/javascript" src="${pageContext.request.contextPath}/plugin/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plugin/js/bootstrap3.3.7.min.js"></script>
<!-- boostraptable -->
<script type="text/javascript" src="${pageContext.request.contextPath}/plugin/js/bootstrap-table.js"></script>

<!-- 导出excel、pdf文件 -->
<script type="text/javascript" src="${pageContext.request.contextPath}/plugin/js/export/bootstrap-table-export.js"></script>
<script src="${pageContext.request.contextPath}/plugin/js/tableExport/libs/pdfmake/pdfmake.min.js"></script>
<script src="${pageContext.request.contextPath}/plugin/js/tableExport/libs/pdfmake/vfs_fonts.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plugin/js/tableExport/libs/FileSaver/FileSaver.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plugin/js/tableExport/libs/jsPDF/jspdf.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plugin/js/tableExport/libs/jsPDF-AutoTable/jspdf.plugin.autotable.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plugin/js/tableExport/tableExport.js"></script>
  
<script type="text/javascript">
$(function(){//jquery的加载事件
	$('#table').bootstrapTable({
		  url: 'data1.json',//访问后台（json）的地址
		  pagination: true,//允许分页
		  search: true,//可以搜索
		  pageSize:3,//每页显示3条数据
		  pageList:[2,3,5,8,10],//每页显示的条数列表
		  showColumns:true,//选择显示的列
		  showRefresh:true,//允许刷新
		  showExport:true,//允许导出
		  exportDataType:'all',
		  exportTypes:['txt','doc','excel'],
		  columns: [{
		    field: 'id',
		    title: 'Item ID'
		  }, {
		    field: 'name',
		    title: 'Item Name'
		  }, {
		    field: 'price',
		    title: 'Item Price'
		  }]
		})
})
</script>  
    
</body>
</html>