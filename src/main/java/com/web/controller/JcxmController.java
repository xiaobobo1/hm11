package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import com.web.biz.JcxmBiz;
import com.web.entity.Jcxm;

import com.web.util.DateTimeUtil;

@Controller
@RequestMapping(value="")
public class JcxmController {
	
	@Resource(name="jcxmBizImpl")
	JcxmBiz db;
	
	
	@RequestMapping(value="/queryJcxm")
	@ResponseBody
	public List<Jcxm> queryAll(){
        
		
		List<Jcxm> list = db.queryAll();
		
		return list;
		
		
	}
	@RequestMapping(value="/updateJcxm")
	@ResponseBody//返回的值json格式的数据     json对象
	public Jcxm  sendUpdate(Integer mzblid){
		//调用业务逻辑层中的   根据编号查询用户信息方法
		
		Jcxm jcxm = db.selectByPrimaryKey(mzblid);
		
		return jcxm;
	}
	@RequestMapping(value="/saveUpdateJcxm")
	@ResponseBody
	public int updateByPrimaryKey(Jcxm jcxm) {
		
		
		try {
			
			db.updateByPrimaryKey(jcxm);
			
			
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("修改失败");
			return 0;
		}

	}
	
	@RequestMapping(value="/deleteJcxm")
	@ResponseBody
	public int deleteByPrimaryKey(Integer mzblid){
		try{
		db.deleteByPrimaryKey(mzblid);
		System.out.println("删除成功");
		return 1;
	}catch(Exception e){
		System.out.print("删除失败");
		return 0;
	}
	
	}
	
	
	@RequestMapping(value="/saveAddJcxm")
	@ResponseBody
	public int insert(Jcxm jcxm)throws java.text.ParseException{
		
		
		try{
			db.insert(jcxm);
			
			
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("修改失败");
			return 0;
		}
	}
	
	

}