package com.web.dao;

import com.web.entity.Ddxz;
import com.web.entity.DdxzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DdxzMapper {
    long countByExample(DdxzExample example);

    int deleteByExample(DdxzExample example);

    int deleteByPrimaryKey(Integer ddxzid);

    int insert(Ddxz record);

    int insertSelective(Ddxz record);

    List<Ddxz> selectByExample(DdxzExample example);

    Ddxz selectByPrimaryKey(Integer ddxzid);

    int updateByExampleSelective(@Param("record") Ddxz record, @Param("example") DdxzExample example);

    int updateByExample(@Param("record") Ddxz record, @Param("example") DdxzExample example);

    int updateByPrimaryKeySelective(Ddxz record);

    int updateByPrimaryKey(Ddxz record);
    List<Ddxz> queryAll();
}