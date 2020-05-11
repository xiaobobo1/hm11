<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="common/commoncss.jsp" %>
<%@ include file="common/commonjs.jsp" %>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body background="images/222.jpg">

<table id="table"></table>

    
<script type="text/javascript">
$(function(){//jquery的加载事件
	$('#table').bootstrapTable({
		  url: '${pageContext.request.contextPath}/querySupplier.do',//访问后台（json）的地址
		  pagination: true,//允许分页
		  search: true,//可以搜索
		  pageSize:7,//每页显示3条数据
		  pageList:[5,8,10],//每页显示的条数列表
		  showColumns:true,//选择显示的列
		  showRefresh:true,//允许刷新
		  showExport:true,//允许导出
		  exportDataType:'all',
		  exportTypes:['txt','doc','excel'],
		  columns: [{
			    field: 'sId',//字段名称    对应json中的key
			    title: '供应商号'
			  }, {
			    field: 'sName',
			    title: '供应商名称'
			  }, {
				    field: 'sAddress',
				    title: '供货地址'
			  }, {
				    field: 'sTel',
				    title: '电话'
			   },{
					  field:'sSituation',
					  title:'信贷状况'
			   },
			   {
					  field:'sIsdelete',
					  title:'是否删除'
			   },{
				  title:'操作',
				  formatter:function(value,row,index){
					  var updateButton = "<button onclick=\"myUpdateClick("+row.sId+")\" type=\"button\" class=\"btn btn-success\">修改</button>";
					  var deleteButton = "<button onclick=\"myDeleteClick("+row.sId+")\" type=\"button\" class=\"btn btn-success\">删除</button>";
					  var addButton = "<button onclick=\"myAddClick("+row.sId+")\" type=\"button\" class=\"btn btn-info\">添加用户</button>";
					  return updateButton+deleteButton+addButton;
				  }
			  }]
		})
		
		
	
})

<!--修改-->
function myUpdateClick(sId){
	
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/updateSupplier.do",//根据编号查询用户的信息
		 data:{sId:sId},//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			 //data：指后台查询后返回来的用户信息
			     $('#myUpdateModal').modal().on('shown.bs.modal',
					    function() {
			    	     
			    	 //给用户名输入框赋初始值
			    	 
			    	 //给隐藏框赋值
			    	 $("#myUpdateSId").val(data.sId);
			    	 $("#inputsName").val(data.sName);
			    	 $("#inputsAddress").val(data.sAddress);
			    	 $("#inputsTel").val(data.sTel);
			    	 $("#inputsSituation").val(data.sSituation);
			    	 $("#inputsIsdelete").val(data.sIsdelete);
			    
			     
			     })
		 }
	})
}
//添加事件
function myAddClick(){
	

		$('#myAddModal').modal().on('shown.bs.modal',
					 function(){
				 $("#myAddForm")[0].reset();
			 })
	
	
}
//删除事件
function myDeleteClick(sId){
	
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/deleteSupplier.do",//根据编号查询用户的信息
		 data:{sId:sId},//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			 //data：指后台查询后返回来的用户信息
			    if(data==1){
			    	$("#table").bootstrapTable("refresh");
			    	alert("删除成功");
			    }
			    else{
			    	alert("删除失败");
			    	
			    };
		 }
	})
}
//保存修改事件
function updateSupplier(){
	
	//获取表单中的所有值
	var data = $("#myUpdateForm").serializeArray();
	
	$.ajax({
		type:'post',//提交方式
		url:'${pageContext.request.contextPath}/saveUpdateSupplier.do',//修改的地址
		data:data,
		dataType:'json',
		success:function(data){
			if(data == 1){
				
				//刷新表格
				 $("#table").bootstrapTable("refresh");
				alert("修改成功");
			}else{
				//修改失败  提示信息
				alert("修改失败");
			}
		}
		
	})
}
/* 添加信息提交事件 */
function addSupplier(){
	var data = $("#myAddForm").serializeArray();

	$.ajax({
		type:'post',//提交方式
		url:'${pageContext.request.contextPath}/saveAddSupplier.do',//添加的地址
		data:data,
		dataType:'json',
		success:function(data){
			if(data == 1){
				
				//刷新表格
				 $("#table").bootstrapTable("refresh");
				alert("提交成功");
			}else{
				//修改失败  提示信息
				alert("提交失败");
			}
		}
		
	})
}
</script>
<!-- 修改模态框（Modal） -->
<div class="modal fade" id="myUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">修改</h4>
            </div>
            <div class="modal-body">
                  <form id="myUpdateForm" class="form-horizontal">
                  
                  <input type="hidden" name="sId" id="myUpdateSId">
                          
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">供应商名称:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="sName" class="form-control" id="inputsName" placeholder="请输入供应商名称">
						    </div>
						  </div>
						   <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">地址:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="sAddress" class="form-control" id="inputsAddress" placeholder="请输入地址">
						    </div>
						  </div>
						   <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">电话:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="sTel" class="form-control" id="inputsTel" placeholder="请输入电话">
						    </div>
						  </div>
						   <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">信贷状况:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="sSituation" class="form-control" id="inputsSituation" placeholder="信贷状况">
						    </div>
						  </div>
						   <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">是/否:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="sIsdelete" class="form-control" id="inputsIsdelete" placeholder="是否删除">
						    </div>
						  </div>
						 
						 	  
						  
                  </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="updateSupplier()" type="button" class="btn btn-primary" data-dismiss="modal">保存</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<!-- 添加模态框（Modal） -->
<div class="modal fade" id="myAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">添加</h4>
            </div>
            <div class="modal-body">
                  <form id="myAddForm" class="form-horizontal">
                  
                   <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">供货商号:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="sId" class="form-control" id="inputsId" placeholder="请输入供货商号">
						    </div>
				  </div>
				  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">供应商名称:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="sName" class="form-control" id="inputsName" placeholder="请输入供应商名称">
						    </div>
						  </div>
						   <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">地址:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="sAddress" class="form-control" id="inputsAddress" placeholder="请输入地址">
						    </div>
						  </div>
						   <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">电话:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="sTel" class="form-control" id="inputsTel" placeholder="请输入电话">
						    </div>
						  </div>
						   <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">信贷状况:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="sSituation" class="form-control" id="inputsSituation" placeholder="信贷状况">
						    </div>
						  </div>
						   <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">是否删除:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="sIsdelete" class="form-control" id="inputsIsdelete" placeholder="是否删除">
						    </div>
						  </div>
     
                  </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="addSupplier()" type="button" class="btn btn-primary" data-dismiss="modal">保存</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
</body>
</html>