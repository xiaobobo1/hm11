package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import com.web.biz.DdxzBiz;
import com.web.entity.Ddxz;

import com.web.util.DateTimeUtil;

@Controller
@RequestMapping(value="")
public class DdxzController {
	
	@Resource(name="ddxzBizImpl")
	DdxzBiz xzb;
	
	
	@RequestMapping(value="/queryDdxz")
	@ResponseBody
	public List<Ddxz> queryAll(){
        
		
		List<Ddxz> list = xzb.queryAll();
		
		return list;
		
		
	}
	@RequestMapping(value="/updateDdxz")
	@ResponseBody//返回的值json格式的数据     json对象
	public Ddxz  sendUpdate(Integer ddxzid){
		//调用业务逻辑层中的   根据编号查询用户信息方法
		
		Ddxz ddxz = xzb.selectByPrimaryKey(ddxzid);
		
		return ddxz;
	}
	@RequestMapping(value="/saveUpdateDdxz")
	@ResponseBody
	public int updateByPrimaryKey(Ddxz ddxz) {
		
		
		try {
			
			xzb.updateByPrimaryKey(ddxz);
			
			
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("修改失败");
			return 0;
		}

	}
	
	@RequestMapping(value="/deleteDdxz")
	@ResponseBody
	public int deleteByPrimaryKey(Integer ddxzid){
		try{
		xzb.deleteByPrimaryKey(ddxzid);
		System.out.println("删除成功");
		return 1;
	}catch(Exception e){
		System.out.print("删除失败");
		return 0;
	}
	
	}
	
	
	@RequestMapping(value="/saveAddDdxz")
	@ResponseBody
	public int insert(Ddxz ddxz)throws java.text.ParseException{
		
		
		try{
			xzb.insert(ddxz);
			
			
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("修改失败");
			return 0;
		}
	}
	
	

}