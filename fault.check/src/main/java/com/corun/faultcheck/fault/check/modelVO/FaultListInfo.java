package com.corun.faultcheck.fault.check.modelVO;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.util.List;

/**
 * 接受算法的缺陷信息
 */
@Data
public class FaultListInfo {
    /**
     * 缺陷信息列表
     */
    private List<FaultLocation> faultLocationList;
    /**
     * 卷材信息
     */
    private String sheets;
    /**
     * 缺陷图片地址
     */
    private String url;

    /**
     * 算法计算图片的url地址
     */
    private String calcuUrl;

    public static FaultListInfo getFaultList(String message){
        return JSONObject.parseObject(message,FaultListInfo.class);
    }
}
