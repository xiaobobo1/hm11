package com.web.dao;

import com.web.entity.TPositionMenu;
import com.web.entity.TPositionMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPositionMenuMapper {
    long countByExample(TPositionMenuExample example);

    int deleteByExample(TPositionMenuExample example);

    int deleteByPrimaryKey(Integer pmId);

    int insert(TPositionMenu record);

    int insertSelective(TPositionMenu record);

    List<TPositionMenu> selectByExample(TPositionMenuExample example);

    TPositionMenu selectByPrimaryKey(Integer pmId);

    int updateByExampleSelective(@Param("record") TPositionMenu record, @Param("example") TPositionMenuExample example);

    int updateByExample(@Param("record") TPositionMenu record, @Param("example") TPositionMenuExample example);

    int updateByPrimaryKeySelective(TPositionMenu record);

    int updateByPrimaryKey(TPositionMenu record);
    
    /**
     * [1,2,3,4,5,8]
     * 根据职位id查询菜单id集合(权限菜单id)
     * @param poId
     * @return
     */
    public List<Integer> selectMenuByPoId(@Param("poId") Integer poId);
    
    
    
    
    
}