package com.web.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.biz.PositionBiz;
import com.web.dao.TPositionMapper;
import com.web.entity.TPosition;
import com.web.entity.TUser;

@Service
public class PositionBizImpl implements PositionBiz {
	
	@Autowired
	TPositionMapper tPostionMapper;

	@Override
	public List<TPosition> queryAll() {
		// TODO Auto-generated method stub
		return tPostionMapper.queryAll();
	}

	@Override
	public TPosition selectByPrimaryKey(Integer poId) {
		// TODO Auto-generated method stub
		return tPostionMapper.selectByPrimaryKey(poId);
	}
	@Override
	public int  updateByPrimaryKey(TPosition position) {
		
		return tPostionMapper.updateByPrimaryKey(position);
	}
	@Override
	public int deleteByPrimaryKey(Integer poId) {
		
		return tPostionMapper.deleteByPrimaryKey(poId);
	}
	
	@Override
	public int insert(TPosition position) {
		// TODO Auto-generated method stub
		return tPostionMapper.insert(position);
	}

}
