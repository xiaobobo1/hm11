package com.web.biz;

import java.util.List;

import com.web.entity.Jcxm;


public interface JcxmBiz {
	
	
	public List<Jcxm>  queryAll();

	public Jcxm selectByPrimaryKey(Integer mzblid);

	public int updateByPrimaryKey(Jcxm jcxm);

	public int deleteByPrimaryKey(Integer mzblid);

	 int insert(Jcxm jcxm);

	

}
