package com.web.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.biz.DdxzBiz;
import com.web.dao.DdxzMapper;
import com.web.entity.Ddxz;

@Service
public class DdxzBizImpl implements DdxzBiz {
	
	@Autowired
	DdxzMapper ddxzMapper;

	@Override
	public List<Ddxz> queryAll() {
		// TODO Auto-generated method stub
		return ddxzMapper.queryAll();
	}

	@Override
	public Ddxz selectByPrimaryKey(Integer ddxzid) {
		// TODO Auto-generated method stub
		return ddxzMapper.selectByPrimaryKey(ddxzid);
	}
	@Override
	public int  updateByPrimaryKey(Ddxz ddxz) {
		
		return ddxzMapper.updateByPrimaryKey(ddxz);
	}
	@Override
	public int deleteByPrimaryKey(Integer ddxzid) {
		
		return ddxzMapper.deleteByPrimaryKey(ddxzid);
	}
	
	@Override
	public int insert(Ddxz ddxz) {
		// TODO Auto-generated method stub
		return ddxzMapper.insert(ddxz);
	}

}