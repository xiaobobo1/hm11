package com.web.biz;

import java.util.List;

import com.web.entity.Ypql;


public interface YpqlBiz {
	
	
	public List<Ypql>  queryAll();

	public Ypql selectByPrimaryKey(Integer ypqlid);

	public int updateByPrimaryKey(Ypql ypql);

	public int deleteByPrimaryKey(Integer ypqlid);

	 int insert(Ypql ypql);

	

}
