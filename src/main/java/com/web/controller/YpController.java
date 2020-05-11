package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import com.web.biz.YpBiz;
import com.web.entity.Yp;

import com.web.util.DateTimeUtil;

@Controller
@RequestMapping(value="")
public class YpController {
	
	@Resource(name="ypBizImpl")
	YpBiz pb;
	
	
	@RequestMapping(value="/queryYp")
	@ResponseBody
	public List<Yp> queryAll(){
        
		
		List<Yp> list = pb.queryAll();
		
		return list;
		
		
	}
	@RequestMapping(value="/updateYp")
	@ResponseBody//返回的值json格式的数据     json对象
	public Yp  sendUpdate(Integer ypid){
		//调用业务逻辑层中的   根据编号查询用户信息方法
		
		Yp yp = pb.selectByPrimaryKey(ypid);
		
		return yp;
	}
	@RequestMapping(value="/saveUpdateYp")
	@ResponseBody
	public int updateByPrimaryKey(Yp yp) {
		
		
		try {
			
			pb.updateByPrimaryKey(yp);
			
			
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("修改失败");
			return 0;
		}

	}
	
	@RequestMapping(value="/deleteYp")
	@ResponseBody
	public int deleteByPrimaryKey(Integer ypid){
		try{
		pb.deleteByPrimaryKey(ypid);
		System.out.println("删除成功");
		return 1;
	}catch(Exception e){
		System.out.print("删除失败");
		return 0;
	}
	
	}
	
	
	@RequestMapping(value="/saveAddYp")
	@ResponseBody
	public int insert(Yp yp)throws java.text.ParseException{
		
		
		try{
			pb.insert(yp);
			
			
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("修改失败");
			return 0;
		}
	}
	
	

}