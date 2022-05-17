package com.corun.faultcheck.fault.check.dao;

import com.corun.faultcheck.fault.check.model.FaultImages;
import com.corun.faultcheck.fault.check.model.FaultImagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FaultImagesDao {
    long countByExample(FaultImagesExample example);

    int deleteByExample(FaultImagesExample example);

    int deleteByPrimaryKey(String id);

    int insert(FaultImages record);

    int insertSelective(FaultImages record);

    List<FaultImages> selectByExample(FaultImagesExample example);

    FaultImages selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FaultImages record, @Param("example") FaultImagesExample example);

    int updateByExample(@Param("record") FaultImages record, @Param("example") FaultImagesExample example);

    int updateByPrimaryKeySelective(FaultImages record);

    int updateByPrimaryKey(FaultImages record);
}