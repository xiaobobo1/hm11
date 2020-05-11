<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<%@ include file="common/commoncss.jsp" %>
<%@ include file="common/commonjs.jsp" %>

</head>
<body background="images/111.jpg">
<button onclick="myAddClick()" type="button" class="btn btn-info">添加信息</button>
<table id="table"></table>

    
<script type="text/javascript">
$(function(){//jquery的加载事件
	$('#table').bootstrapTable({
		  url: '${pageContext.request.contextPath}/user/query.do',//访问后台（json）的地址
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
		    field: 'userId',//字段名称    对应json中的key
		    title: '编号'
		  }, {
		    field: 'userName',
		    title: '用户名'
		  },{
			    field: 'userPwd',
			    title: '密码'
			  },{
		    field: 'userPhoto',
		    title: '头像',
		    formatter:function(value,row,index){
		    	//value:值   row：行      index:索引  \  \"相当于'
		    	//var imageUrl = '<img onclick="myPhotoClick(2)" alt="" src="/imgeurl/'+row.userPhoto+'" width="50" height="50">';
		    	var imageUrl="<img onclick=\"myPhotoClick('/imgeurl/"+row.userPhoto+"')\" alt=\"\" src=\"/imgeurl/"+row.userPhoto+"\" width=\"50\" height=\"50\">";
		    	return imageUrl;
		    }
		  }, {
			    field: 'userSex',
			    title: '性别'
		  }, {
			    field: 'userBirthday',
			    title: '生日日期'
			  },{
				  field:'userCard',
				  title:'身份证'
			  },{
				  field:'hyzk',
				  title:'婚姻状况'
			  },{
				  field:'position.poName',
				  title:'岗位'
			  },{
				  field:'position.department.deptName',
				  title:'科室名称'
			  },{
				  title:'操作',
				  formatter:function(value,row,index){
					  var updateButton = "<button onclick=\"myUpdateClick("+row.userId+")\" type=\"button\" class=\"btn btn-success\">修改</button>";
					  var deleteButton = "<button onclick=\"myDeleteClick("+row.userId+")\" type=\"button\" class=\"btn btn-success\">删除</button>";
					  return updateButton+deleteButton;
				  }
			  }]
		})
		
		//下拉列表动态读取数据
		$.ajax({
			type:'post',//提交方式
			url:'${pageContext.request.contextPath}/queryPosition.do',//访问后台的地址   查询所有的岗位信息
			async:false,//  true：异步     false:同步
			dataType: "json",//数据类型
			success: function(data){
				//回调函数
				//给下拉列表赋值  <select id="myUpdatePosition">   <option="管理员">管理员</option>
				if(data != null){
					var optionhtml = '';//定义一个字符串变量
					
					for(var i=0;i<data.length;i++){
						optionhtml +='<option value="'+data[i].poId+'">'+data[i].poName+'</option>';
					}
					
					//给下拉列表赋值  text()、val()、html()、attr()等
					$("#myUpdatePosition").html(optionhtml);
				}
				
				
			}
			
		})
		$.ajax({
			type:'post',//提交方式
			url:'${pageContext.request.contextPath}/queryPosition.do',//访问后台的地址   查询所有的岗位信息
			async:false,//  true：异步     false:同步
			dataType: "json",//数据类型
			success: function(data){
				//回调函数
				//给下拉列表赋值  <select id="myUpdatePosition">   <option="管理员">管理员</option>
				if(data != null){
					var optionhtml = '';//定义一个字符串变量
					
					for(var i=0;i<data.length;i++){
						optionhtml +='<option value="'+data[i].poId+'">'+data[i].poName+'</option>';
					}
					
					//给下拉列表赋值  text()、val()、html()、attr()等
					$("#myAddPosition1").html(optionhtml);
				}
				
				
			}
			
		})
})

function myPhotoClick(photoValue){
		
	    $('#myModal').modal().on('shown.bs.modal',
	    function() {
	         $("#myDialogImage").attr("src",photoValue);
	    })
}

