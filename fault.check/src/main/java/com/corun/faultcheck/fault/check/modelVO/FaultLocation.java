package com.corun.faultcheck.fault.check.modelVO;

import lombok.Data;

/**
 * 缺陷信息
 */
@Data
public class FaultLocation {
    /**
     * 缺陷序列
     */
    private String index;
    /**
     * 缺陷位置 x 轴
     */
    private Long startX;
    /**
     * 缺陷位置 y 轴
     */
    private Long startY;
    /**
     * 缺陷宽度
     */
    private Long width;
    /**
     * 缺陷长度
     */
    private Long height;

    /**
     * 缺陷类型-20种类型，用数字代表
     */
    private Integer faultType;

}
