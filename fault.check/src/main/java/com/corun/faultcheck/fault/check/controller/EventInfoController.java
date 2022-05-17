package com.corun.faultcheck.fault.check.controller;

import com.corun.faultcheck.fault.check.model.EventInfo;
import com.corun.faultcheck.fault.check.service.EventInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/event")
@ResponseBody
public class EventInfoController {

    @Autowired
    private EventInfoService eventInfoService;
    @PostMapping("/add/{eventType}")
    public String getVersion(@PathVariable("eventType") Integer eventType ){
        EventInfo eventInfo = new EventInfo();
        eventInfo.setEventType(eventType);
        this.eventInfoService.insert(eventInfo);
        return "success";
    }
}