<!--修改-->
function myUpdateClick(userId){
	
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/updateUser.do",//根据编号查询用户的信息
		 data:{uid:userId},//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			 //data：指后台查询后返回来的用户信息
			     $('#myUpdateModal').modal().on('shown.bs.modal',
					    function() {
			    	     
			    	 //给用户名输入框赋初始值
			    	 
			    	 //给隐藏框赋值
			    	 $("#myUpdateUserId").val(data.userId);
			    	 
			    	 $("#inputuserName").val(data.userName);
			    	 $("#inputuserPwd").val(data.userPwd);
			    	 $("#inputuserSex").val(data.userSex);
			    	 $("#inputuserBirthday").val(data.userBirthday);
			    	 $("#inputuserCard").val(data.userCard);
			    	 $("#inputhyzk").val(data.hyzk);
			    	 //给隐藏框赋值（以便于传值到后台）
			    	 $("#photoImage").val(data.userPhoto);
			    	 //给图片控件赋值
			    	 $("#myUpdateImage").attr("src","/imgeurl/"+data.userPhoto);
			    	 
			    	 //给下拉列表赋初始值
			    	 $("#myUpdatePosition").val(data.poId);
			     
			     })
		 }
	})
}

//保存修改事件
function updateUser(){
	
	//获取表单中的所有值
	var data = $("#myUpdateForm").serializeArray();
	
	$.ajax({
		type:'post',//提交方式
		url:'${pageContext.request.contextPath}/saveUpdateUser.do',//修改的地址
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
function myDeleteClick(userId){
	
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/deleteUser.do",//根据编号查询用户的信息
		 data:{uid:userId},//传参数到后台
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
//添加事件
function myAddClick(){
	

		$('#myAddModal').modal().on('shown.bs.modal',
					 function(){
				 $("#myAddForm")[0].reset();
			 })
	
	
}
/* 添加信息提交事件 */
function addUser(){
	var data = $("#myAddForm").serializeArray();
	$.ajax({
		type:'post',//提交方式
		url:'${pageContext.request.contextPath}/saveAddUser.do',//修改的地址
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
<!-- 修改模态框-->
<div class="modal fade" id="myUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">修改</h4>
            </div>
            <div class="modal-body">
                  <form id="myUpdateForm" class="form-horizontal">
                  
                  <input type="hidden" name="userId" id="myUpdateUserId">
                  
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">用户名:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="userName" class="form-control" id="inputuserName" placeholder="请输入用户名">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputPassword3" class="col-sm-2 control-label">密码:</label>
						    <div class="col-sm-10">
						      <input type="password"  name="userPwd" class="form-control" id="inputuserPwd" placeholder="请输入密码">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">出生日期:</label>
						    <div class="col-sm-10">
						     <input type="text" id="inputuserBirthday" name="userBirthdays">
								<script src="${pageContext.request.contextPath}/plugin/layDate-v5.0.9/laydate/laydate.js"></script> <!-- 改成你的路径 -->
								<script>
								//执行一个laydate实例
								laydate.render({
								  elem: '#inputuserBirthday' //指定元素
								});
								</script>
						      
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputPassword3" class="col-sm-2 control-label">头像:</label>
						    <div class="col-sm-10">
						      <input name="userPhoto" type="hidden" id="photoImage" value="" /> 
						      <img id="myUpdateImage" alt="" src="" width="100" height="100">
						      <input type="button" id="myPhotoButton" value="选择头像" />
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">性别:</label>
						    <div class="col-sm-10">
						      
						      <select id="inputuserSex" name="userSex">
                                    <option value="男">男</option>  
                                    <option value="女">女</option>   						      
						      </select>
						      
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">身份证号：</label>
						    <div class="col-sm-10">
						      <input type="text"  name="userCard" class="form-control" id="inputuserCard" placeholder="请输入身份证号">
						    </div>
						  </div>
						  	   <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">婚姻状况:</label>
						  <div class="col-sm-10">
						      
						      <select id="inputhyzk" name="hyzk">
                                    <option value="已婚">已婚</option>  
                                    <option value="未婚">未婚</option>   
                                    <option value="离异">离异</option> 
                                    <option value="其他">其他</option> 						      
						      </select>
						      
						    </div>
						    </div>
						  <div class="form-group">
						    <label for="inputPassword3" class="col-sm-2 control-label">岗位名称:</label>
						    <div class="col-sm-10">
						       <select id="myUpdatePosition" name="poId">
						       
						       </select>
						    </div>
						  </div>
                  </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="updateUser()" type="button" class="btn btn-primary" data-dismiss="modal">保存</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>

<!-- 点击头像放大模态框 -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">我的头像</h4>
            </div>
            <div class="modal-body">
                <img id="myDialogImage" alt="" src="" width="300" height="300">
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                
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
						    <label for="inputEmail3" class="col-sm-2 control-label">用户编号:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="userId" class="form-control" id="myAddUserId" placeholder="请输入用户编号">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">用户名:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="userName" class="form-control" id="inputuserName" placeholder="请输入用户名">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">出生日期:</label>
						    <div class="col-sm-10">
						     <input type="text" id="inputuserBirthday" name="userBirthdays">
								<script src="${pageContext.request.contextPath}/plugin/layDate-v5.0.9/laydate/laydate.js"></script> <!-- 改成你的路径 -->
								<script>
								//执行一个laydate实例
								laydate.render({
								  elem: '#inputuserBirthday' //指定元素
								});
								</script>
						      
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputPassword3" class="col-sm-2 control-label">密码:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="userPwd" class="form-control" id="inputuserPwd" placeholder="请输入密码">
						    </div>
						  </div>
						  
						  
						  
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">性别:</label>
						    <div class="col-sm-10">
						      
						      <select id="inputuserSex" name="userSex">
                                    <option value="男">男</option>  
                                    <option value="女">女</option>   						      
						      </select>
						      
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">身份证号：</label>
						    <div class="col-sm-10">
						      <input type="text"  name="userCard" class="form-control" id="inputuserCard" placeholder="请输入身份证号">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputPassword3" class="col-sm-2 control-label">头像:</label>
						    <div class="col-sm-10">
						      <input name="userPhoto" type="hidden" id="photoImage1" value="" /> 
						      <img id="myAddImage" alt="" src="" width="100" height="100">
						      <input type="button" id="myPhotoButton1" value="选择头像" />
						    </div>
						  </div>
						   <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">婚姻状况:</label>
						  	  <div class="col-sm-10">
						      
						      <select id="inputhyzk" name="hyzk">
                                    <option value="已婚">已婚</option>  
                                    <option value="未婚">未婚</option>   
                                    <option value="离异">离异</option> 
                                    <option value="其他">其他</option> 						      
						      </select>
						      </div>
						    </div>
						  <div class="form-group">
						    <label for="inputPassword3" class="col-sm-2 control-label">岗位名称:</label>
						    <div class="col-sm-10">
						       <select id="myAddPosition1" name="poId">
						       
						       </select>
						    </div>
						  </div>
						  
						 
                  </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="addUser()" type="button" class="btn btn-primary" data-dismiss="modal">提交</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<script type="text/javascript">
/* 修改上传头像 */
 $(function(){
	 KindEditor.ready(function(K) {
			var editor = K.editor({
				allowFileManager : true
			});
			K('#myPhotoButton').click(function() {
				editor.loadPlugin('image', function() {
					editor.plugin.imageDialog({
						imageUrl : K('#photoImage').val(),//取值
						clickFn : function(url, title, width, height, border, align) {
							var startUrl='d://projectimage/image/';
							var newUrl = url.substr(startUrl.length);
							K('#photoImage').val(newUrl);
							
							$("#myUpdateImage").attr("src","/imgeurl/"+newUrl);
							editor.hideDialog();
						}
					});
				});
			});
		})
 })
 /* 添加上传头像 */
 $(function(){
	 KindEditor.ready(function(K) {
			var editor = K.editor({
				allowFileManager : true
			});
			K('#myPhotoButton1').click(function() {
				editor.loadPlugin('image', function() {
					editor.plugin.imageDialog({
						imageUrl : K('#photoImage1').val(),//取值
						clickFn : function(url, title, width, height, border, align) {
							var startUrl='d://projectimage/image/';
							var newUrl = url.substr(startUrl.length);
							K('#photoImage1').val(newUrl);
							
							$("#myAddImage").attr("src","/imgeurl/"+newUrl);
							editor.hideDialog();
						}
					});
				});
			});
		})
 })


</script>


</body>
</html>