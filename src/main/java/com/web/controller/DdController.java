package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import com.web.biz.DdBiz;
import com.web.entity.Dd;

import com.web.util.DateTimeUtil;

@Controller
@RequestMapping(value="")
public class DdController {
	
	@Resource(name="ddBizImpl")
	DdBiz db;
	
	
	@RequestMapping(value="/queryDd")
	@ResponseBody
	public List<Dd> queryAll(){
        
		
		List<Dd> list = db.queryAll();
		
		return list;
		
		
	}
	@RequestMapping(value="/updateDd")
	@ResponseBody//返回的值json格式的数据     json对象
	public Dd  sendUpdate(Integer ddid){
		//调用业务逻辑层中的   根据编号查询用户信息方法
		
		Dd dd = db.selectByPrimaryKey(ddid);
		
		return dd;
	}
	@RequestMapping(value="/saveUpdateDd")
	@ResponseBody
	public int updateByPrimaryKey(Dd dd) {
		
		
		try {
			
			db.updateByPrimaryKey(dd);
			
			
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("修改失败");
			return 0;
		}

	}
	
	@RequestMapping(value="/deleteDd")
	@ResponseBody
	public int deleteByPrimaryKey(Integer ddid){
		try{
		db.deleteByPrimaryKey(ddid);
		System.out.println("删除成功");
		return 1;
	}catch(Exception e){
		System.out.print("删除失败");
		return 0;
	}
	
	}
	
	
	@RequestMapping(value="/saveAddDd")
	@ResponseBody
	public int insert(Dd dd)throws java.text.ParseException{
		
		
		try{
			db.insert(dd);
			
			
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("修改失败");
			return 0;
		}
	}
	
	

}