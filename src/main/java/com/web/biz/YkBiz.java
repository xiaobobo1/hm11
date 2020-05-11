package com.web.biz;

import java.util.List;

import com.web.entity.Yk;


public interface YkBiz {
	
	
	public List<Yk>  queryAll();

	public Yk selectByPrimaryKey(Integer ykid);

	public int updateByPrimaryKey(Yk yk);

	public int deleteByPrimaryKey(Integer ykid);

	 int insert(Yk yk);

	

}
