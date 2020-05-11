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
<body background="images/333.jpg">
<table id="table"></table>


<script type="text/javascript">
$(function(){//jquery的加载事件
	$('#table').bootstrapTable({
		  url: '${pageContext.request.contextPath}/queryDepartment.do',//访问后台（json）的地址
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
		    field: 'deptId',//字段名称    对应json中的key
		    title: '科室编号'
		  }, {
		    field: 'deptName',
		    title: '科室名称'
		  }, {
			    field: 'deptAddress',
			    title: '科室位置'
		  }, {
			    field: 'deptPhone',
			    title: '科室电话`'
		   },
		   {
				  field: 'user.userName',
				  title:'科室负责人名称'
		   },
		   {
			    field: 'isDelete',
			    title: '是否删除'
		   },{
				  title:'操作',
				  formatter:function(value,row,index){
					  var updateButton = "<button onclick=\"myUpdateClick("+row.deptId+")\" type=\"button\" class=\"btn btn-success\">修改</button>";
					  var deleteButton = "<button onclick=\"myDeleteClick("+row.deptId+")\" type=\"button\" class=\"btn btn-success\">删除</button>";
					  var addButton = "<button onclick=\"myAddClick("+row.deptId+")\" type=\"button\" class=\"btn btn-info\">添加科室</button>";
					  return updateButton+deleteButton+addButton;
				  }
			  }]
		})
		//下拉列表动态读取数据(update)
		$.ajax({
			type:'post',//提交方式
			url:'${pageContext.request.contextPath}/user/query.do',//访问后台的地址   查询所有的用户信息
			async:false,//  true：异步     false:同步
			dataType: "json",//数据类型
			success: function(data){
				//回调函数
				//给下拉列表赋值  <select id="myUpdateDepartment">   <option="管理员">管理员</option>
				if(data != null){
					var optionhtml = '';//定义一个字符串变量
					
					for(var i=0;i<data.length;i++){
						optionhtml +='<option value="'+data[i].userId+'">'+data[i].userName+'</option>';
					}
					
					//给下拉列表赋值  text()、val()、html()、attr()等
					$("#myUpdateUser").html(optionhtml);
				}
				
				
			}
			
		})
			//下拉列表动态读取数据(add)
		$.ajax({
			type:'post',//提交方式
			url:'${pageContext.request.contextPath}/user/query.do',//访问后台的地址   查询所有的岗位信息
			async:false,//  true：异步     false:同步
			dataType: "json",//数据类型
			success: function(data){
				//回调函数
				//给下拉列表赋值  <select id="myUpdateDepartment">   <option="管理员">管理员</option>
				if(data != null){
					var optionhtml = '';//定义一个字符串变量
					
					for(var i=0;i<data.length;i++){
						optionhtml +='<option value="'+data[i].userId+'">'+data[i].userName+'</option>';
					}
					
					//给下拉列表赋值  text()、val()、html()、attr()等
					$("#myAddUser").html(optionhtml);
				}
				
				
			}
			
		})
		
})

