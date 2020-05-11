package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import com.web.biz.PositionBiz;
import com.web.entity.TPosition;

import com.web.util.DateTimeUtil;

@Controller
@RequestMapping(value="")
public class PositionController {
	
	@Resource(name="positionBizImpl")
	PositionBiz pb;
	
	
	@RequestMapping(value="/queryPosition")
	@ResponseBody
	public List<TPosition> queryAll(){
        
		
		List<TPosition> list = pb.queryAll();
		
		return list;
		
		
	}
	@RequestMapping(value="/updatePosition")
	@ResponseBody//返回的值json格式的数据     json对象
	public TPosition   sendUpdate(Integer poId){
		//调用业务逻辑层中的   根据编号查询用户信息方法
		
		TPosition position = pb.selectByPrimaryKey(poId);
		
		return position;
	}
	@RequestMapping(value="/saveUpdatePosition")
	@ResponseBody
	public int updateByPrimaryKey(TPosition position) {
		
		
		try {
			
			pb.updateByPrimaryKey(position);
			
			
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("修改失败");
			return 0;
		}

	}
	
	@RequestMapping(value="/deletePosition")
	@ResponseBody
	public int deleteByPrimaryKey(Integer poId){
		try{
		pb.deleteByPrimaryKey(poId);
		System.out.println("删除成功");
		return 1;
	}catch(Exception e){
		System.out.print("删除失败");
		return 0;
	}
	
	}
	
	
	@RequestMapping(value="/saveAddPosition")
	@ResponseBody
	public int insert(TPosition position,String userBirthdays)throws java.text.ParseException{
		
		
		try{
			pb.insert(position);
			
			
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("修改失败");
			return 0;
		}
	}
	
	

}
