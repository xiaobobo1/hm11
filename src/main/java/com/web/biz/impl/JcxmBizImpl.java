package com.web.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.biz.JcxmBiz;
import com.web.dao.JcxmMapper;
import com.web.entity.Jcxm;

@Service
public class JcxmBizImpl implements JcxmBiz {
	
	@Autowired
	JcxmMapper jcxmMapper;

	@Override
	public List<Jcxm> queryAll() {
		// TODO Auto-generated method stub
		return jcxmMapper.queryAll();
	}

	@Override
	public Jcxm selectByPrimaryKey(Integer mzblid) {
		// TODO Auto-generated method stub
		return jcxmMapper.selectByPrimaryKey(mzblid);
	}
	@Override
	public int  updateByPrimaryKey(Jcxm jcxm) {
		
		return jcxmMapper.updateByPrimaryKey(jcxm);
	}
	@Override
	public int deleteByPrimaryKey(Integer mzblid) {
		
		return jcxmMapper.deleteByPrimaryKey(mzblid);
	}
	
	@Override
	public int insert(Jcxm jcxm) {
		// TODO Auto-generated method stub
		return jcxmMapper.insert(jcxm);
	}

}