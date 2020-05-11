package com.web.dao;

import com.web.entity.Dd;
import com.web.entity.DdExample;
import com.web.entity.Ddxz;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DdMapper {
    long countByExample(DdExample example);

    int deleteByExample(DdExample example);

    int deleteByPrimaryKey(Integer ddid);

    int insert(Dd record);

    int insertSelective(Dd record);

    List<Dd> selectByExample(DdExample example);

    Dd selectByPrimaryKey(Integer ddid);

    int updateByExampleSelective(@Param("record") Dd record, @Param("example") DdExample example);

    int updateByExample(@Param("record") Dd record, @Param("example") DdExample example);

    int updateByPrimaryKeySelective(Dd record);
    int updateByPrimaryKey(Dd record);

    List<Dd> queryAll();
}