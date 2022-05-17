package com.corun.faultcheck.fault.check.model;

import java.io.Serializable;
import java.util.Date;

/**
 * fault_info
 * @author 
 */
public class FaultInfo implements Serializable {
    /**
     * 缺陷信息id
     */
    private String id;

    /**
     * 卷材信息表
     */
    private String sheetId;

    /**
     * 卷材缺陷图片表id
     */
    private String imageId;

    /**
     * 缺陷开始位置x
     */
    private Long startPointX;

    /**
     * 缺陷开始位置y
     */
    private Long startPointY;

    /**
     * 宽度
     */
    private Long width;

    /**
     * 高度
     */
    private Long height;

    /**
     * 缺陷类型-20种类型，用数字代表
     */
    private Integer faultType;

    /**
     * 产生缺陷的类型 0 是算法产生的，1是人工产生的
     */
    private Integer dataType;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 操作员信息
     */
    private String operPerson;

    /**
     * 是否删除
     */
    private Boolean isDelete;

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

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public Long getStartPointX() {
        return startPointX;
    }

    public void setStartPointX(Long startPointX) {
        this.startPointX = startPointX;
    }

    public Long getStartPointY() {
        return startPointY;
    }

    public void setStartPointY(Long startPointY) {
        this.startPointY = startPointY;
    }

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public Integer getFaultType() {
        return faultType;
    }

    public void setFaultType(Integer faultType) {
        this.faultType = faultType;
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getOperPerson() {
        return operPerson;
    }

    public void setOperPerson(String operPerson) {
        this.operPerson = operPerson;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
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
        FaultInfo other = (FaultInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSheetId() == null ? other.getSheetId() == null : this.getSheetId().equals(other.getSheetId()))
            && (this.getImageId() == null ? other.getImageId() == null : this.getImageId().equals(other.getImageId()))
            && (this.getStartPointX() == null ? other.getStartPointX() == null : this.getStartPointX().equals(other.getStartPointX()))
            && (this.getStartPointY() == null ? other.getStartPointY() == null : this.getStartPointY().equals(other.getStartPointY()))
            && (this.getWidth() == null ? other.getWidth() == null : this.getWidth().equals(other.getWidth()))
            && (this.getHeight() == null ? other.getHeight() == null : this.getHeight().equals(other.getHeight()))
            && (this.getFaultType() == null ? other.getFaultType() == null : this.getFaultType().equals(other.getFaultType()))
            && (this.getDataType() == null ? other.getDataType() == null : this.getDataType().equals(other.getDataType()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getOperPerson() == null ? other.getOperPerson() == null : this.getOperPerson().equals(other.getOperPerson()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSheetId() == null) ? 0 : getSheetId().hashCode());
        result = prime * result + ((getImageId() == null) ? 0 : getImageId().hashCode());
        result = prime * result + ((getStartPointX() == null) ? 0 : getStartPointX().hashCode());
        result = prime * result + ((getStartPointY() == null) ? 0 : getStartPointY().hashCode());
        result = prime * result + ((getWidth() == null) ? 0 : getWidth().hashCode());
        result = prime * result + ((getHeight() == null) ? 0 : getHeight().hashCode());
        result = prime * result + ((getFaultType() == null) ? 0 : getFaultType().hashCode());
        result = prime * result + ((getDataType() == null) ? 0 : getDataType().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getOperPerson() == null) ? 0 : getOperPerson().hashCode());
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
        sb.append(", imageId=").append(imageId);
        sb.append(", startPointX=").append(startPointX);
        sb.append(", startPointY=").append(startPointY);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", faultType=").append(faultType);
        sb.append(", dataType=").append(dataType);
        sb.append(", createTime=").append(createTime);
        sb.append(", operPerson=").append(operPerson);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}