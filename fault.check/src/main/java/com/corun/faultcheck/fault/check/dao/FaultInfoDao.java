package com.corun.faultcheck.fault.check.dao;

import com.corun.faultcheck.fault.check.model.FaultInfo;
import com.corun.faultcheck.fault.check.model.FaultInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FaultInfoDao {
    long countByExample(FaultInfoExample example);

    int deleteByExample(FaultInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(FaultInfo record);

    int insertSelective(FaultInfo record);

    List<FaultInfo> selectByExample(FaultInfoExample example);

    FaultInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FaultInfo record, @Param("example") FaultInfoExample example);

    int updateByExample(@Param("record") FaultInfo record, @Param("example") FaultInfoExample example);

    int updateByPrimaryKeySelective(FaultInfo record);

    int updateByPrimaryKey(FaultInfo record);
}