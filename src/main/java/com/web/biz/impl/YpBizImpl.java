package com.web.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.biz.YpBiz;
import com.web.dao.YpMapper;
import com.web.entity.Yp;

@Service
public class YpBizImpl implements YpBiz {
	
	@Autowired
	YpMapper ypMapper;

	@Override
	public List<Yp> queryAll() {
		// TODO Auto-generated method stub
		return ypMapper.queryAll();
	}

	@Override
	public Yp selectByPrimaryKey(Integer ypid) {
		// TODO Auto-generated method stub
		return ypMapper.selectByPrimaryKey(ypid);
	}
	@Override
	public int  updateByPrimaryKey(Yp yp) {
		
		return ypMapper.updateByPrimaryKey(yp);
	}
	@Override
	public int deleteByPrimaryKey(Integer ypid) {
		
		return ypMapper.deleteByPrimaryKey(ypid);
	}
	
	@Override
	public int insert(Yp yp) {
		// TODO Auto-generated method stub
		return ypMapper.insert(yp);
	}

}