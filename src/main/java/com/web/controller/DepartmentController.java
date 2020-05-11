package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.web.biz.DepartmentBiz;
import com.web.entity.TDepartment;




@Controller
@RequestMapping(value="")
public class DepartmentController {
	@Resource(name="departmentBizImpl")
	DepartmentBiz db;
	
	
	
	@RequestMapping(value="/queryDepartment")
	@ResponseBody
	public List<TDepartment> queryAll(){
		return db.queryAll();
		
	}
	@RequestMapping(value="/updateDepartment")
	@ResponseBody//返回的值json格式的数据     json对象
	public TDepartment   sendUpdate(Integer deptId){
		//调用业务逻辑层中的   根据编号查询用户信息方法
		
		TDepartment department = db.selectByPrimaryKey(deptId);
		
		return department;
	}
	@RequestMapping(value="/saveUpdateDepartment")
	@ResponseBody
	public int updateByPrimaryKey(TDepartment department) {
		
		
		try {
			
			db.updateByPrimaryKey(department);
			
			
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("修改失败");
			return 0;
		}

	}
	
	@RequestMapping(value="/deleteDepartment")
	@ResponseBody
	public int deleteByPrimaryKey(Integer deptId){
		try{
		db.deleteByPrimaryKey(deptId);
		System.out.println("删除成功");
		return 1;
	}catch(Exception e){
		System.out.print("删除失败");
		return 0;
	}
	
	}
	
	@RequestMapping(value="/saveAddDepartment")
	@ResponseBody
	public int insert(TDepartment department,String userBirthdays)throws java.text.ParseException{
		
		
		try{
			db.insert(department);
			
			
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("修改失败");
			return 0;
		}
	}
}
