package com.corun.faultcheck.fault.check.service.impl;

import com.corun.faultcheck.fault.check.dao.FaultImagesDao;
import com.corun.faultcheck.fault.check.model.FaultImages;
import com.corun.faultcheck.fault.check.service.FaultImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class FaultImageServiceImpl implements FaultImageService {
    @Autowired
    private FaultImagesDao faultImagesDao;
    @Override
    public int insert(FaultImages record) {
        record.setId(UUID.randomUUID().toString());
        record.setIsDelete("0");
        record.setStopId("");
        record.setCreateTime(new Date());
        this.faultImagesDao.insert(record);
        return 0;
    }
}
