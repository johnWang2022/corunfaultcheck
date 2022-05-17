package com.corun.faultcheck.fault.check.dao;

import com.corun.faultcheck.fault.check.model.EventInfo;
import com.corun.faultcheck.fault.check.model.EventInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventInfoDao {
    long countByExample(EventInfoExample example);

    int deleteByExample(EventInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(EventInfo record);

    int insertSelective(EventInfo record);

    List<EventInfo> selectByExample(EventInfoExample example);

    EventInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EventInfo record, @Param("example") EventInfoExample example);

    int updateByExample(@Param("record") EventInfo record, @Param("example") EventInfoExample example);

    int updateByPrimaryKeySelective(EventInfo record);

    int updateByPrimaryKey(EventInfo record);
}