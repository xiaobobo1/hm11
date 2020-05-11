package com.web.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.web.biz.MenuBiz;
import com.web.dao.TMenuMapper;
import com.web.entity.TMenu;

@Service
public class MenuBizImpl implements MenuBiz {
	
	@Resource
	TMenuMapper menuMapper;

	@Override
	public List<TMenu> queryByParentId(Integer parentId) {
		
		//查询第一层的菜单
		List<TMenu>  firstList = menuMapper.queryByParentId(parentId);
		
		//递归调用算法
		execusion(firstList);		
		
		return firstList;
	}

	
	/**
	 * 递归算法
	 * 设置子菜单
	 */
	public void  execusion(List<TMenu>  firstList){
		
		if(firstList != null){
			for (TMenu tMenu : firstList) {
				//第一层菜单的id  ==   第二层菜单的父级id
				Integer secondParentId = tMenu.getMenuId();
				
				//第一层菜单的子菜单就是第二层的菜单
				List<TMenu>  secondList = queryByParentId(secondParentId);
				
				//递归调用
				execusion(secondList);
				
				//设置子菜单集合
				tMenu.setChildMenu(secondList);
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
}
