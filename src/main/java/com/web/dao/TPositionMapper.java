package com.web.dao;

import com.web.entity.TPosition;
import com.web.entity.TPositionExample;


import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPositionMapper {
    long countByExample(TPositionExample example);

    int deleteByExample(TPositionExample example);

    int deleteByPrimaryKey(Integer poId);

    int insert(TPosition record);

    int insertSelective(TPosition record);

    List<TPosition> selectByExample(TPositionExample example);

    TPosition selectByPrimaryKey(Integer poId);

    int updateByExampleSelective(@Param("record") TPosition record, @Param("example") TPositionExample example);

    int updateByExample(@Param("record") TPosition record, @Param("example") TPositionExample example);

    int updateByPrimaryKeySelective(TPosition record);

    int updateByPrimaryKey(TPosition record);
    List<TPosition>  queryAll();
    
}