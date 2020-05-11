package com.web.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.web.entity.TMenu;

public interface MenuBiz {

	/**
     * 根据父级id查询菜单
     * @param parentId
     * @return
     */
    List<TMenu> queryByParentId(Integer parentId);
}
