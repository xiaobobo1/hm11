package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import com.web.biz.YkBiz;
import com.web.entity.Yk;

import com.web.util.DateTimeUtil;

@Controller
@RequestMapping(value="")
public class YkController {
	
	@Resource(name="ykBizImpl")
	YkBiz yb;
	
	
	@RequestMapping(value="/queryYk")
	@ResponseBody
	public List<Yk> queryAll(){
        
		
		List<Yk> list = yb.queryAll();
		
		return list;
		
		
	}
	@RequestMapping(value="/updateYk")
	@ResponseBody//���ص�ֵjson��ʽ������     json����
	public Yk  sendUpdate(Integer ykid){
		//����ҵ���߼����е�   ���ݱ�Ų�ѯ�û���Ϣ����
		
		Yk yk = yb.selectByPrimaryKey(ykid);
		
		return yk;
	}
	@RequestMapping(value="/saveUpdateYk")
	@ResponseBody
	public int updateByPrimaryKey(Yk yk) {
		
		
		try {
			
			yb.updateByPrimaryKey(yk);
			
			
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�޸�ʧ��");
			return 0;
		}

	}
	
	@RequestMapping(value="/deleteYk")
	@ResponseBody
	public int deleteByPrimaryKey(Integer ykid){
		try{
		yb.deleteByPrimaryKey(ykid);
		System.out.println("ɾ���ɹ�");
		return 1;
	}catch(Exception e){
		System.out.print("ɾ��ʧ��");
		return 0;
	}
	
	}
	
	
	@RequestMapping(value="/saveAddYk")
	@ResponseBody
	public int insert(Yk yk)throws java.text.ParseException{
		
		
		try{
			yb.insert(yk);
			
			
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("�޸�ʧ��");
			return 0;
		}
	}
	
	

}