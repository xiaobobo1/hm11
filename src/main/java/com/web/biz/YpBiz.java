package com.web.biz;

import java.util.List;

import com.web.entity.Yp;


public interface YpBiz {
	
	
	public List<Yp>  queryAll();

	public Yp selectByPrimaryKey(Integer ypid);

	public int updateByPrimaryKey(Yp yp);

	public int deleteByPrimaryKey(Integer ypid);

	 int insert(Yp yp);

	

}
