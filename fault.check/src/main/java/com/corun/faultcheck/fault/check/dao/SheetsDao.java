package com.corun.faultcheck.fault.check.dao;

import com.corun.faultcheck.fault.check.model.Sheets;
import com.corun.faultcheck.fault.check.model.SheetsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SheetsDao {
    long countByExample(SheetsExample example);

    int deleteByExample(SheetsExample example);

    int deleteByPrimaryKey(String id);

    int insert(Sheets record);

    int insertSelective(Sheets record);

    List<Sheets> selectByExample(SheetsExample example);

    Sheets selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Sheets record, @Param("example") SheetsExample example);

    int updateByExample(@Param("record") Sheets record, @Param("example") SheetsExample example);

    int updateByPrimaryKeySelective(Sheets record);

    int updateByPrimaryKey(Sheets record);
}