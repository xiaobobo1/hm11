package com.web.dao;

import com.web.entity.Yk;
import com.web.entity.YkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YkMapper {
    long countByExample(YkExample example);

    int deleteByExample(YkExample example);

    int deleteByPrimaryKey(Integer ykid);

    int insert(Yk record);

    int insertSelective(Yk record);

    List<Yk> selectByExample(YkExample example);

    Yk selectByPrimaryKey(Integer ykid);

    int updateByExampleSelective(@Param("record") Yk record, @Param("example") YkExample example);

    int updateByExample(@Param("record") Yk record, @Param("example") YkExample example);

    int updateByPrimaryKeySelective(Yk record);

    int updateByPrimaryKey(Yk record);
    List<Yk> queryAll();
}