package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import com.web.biz.SupplierBiz;
import com.web.entity.TSupplier;

import com.web.util.DateTimeUtil;

@Controller
@RequestMapping(value="")
public class SupplierController {
	
	@Resource(name="supplierBizImpl")
	SupplierBiz sb;
	
	
	@RequestMapping(value="/querySupplier")
	@ResponseBody
	public List<TSupplier> queryAll(){
        
		
		List<TSupplier> list = sb.queryAll();
		
		return list;
		
		
	}
	@RequestMapping(value="/updateSupplier")
	@ResponseBody//���ص�ֵjson��ʽ������     json����
	public TSupplier   sendUpdate(Integer sId){
		//����ҵ���߼����е�   ���ݱ�Ų�ѯ�û���Ϣ����
		
		TSupplier Supplier = sb.selectByPrimaryKey(sId);
		
		return Supplier;
	}
	@RequestMapping(value="/saveUpdateSupplier")
	@ResponseBody
	public int updateByPrimaryKey(TSupplier Supplier) {
		
		
		try {
			
			sb.updateByPrimaryKey(Supplier);
			
			
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�޸�ʧ��");
			return 0;
		}

	}
	
	@RequestMapping(value="/deleteSupplier")
	@ResponseBody
	public int deleteByPrimaryKey(Integer sId){
		try{
		sb.deleteByPrimaryKey(sId);
		System.out.println("ɾ���ɹ�");
		return 1;
	}catch(Exception e){
		System.out.print("ɾ��ʧ��");
		return 0;
	}
	
	}
	
	
	@RequestMapping(value="/saveAddSupplier")
	@ResponseBody
	public int insert(TSupplier supplier)throws java.text.ParseException{
		
		
		try{
			sb.insert(supplier);
			
			
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("�޸�ʧ��");
			return 0;
		}
	}
	
	

}