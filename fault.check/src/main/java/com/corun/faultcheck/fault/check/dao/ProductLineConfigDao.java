package com.corun.faultcheck.fault.check.dao;

import com.corun.faultcheck.fault.check.model.ProductLineConfig;
import com.corun.faultcheck.fault.check.model.ProductLineConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductLineConfigDao {
    long countByExample(ProductLineConfigExample example);

    int deleteByExample(ProductLineConfigExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProductLineConfig record);

    int insertSelective(ProductLineConfig record);

    List<ProductLineConfig> selectByExampleWithBLOBs(ProductLineConfigExample example);

    List<ProductLineConfig> selectByExample(ProductLineConfigExample example);

    ProductLineConfig selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProductLineConfig record, @Param("example") ProductLineConfigExample example);

    int updateByExampleWithBLOBs(@Param("record") ProductLineConfig record, @Param("example") ProductLineConfigExample example);

    int updateByExample(@Param("record") ProductLineConfig record, @Param("example") ProductLineConfigExample example);

    int updateByPrimaryKeySelective(ProductLineConfig record);

    int updateByPrimaryKeyWithBLOBs(ProductLineConfig record);

    int updateByPrimaryKey(ProductLineConfig record);
}