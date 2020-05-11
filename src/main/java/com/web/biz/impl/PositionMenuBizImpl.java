package com.web.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.biz.PositionMenuBiz;
import com.web.dao.TPositionMenuMapper;

@Service//业务逻辑层
public class PositionMenuBizImpl implements PositionMenuBiz {
	
	@Resource
	TPositionMenuMapper tPositionMenuMapper;

	@Override
	public List<Integer> selectMenuByPoId(Integer poId) {
		
		return tPositionMenuMapper.selectMenuByPoId(poId);
	}

}
