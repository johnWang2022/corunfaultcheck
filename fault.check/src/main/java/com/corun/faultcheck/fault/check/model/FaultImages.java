package com.corun.faultcheck.fault.check.model;

import java.io.Serializable;
import java.util.Date;

/**
 * fault_images
 * @author 
 */
public class FaultImages implements Serializable {
    /**
     * 缺陷信息图片id
     */
    private String id;

    /**
     * 卷材信息表
     */
    private String sheetId;

    /**
     * 原始图片的url地址
     */
    private String originalUrl;

    /**
     * 算法计算图片的url地址
     */
    private String calcuUrl;

    /**
     * 停机信号id
     */
    private String stopId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否删除信息
     */
    private String isDelete;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSheetId() {
        return sheetId;
    }

    public void setSheetId(String sheetId) {
        this.sheetId = sheetId;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getCalcuUrl() {
        return calcuUrl;
    }

    public void setCalcuUrl(String calcuUrl) {
        this.calcuUrl = calcuUrl;
    }

    public String getStopId() {
        return stopId;
    }

    public void setStopId(String stopId) {
        this.stopId = stopId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        FaultImages other = (FaultImages) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSheetId() == null ? other.getSheetId() == null : this.getSheetId().equals(other.getSheetId()))
            && (this.getOriginalUrl() == null ? other.getOriginalUrl() == null : this.getOriginalUrl().equals(other.getOriginalUrl()))
            && (this.getCalcuUrl() == null ? other.getCalcuUrl() == null : this.getCalcuUrl().equals(other.getCalcuUrl()))
            && (this.getStopId() == null ? other.getStopId() == null : this.getStopId().equals(other.getStopId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSheetId() == null) ? 0 : getSheetId().hashCode());
        result = prime * result + ((getOriginalUrl() == null) ? 0 : getOriginalUrl().hashCode());
        result = prime * result + ((getCalcuUrl() == null) ? 0 : getCalcuUrl().hashCode());
        result = prime * result + ((getStopId() == null) ? 0 : getStopId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sheetId=").append(sheetId);
        sb.append(", originalUrl=").append(originalUrl);
        sb.append(", calcuUrl=").append(calcuUrl);
        sb.append(", stopId=").append(stopId);
        sb.append(", createTime=").append(createTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}