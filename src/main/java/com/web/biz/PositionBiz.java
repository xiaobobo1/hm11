package com.web.biz;

import java.util.List;

import com.web.entity.TPosition;


public interface PositionBiz {
	
	
	public List<TPosition>  queryAll();

	public TPosition selectByPrimaryKey(Integer poId);

	public int updateByPrimaryKey(TPosition position);

	public int deleteByPrimaryKey(Integer poId);

	 int insert(TPosition position);

	

}
