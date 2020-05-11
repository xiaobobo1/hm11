package com.web.biz;

import java.util.List;

import com.web.entity.Ddxz;


public interface DdxzBiz {
	
	
	public List<Ddxz>  queryAll();

	public Ddxz selectByPrimaryKey(Integer ddxzid);

	public int updateByPrimaryKey(Ddxz ddxz);

	public int deleteByPrimaryKey(Integer ddxzid);

	 int insert(Ddxz ddxz);

	

}
