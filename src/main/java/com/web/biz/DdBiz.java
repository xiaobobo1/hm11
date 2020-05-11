package com.web.biz;

import java.util.List;

import com.web.entity.Dd;


public interface DdBiz {
	
	
	public List<Dd>  queryAll();

	public Dd selectByPrimaryKey(Integer ddid);

	public int updateByPrimaryKey(Dd dd);

	public int deleteByPrimaryKey(Integer ddid);

	 int insert(Dd dd);

	

}
