package com.web.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.biz.DdBiz;
import com.web.dao.DdMapper;
import com.web.entity.Dd;

@Service
public class DdBizImpl implements DdBiz {
	
	@Autowired
	DdMapper ddMapper;

	@Override
	public List<Dd> queryAll() {
		// TODO Auto-generated method stub
		return ddMapper.queryAll();
	}

	@Override
	public Dd selectByPrimaryKey(Integer ddid) {
		// TODO Auto-generated method stub
		return ddMapper.selectByPrimaryKey(ddid);
	}
	@Override
	public int  updateByPrimaryKey(Dd dd) {
		
		return ddMapper.updateByPrimaryKey(dd);
	}
	@Override
	public int deleteByPrimaryKey(Integer ddid) {
		
		return ddMapper.deleteByPrimaryKey(ddid);
	}
	
	@Override
	public int insert(Dd dd) {
		// TODO Auto-generated method stub
		return ddMapper.insert(dd);
	}

}