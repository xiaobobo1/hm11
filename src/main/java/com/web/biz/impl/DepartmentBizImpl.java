package com.web.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.biz.DepartmentBiz;
import com.web.dao.TDepartmentMapper;
import com.web.entity.TDepartment;
import com.web.entity.TDepartmentExample;

@Service
public class DepartmentBizImpl implements DepartmentBiz {
	@Autowired
	TDepartmentMapper tDepartmentMapper;

	@Override
	public List<TDepartment> queryAll() {
		TDepartmentExample example=new TDepartmentExample();
		return tDepartmentMapper.selectByExample(example);
	}
	@Override
	public TDepartment selectByPrimaryKey(Integer deptId) {
		// TODO Auto-generated method stub
		return tDepartmentMapper.selectByPrimaryKey(deptId);
	}
	@Override
	public int  updateByPrimaryKey(TDepartment department) {
		
		return tDepartmentMapper.updateByPrimaryKey(department);
	}
	@Override
	public int deleteByPrimaryKey(Integer deptId) {
		
		return tDepartmentMapper.deleteByPrimaryKey(deptId);
	}
	@Override
	public int insert(TDepartment department) {
		// TODO Auto-generated method stub
		return tDepartmentMapper.insert(department);
	}
}
