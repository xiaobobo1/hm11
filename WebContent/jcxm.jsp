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
		  url: '${pageContext.request.contextPath}/queryJcxm.do',//访问后台（json）的地址
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
			    field: 'mzblid',//字段名称    对应json中的key
			    title: '门诊病历id'
			  }, {
			    field: 'jcys',
			    title: '检查医师'
			  }, {
				    field: 'jcnr',
				    title: '检查内容'
			  }, {
				    field: 'jcfx',
				    title: '检查分析'
			   },
			   {
				    field: 'jxjg',
				    title: '检查结果'
			  }, {
				    field: 'jcfy',
				    title: '检查费用'
			   },{
				  title:'操作',
				  formatter:function(value,row,index){
					  var updateButton = "<button onclick=\"myUpdateClick("+row.mzblid+")\" type=\"button\" class=\"btn btn-success\">修改</button>";
					  var deleteButton = "<button onclick=\"myDeleteClick("+row.mzblid+")\" type=\"button\" class=\"btn btn-success\">删除</button>";
					  var addButton = "<button onclick=\"myAddClick("+row.mzblid+")\" type=\"button\" class=\"btn btn-info\">添加门诊检查</button>";
					  return updateButton+deleteButton+addButton;
				  }
			  }]
		})
		
		
	
})

<!--修改-->
function myUpdateClick(mzblid){
	
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/updateJcxm.do",//根据编号查询用户的信息
		 data:{mzblid:mzblid},//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			 //data：指后台查询后返回来的用户信息
			     $('#myUpdateModal').modal().on('shown.bs.modal',
					    function() {
			    	     
			    	 //给用户名输入框赋初始值
			    	 
			    	 //给隐藏框赋值
			    	 $("#myUpdateMzblid").val(data.mzblid);
			    	 $("#inputjcys").val(data.jcys);
			    	 $("#inputjcnr").val(data.jcnr);
			    	 $("#inputjcfx").val(data.jcfx);
			    	 $("#inputjxjg").val(data.jxjg);
			    	 $("#inputjcfy").val(data.jcys);

			     
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
function myDeleteClick(mzblid){
	
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/deleteJcxm.do",//根据编号查询用户的信息
		 data:{mzblid:mzblid},//传参数到后台
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
function updateJcxm(){
	
	//获取表单中的所有值
	var data = $("#myUpdateForm").serializeArray();
	
	$.ajax({
		type:'post',//提交方式
		url:'${pageContext.request.contextPath}/saveUpdateJcxm.do',//修改的地址
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
function addJcxm(){
	var data = $("#myAddForm").serializeArray();

	$.ajax({
		type:'post',//提交方式
		url:'${pageContext.request.contextPath}/saveAddJcxm.do',//添加的地址
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
                  
                  <input type="hidden" name="mzblid" id="myUpdateMzblid">
                          
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">检查医师:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="jcys" class="form-control" id="inputjcys" placeholder="请输入检查医师">
						    </div>
						  </div>
						   <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">检查内容:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="jcnr" class="form-control" id="inputjcnr" placeholder="请输入检查内容">
						    </div>
						  </div>
						   <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">检查分析:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="jcfx" class="form-control" id="inputjcfx" placeholder="请输入检查分析">
						    </div>
						  </div>
						   <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">检查结果:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="jxjg" class="form-control" id="inputjxjg" placeholder="请输入检查结果">
						    </div>
						  </div>
						   <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">检查费用:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="jcfy" class="form-control" id="inputjcfy" placeholder="请输入检查费用">
						    </div>
						  </div>
						 
						 	  
						  
                  </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="updateJcxm()" type="button" class="btn btn-primary" data-dismiss="modal">保存</button>
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
						    <label for="inputEmail3" class="col-sm-2 control-label">门诊病历id:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="mzblid" class="form-control" id="inputmzblid" placeholder="请输入门诊病历id">
						    </div>
				  </div>
				   <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">检查医师:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="jcys" class="form-control" id="inputjcys" placeholder="请输入检查医师">
						    </div>
						  </div>
						   <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">检查内容:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="jcnr" class="form-control" id="inputjcnr" placeholder="请输入检查内容">
						    </div>
						  </div>
						   <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">检查分析:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="jcfx" class="form-control" id="inputjcfx" placeholder="请输入检查分析">
						    </div>
						  </div>
						   <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">检查结果:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="jxjg" class="form-control" id="inputjxjg" placeholder="请输入检查结果">
						    </div>
						  </div>
						   <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">检查费用:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="jcfy" class="form-control" id="inputjcfy" placeholder="请输入检查费用">
						    </div>
						  </div>
                  </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="addJcxm()" type="button" class="btn btn-primary" data-dismiss="modal">保存</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
</body>
</html>