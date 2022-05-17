package com.corun.faultcheck.fault.check.service.impl;

import com.corun.faultcheck.fault.check.dao.FaultInfoDao;
import com.corun.faultcheck.fault.check.model.FaultInfo;
import com.corun.faultcheck.fault.check.service.FaultInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class FaultInfoServiceImpl implements FaultInfoService {

    @Autowired
    private FaultInfoDao faultInfoDao;
    @Override
    public int insert(FaultInfo record) {
        record.setDataType(0);//产生缺陷的类型 0 是算法产生的，1是人工产生的
        record.setId(UUID.randomUUID().toString());
        record.setIsDelete(Boolean.FALSE);
        record.setCreateTime(new Date());
        this.faultInfoDao.insert(record);
        return 0;
    }
}
