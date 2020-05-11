package com.web.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.biz.YkBiz;
import com.web.dao.YkMapper;
import com.web.entity.Yk;

@Service
public class YkBizImpl implements YkBiz {
	
	@Autowired
	YkMapper ykMapper;

	@Override
	public List<Yk> queryAll() {
		// TODO Auto-generated method stub
		return ykMapper.queryAll();
	}

	@Override
	public Yk selectByPrimaryKey(Integer ykid) {
		// TODO Auto-generated method stub
		return ykMapper.selectByPrimaryKey(ykid);
	}
	@Override
	public int  updateByPrimaryKey(Yk yk) {
		
		return ykMapper.updateByPrimaryKey(yk);
	}
	@Override
	public int deleteByPrimaryKey(Integer ykid) {
		
		return ykMapper.deleteByPrimaryKey(ykid);
	}
	
	@Override
	public int insert(Yk yk) {
		// TODO Auto-generated method stub
		return ykMapper.insert(yk);
	}

}