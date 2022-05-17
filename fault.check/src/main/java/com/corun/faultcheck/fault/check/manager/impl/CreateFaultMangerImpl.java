package com.corun.faultcheck.fault.check.manager.impl;

import com.corun.faultcheck.fault.check.manager.CreateFaultManger;
import com.corun.faultcheck.fault.check.model.FaultImages;
import com.corun.faultcheck.fault.check.model.FaultImagesExample;
import com.corun.faultcheck.fault.check.model.FaultInfo;
import com.corun.faultcheck.fault.check.modelVO.FaultListInfo;
import com.corun.faultcheck.fault.check.modelVO.FaultLocation;
import com.corun.faultcheck.fault.check.service.FaultImageService;
import com.corun.faultcheck.fault.check.service.FaultInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CreateFaultMangerImpl implements CreateFaultManger {

    @Value("${corun.faultcheck.oper}")
    private String operPerson;

    @Autowired
    private FaultImageService faultImageService;
    @Autowired
    private FaultInfoService faultInfoService;
    @Override
    public void createFaultInfo(FaultListInfo faultListInfo) {
        FaultImages faultImages = new FaultImages();
        faultImages.setSheetId(faultListInfo.getSheets());
        faultImages.setOriginalUrl(faultListInfo.getUrl());
        faultImages.setCalcuUrl(faultListInfo.getCalcuUrl());
        this.faultImageService.insert(faultImages);
        for (FaultLocation faultLocation : faultListInfo.getFaultLocationList()) {
            FaultInfo faultInfo = new FaultInfo();
            faultInfo.setFaultType(faultLocation.getFaultType());
            faultInfo.setImageId(faultImages.getId());
            faultInfo.setSheetId(faultImages.getSheetId());
            faultInfo.setStartPointX(faultLocation.getStartX());
            faultInfo.setStartPointY(faultLocation.getStartY());
            faultInfo.setWidth(faultLocation.getWidth());
            faultInfo.setHeight(faultLocation.getHeight());
            faultInfo.setOperPerson(operPerson);
            this.faultInfoService.insert(faultInfo);
        }
    }
}
