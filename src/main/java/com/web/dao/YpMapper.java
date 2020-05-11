package com.web.dao;

import com.web.entity.Yp;
import com.web.entity.YpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YpMapper {
    long countByExample(YpExample example);

    int deleteByExample(YpExample example);

    int deleteByPrimaryKey(Integer ypid);

    int insert(Yp record);

    int insertSelective(Yp record);

    List<Yp> selectByExample(YpExample example);

    Yp selectByPrimaryKey(Integer ypid);

    int updateByExampleSelective(@Param("record") Yp record, @Param("example") YpExample example);

    int updateByExample(@Param("record") Yp record, @Param("example") YpExample example);

    int updateByPrimaryKeySelective(Yp record);

    int updateByPrimaryKey(Yp record);
    List<Yp> queryAll();
}