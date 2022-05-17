package com.corun.faultcheck.fault.check.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sheets")
@ResponseBody
public class SheetsController {
    @GetMapping("/version")
    public String getVersion(){
        return "1.0.0";
    }
}
