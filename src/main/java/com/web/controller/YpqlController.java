package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import com.web.biz.YpqlBiz;
import com.web.entity.Ypql;

import com.web.util.DateTimeUtil;

@Controller
@RequestMapping(value="")
public class YpqlController {
	
	@Resource(name="ypqlBizImpl")
	YpqlBiz yqb;
	
	
	@RequestMapping(value="/queryYpql")
	@ResponseBody
	public List<Ypql> queryAll(){
        
		
		List<Ypql> list = yqb.queryAll();
		
		return list;
		
		
	}
	@RequestMapping(value="/updateYpql")
	@ResponseBody//���ص�ֵjson��ʽ������     json����
	public Ypql  sendUpdate(Integer ypqlid){
		//����ҵ���߼����е�   ���ݱ�Ų�ѯ�û���Ϣ����
		
		Ypql ypql = yqb.selectByPrimaryKey(ypqlid);
		
		return ypql;
	}
	@RequestMapping(value="/saveUpdateYpql")
	@ResponseBody
	public int updateByPrimaryKey(Ypql ypql) {
		
		
		try {
			
			yqb.updateByPrimaryKey(ypql);
			
			
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�޸�ʧ��");
			return 0;
		}

	}
	
	@RequestMapping(value="/deleteYpql")
	@ResponseBody
	public int deleteByPrimaryKey(Integer ypqlid){
		try{
		yqb.deleteByPrimaryKey(ypqlid);
		System.out.println("ɾ���ɹ�");
		return 1;
	}catch(Exception e){
		System.out.print("ɾ��ʧ��");
		return 0;
	}
	
	}
	
	
	@RequestMapping(value="/saveAddYpql")
	@ResponseBody
	public int insert(Ypql ypql)throws java.text.ParseException{
		
		
		try{
			yqb.insert(ypql);
			
			
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("�޸�ʧ��");
			return 0;
		}
	}
	
	

}