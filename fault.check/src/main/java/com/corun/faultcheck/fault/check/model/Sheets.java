package com.corun.faultcheck.fault.check.model;

import java.io.Serializable;
import java.util.Date;

/**
 * sheets
 * @author 
 */
public class Sheets implements Serializable {
    /**
     * 卷材信息id
     */
    private String id;

    /**
     * 卷材信息编码
     */
    private String sheetsCode;

    /**
     * 卷材信息图片地址
     */
    private String url;

    /**
     * 产线工艺id
     */
    private String proLineConfigId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 操作人员信息
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

    public String getSheetsCode() {
        return sheetsCode;
    }

    public void setSheetsCode(String sheetsCode) {
        this.sheetsCode = sheetsCode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProLineConfigId() {
        return proLineConfigId;
    }

    public void setProLineConfigId(String proLineConfigId) {
        this.proLineConfigId = proLineConfigId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
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
        Sheets other = (Sheets) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSheetsCode() == null ? other.getSheetsCode() == null : this.getSheetsCode().equals(other.getSheetsCode()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getProLineConfigId() == null ? other.getProLineConfigId() == null : this.getProLineConfigId().equals(other.getProLineConfigId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getOperPerson() == null ? other.getOperPerson() == null : this.getOperPerson().equals(other.getOperPerson()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSheetsCode() == null) ? 0 : getSheetsCode().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getProLineConfigId() == null) ? 0 : getProLineConfigId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
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
        sb.append(", sheetsCode=").append(sheetsCode);
        sb.append(", url=").append(url);
        sb.append(", proLineConfigId=").append(proLineConfigId);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", operPerson=").append(operPerson);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}