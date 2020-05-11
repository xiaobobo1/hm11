package com.web.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.biz.YpqlBiz;
import com.web.dao.YpqlMapper;
import com.web.entity.Ypql;

@Service
public class YpqlBizImpl implements YpqlBiz {
	
	@Autowired
	YpqlMapper ypqlMapper;

	@Override
	public List<Ypql> queryAll() {
		// TODO Auto-generated method stub
		return ypqlMapper.queryAll();
	}

	@Override
	public Ypql selectByPrimaryKey(Integer ypqlid) {
		// TODO Auto-generated method stub
		return ypqlMapper.selectByPrimaryKey(ypqlid);
	}
	@Override
	public int  updateByPrimaryKey(Ypql ypql) {
		
		return ypqlMapper.updateByPrimaryKey(ypql);
	}
	@Override
	public int deleteByPrimaryKey(Integer ypqlid) {
		
		return ypqlMapper.deleteByPrimaryKey(ypqlid);
	}
	
	@Override
	public int insert(Ypql ypql) {
		// TODO Auto-generated method stub
		return ypqlMapper.insert(ypql);
	}

}