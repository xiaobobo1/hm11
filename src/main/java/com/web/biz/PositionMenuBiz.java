package com.web.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PositionMenuBiz {

    
    /**
     * [1,2,3,4,5,8]
     * 根据职位id查询菜单id集合(权限菜单id)
     * @param poId
     * @return
     */
    public List<Integer> selectMenuByPoId(@Param("poId") Integer poId);
    

}
