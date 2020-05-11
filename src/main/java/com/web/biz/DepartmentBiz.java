package com.web.biz;

import java.util.List;

import com.web.entity.TDepartment;


public interface DepartmentBiz {
	List<TDepartment>  queryAll();
	public TDepartment selectByPrimaryKey(Integer deptId);

	public int updateByPrimaryKey(TDepartment department);

	public int deleteByPrimaryKey(Integer deptId);
	
	int insert(TDepartment department);
}
