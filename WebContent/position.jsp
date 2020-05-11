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
		  url: '${pageContext.request.contextPath}/queryPosition.do',//访问后台（json）的地址
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
		    field: 'poId',//字段名称    对应json中的key
		    title: '职位编号'
		  }, {
		    field: 'poName',
		    title: '职位名称'
		  }, {
			    field: 'deptId',
			    title: '部门编号'
		  }, {
			    field: 'poSalary',
			    title: '薪水'
		   },{
				  field:'department.deptName',
				  title:'部门名称'
		   },{
				  title:'操作',
				  formatter:function(value,row,index){
					  var updateButton = "<button onclick=\"myUpdateClick("+row.poId+")\" type=\"button\" class=\"btn btn-success\">修改</button>";
					  var deleteButton = "<button onclick=\"myDeleteClick("+row.poId+")\" type=\"button\" class=\"btn btn-success\">删除</button>";
					  var addButton = "<button onclick=\"myAddClick("+row.poId+")\" type=\"button\" class=\"btn btn-info\">添加用户</button>";
					  return updateButton+deleteButton+addButton;
				  }
			  }]
		})
		//下拉列表动态读取数据
		 $.ajax({
			type:'post',//提交方式
			url:'${pageContext.request.contextPath}/queryDepartment.do',//访问后台的地址   查询所有的岗位信息
			async:false,//  true：异步     false:同步
			dataType: "json",//数据类型
			success: function(data){
				//回调函数
				//给下拉列表赋值  <select id="myUpdateDepartment">   <option="管理员">管理员</option>
				if(data != null){
					var optionhtml = '';//定义一个字符串变量
					
					for(var i=0;i<data.length;i++){
						optionhtml +='<option value="'+data[i].deptId+'">'+data[i].deptId+'</option>';
					}
					
					//给下拉列表赋值  text()、val()、html()、attr()等
					$("#myUpdateDepartment").html(optionhtml);
				}
				
				
			}
			
		})
		
		//下拉列表动态读取数据
		 $.ajax({
			type:'post',//提交方式
			url:'${pageContext.request.contextPath}/queryDepartment.do',//访问后台的地址   查询所有的岗位信息
			async:false,//  true：异步     false:同步
			dataType: "json",//数据类型
			success: function(data){
				//回调函数
				//给下拉列表赋值  <select id="myUpdateDepartment">   <option="管理员">管理员</option>
				if(data != null){
					var optionhtml = '';//定义一个字符串变量
					
					for(var i=0;i<data.length;i++){
						optionhtml +='<option value="'+data[i].deptId+'">'+data[i].deptId+'</option>';
					}
					
					//给下拉列表赋值  text()、val()、html()、attr()等
					$("#myUpdateDepartment1").html(optionhtml);
				}
				
				
			}
			
		})
})

<!--修改-->
function myUpdateClick(poId){
	
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/updatePosition.do",//根据编号查询用户的信息
		 data:{poId:poId},//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			 //data：指后台查询后返回来的用户信息
			     $('#myUpdateModal').modal().on('shown.bs.modal',
					    function() {
			    	     
			    	 //给用户名输入框赋初始值
			    	 
			    	 //给隐藏框赋值
			    	 $("#myUpdatePoId").val(data.poId);
			    	 
			    	 $("#inputpoName").val(data.poName);
			    	 $("#inputpoSalary").val(data.poSalary);
			    
			    	 //给下拉列表赋初始值
			    	 $("#myUpdateDepartment").val(data.deptId);
			     
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
function myDeleteClick(poId){
	
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/deletePosition.do",//根据编号查询用户的信息
		 data:{poId:poId},//传参数到后台
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
function updatePosition(){
	
	//获取表单中的所有值
	var data = $("#myUpdateForm").serializeArray();
	
	$.ajax({
		type:'post',//提交方式
		url:'${pageContext.request.contextPath}/saveUpdatePosition.do',//修改的地址
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
function addPosition(){
	var data = $("#myAddForm").serializeArray();
	$.ajax({
		type:'post',//提交方式
		url:'${pageContext.request.contextPath}/saveAddPosition.do',//修改的地址
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
                  
                  <input type="hidden" name="poId" id="myUpdatePoId">
                          
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">职位名称:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="poName" class="form-control" id="inputpoName" placeholder="请输入职位名称">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputPassword3" class="col-sm-2 control-label">薪水:</label>
						    <div class="col-sm-10">
						      <input type="text" name="poSalary" class="form-control" id="inputpoSalary" placeholder="请输入薪水">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputPassword3" class="col-sm-2 control-label">部门编号:</label>
						    <div class="col-sm-10">
						       <select id="myUpdateDepartment" name="deptId">
						       
						       </select>
						    </div>
						  </div>	  
						  
                  </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="updatePosition()" type="button" class="btn btn-primary" data-dismiss="modal">保存</button>
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
						    <label for="inputEmail3" class="col-sm-2 control-label">职位id:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="poId" class="form-control" id="inputpoId" placeholder="请输入职位id">
						    </div>
						  </div>
                          
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">职位名称:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="poName" class="form-control" id="inputpoName" placeholder="请输入职位名称">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputPassword3" class="col-sm-2 control-label">薪水:</label>
						    <div class="col-sm-10">
						      <input type="text" name="poSalary" class="form-control" id="inputpoSalary" placeholder="请输入薪水">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputPassword3" class="col-sm-2 control-label">部门编号:</label>
						    <div class="col-sm-10">
						       <select id="myUpdateDepartment1" name="deptId">
						       
						       </select>
						    </div>
						  </div>	  
						  
                  </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="addPosition()" type="button" class="btn btn-primary" data-dismiss="modal">保存</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
</body>
</html>