package com.web.dao;

import com.web.entity.TSupplier;
import com.web.entity.TSupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSupplierMapper {
    long countByExample(TSupplierExample example);

    int deleteByExample(TSupplierExample example);

    int deleteByPrimaryKey(Integer sId);

    int insert(TSupplier record);

    int insertSelective(TSupplier record);

    List<TSupplier> selectByExample(TSupplierExample example);

    TSupplier selectByPrimaryKey(Integer sId);

    int updateByExampleSelective(@Param("record") TSupplier record, @Param("example") TSupplierExample example);

    int updateByExample(@Param("record") TSupplier record, @Param("example") TSupplierExample example);

    int updateByPrimaryKeySelective(TSupplier record);

    int updateByPrimaryKey(TSupplier record);
    List<TSupplier> queryAll();
}