<!--修改-->
function myUpdateClick(deptId){
	
	$.ajax({
		 type:"post",//请求方式
		 url:'${pageContext.request.contextPath}/updateDepartment.do',//根据编号查询用户的信息
		 data:{deptId:deptId},//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			 //data：指后台查询后返回来的用户信息
			     $('#myUpdateModal').modal().on('shown.bs.modal',
					    function() {
			    	     
			    	 //给用户名输入框赋初始值
			    	 
			    	 //给隐藏框赋值
			    	 $("#myUpdatedeptId").val(data.deptId);
			    	 
			    	 $("#inputdeptName").val(data.deptName);
			    	 $("#inputdeptAddress").val(data.deptAddress);
			    	 $("#inputdeptPhone").val(data.deptPhone);
			    	 $("#inputisDelete").val(data.isDelete);
			    	 
			    	 
			    	 
			    	 //给下拉列表赋初始值
			    	 $("#myUpdateUser").val(data.userId);
			     
			     })
		 }
	})
}
//保存修改事件
function updateDepartment(){
	
	//获取表单中的所有值
	var data = $("#myUpdateForm").serializeArray();
	
	$.ajax({
		type:'post',//提交方式
		url:'${pageContext.request.contextPath}/saveUpdateDepartment.do',//修改的地址
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
//删除事件
function myDeleteClick(deptId){
	
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/deleteDepartment.do",//根据编号查询用户的信息
		 data:{deptId:deptId},//传参数到后台
		 dataType:"json",//以json格式传递数据
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
	//添加事件
function myAddClick(){

		$('#myAddModal').modal().on('shown.bs.modal',
					 function(){
				 $("#myAddForm")[0].reset();
			 })
}
	/* 添加信息提交事件 */
	function addDepartment(){
		var data = $("#myAddForm").serializeArray();

		$.ajax({
			type:'post',//提交方式
			url:'${pageContext.request.contextPath}/saveAddDepartment.do',//修改的地址
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
                  
                  <input type="hidden" name="deptId" id="myUpdateDeptId">
                  
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">科室名称:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="deptName" class="form-control" id="inputdeptName" placeholder="请输入科室名称">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputPassword3" class="col-sm-2 control-label">科室位置:</label>
						    <div class="col-sm-10">
						      <input type="text" name="deptAddress" class="form-control" id="inputdeptAddress" placeholder="请输入科室位置">
						    </div>
						  </div>	
						   <div class="form-group">
						    <label for="inputPassword3" class="col-sm-2 control-label">科室电话:</label>
						    <div class="col-sm-10">
						      <input type="text" name="deptPhone" class="form-control" id="inputdeptPhone" placeholder="请输入科室电话">
						    </div>
						  </div>  
						     <div class="form-group">
						    <label for="inputPassword3" class="col-sm-2 control-label">是否删除:</label>
						    <div class="col-sm-10">
						      <input type="text" name="isDelete" class="form-control" id="inputisDelete" placeholder="是否删除？">
						    </div>
						  </div> 
						  <div class="form-group">
						    <label for="inputPassword3" class="col-sm-2 control-label">科室负责人名称:</label>
						    <div class="col-sm-10">
						       <select id="myUpdateUser" name="userId">
						       
						       </select>
						    </div>
						  </div>
                  </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="updateDepartment()" type="button" class="btn btn-primary"data-dismiss="modal">保存</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<!-- 添加模态框 -->
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
						    <label for="inputEmail3" class="col-sm-2 control-label">科室id:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="deptId" class="form-control" id="inputdeptId" placeholder="请输入id">
						    </div>
						  </div>
                  
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">科室名称:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="deptName" class="form-control" id="inputdeptName" placeholder="请输入科室名称">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputPassword3" class="col-sm-2 control-label">科室位置:</label>
						    <div class="col-sm-10">
						      <input type="text" name="deptAddress" class="form-control" id="inputdeptAddress" placeholder="请输入科室位置">
						    </div>
						  </div>	
						   <div class="form-group">
						    <label for="inputPassword3" class="col-sm-2 control-label">科室电话:</label>
						    <div class="col-sm-10">
						      <input type="text" name="deptPhone" class="form-control" id="inputdeptPhone" placeholder="请输入科室电话">
						    </div>
						  </div>  
						  <div class="form-group">
						    <label for="inputPassword3" class="col-sm-2 control-label">是否删除:</label>
						    <div class="col-sm-10">
						      <input type="text" name="isDelete" class="form-control" id="inputisDelete" placeholder="是否删除？">
						    </div>
						  </div> 
						  <div class="form-group">
						    <label for="inputPassword3" class="col-sm-2 control-label">科室负责人名称:</label>
						    <div class="col-sm-10">
						       <select id="myAddUser" name="userId">
						       
						       </select>
						    </div>
						  </div>
                  </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="addDepartment()" type="button" class="btn btn-primary"data-dismiss="modal">提交</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
</body>
</html>