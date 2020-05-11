package com.web.dao;

import com.web.entity.Ypql;
import com.web.entity.YpqlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YpqlMapper {
    long countByExample(YpqlExample example);

    int deleteByExample(YpqlExample example);

    int deleteByPrimaryKey(Integer ypqlid);

    int insert(Ypql record);

    int insertSelective(Ypql record);

    List<Ypql> selectByExample(YpqlExample example);

    Ypql selectByPrimaryKey(Integer ypqlid);

    int updateByExampleSelective(@Param("record") Ypql record, @Param("example") YpqlExample example);

    int updateByExample(@Param("record") Ypql record, @Param("example") YpqlExample example);

    int updateByPrimaryKeySelective(Ypql record);

    int updateByPrimaryKey(Ypql record);
    List<Ypql> queryAll();
}