package com.corun.faultcheck.fault.check.service.impl;

import com.corun.faultcheck.fault.check.dao.EventInfoDao;
import com.corun.faultcheck.fault.check.model.EventInfo;
import com.corun.faultcheck.fault.check.service.EventInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class EventInfoServiceImpl implements EventInfoService {

    @Autowired
    private EventInfoDao eventInfoDao;

    @Override
    public int insert(EventInfo record) {
        record.setId(UUID.randomUUID().toString());
        record.setCreateTime(new Date());
        record.setSheetId(UUID.randomUUID().toString());
        this.eventInfoDao.insert(record);
        return 0;
    }
}
