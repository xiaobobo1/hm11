package com.web.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.biz.SupplierBiz;
import com.web.dao.TSupplierMapper;
import com.web.entity.TSupplier;

@Service
public class SupplierBizImpl implements SupplierBiz {
	
	@Autowired
	TSupplierMapper tSupplierMapper;

	@Override
	public List<TSupplier> queryAll() {
		// TODO Auto-generated method stub
		return tSupplierMapper.queryAll();
	}

	@Override
	public TSupplier selectByPrimaryKey(Integer sId) {
		// TODO Auto-generated method stub
		return tSupplierMapper.selectByPrimaryKey(sId);
	}
	@Override
	public int  updateByPrimaryKey(TSupplier supplier) {
		
		return tSupplierMapper.updateByPrimaryKey(supplier);
	}
	@Override
	public int deleteByPrimaryKey(Integer sId) {
		
		return tSupplierMapper.deleteByPrimaryKey(sId);
	}
	
	@Override
	public int insert(TSupplier supplier) {
		// TODO Auto-generated method stub
		return tSupplierMapper.insert(supplier);
	}

}