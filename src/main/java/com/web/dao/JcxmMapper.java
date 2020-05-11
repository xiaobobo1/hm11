package com.web.dao;

import com.web.entity.Jcxm;
import com.web.entity.JcxmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JcxmMapper {
    long countByExample(JcxmExample example);

    int deleteByExample(JcxmExample example);

    int deleteByPrimaryKey(Integer mzblid);

    int insert(Jcxm record);

    int insertSelective(Jcxm record);

    List<Jcxm> selectByExample(JcxmExample example);

    Jcxm selectByPrimaryKey(Integer mzblid);

    int updateByExampleSelective(@Param("record") Jcxm record, @Param("example") JcxmExample example);

    int updateByExample(@Param("record") Jcxm record, @Param("example") JcxmExample example);

    int updateByPrimaryKeySelective(Jcxm record);

    int updateByPrimaryKey(Jcxm record);
    List<Jcxm> queryAll();
}