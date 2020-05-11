package com.web.dao;

import com.web.entity.TUser;
import com.web.entity.TUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserMapper {
	/**
	 * 根据条件统计个数
	 * @param example
	 * @return
	 */
    long countByExample(TUserExample example);

    /**
     * 根据条件做删除
     * @param example
     * @return
     */
    int deleteByExample(TUserExample example);

    /**
     * 根据主键做删除
     * @param userId
     * @return
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * 添加
     * @param record
     * @return
     */
    int insert(TUser record);

    /**
     * 选择性添加
     * @param record
     * @return
     */
    int insertSelective(TUser record);

    /**
     * 根据条件查询
     * @param example
     * @return
     */
    List<TUser> selectByExample(TUserExample example);

    /**
     * 根据主键查询对象
     * @param userId
     * @return
     */
    TUser selectByPrimaryKey(Integer userId);

    /**
     * 根据条件选择性修改
     * @param record
     * @param example
     * @return
     */
    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);

    /**
     * 根据条件完全修改
     * @param record
     * @param example
     * @return
     */
    int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);

    /**
     * 根据主键选择性的修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(TUser record);

    /**
     * 根据主键修改对象
     * @param record
     * @return
     */
    int updateByPrimaryKey(TUser record);
    
    /**
     * 关联查询
     * @param user
     * @return
     */
    List<TUser>  queryAll(TUser user);
    
    
    
    
    
    
}