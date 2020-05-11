package com.web.entity;

import java.io.Serializable;

/**
 * t_supplier
 * @author 
 */
public class TSupplier implements Serializable {
    private Integer sId;

    private String sName;

    private String sAddress;

    private String sTel;

    private String sSituation;

    private Integer sIsdelete;

    private static final long serialVersionUID = 1L;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getsTel() {
        return sTel;
    }

    public void setsTel(String sTel) {
        this.sTel = sTel;
    }

    public String getsSituation() {
        return sSituation;
    }

    public void setsSituation(String sSituation) {
        this.sSituation = sSituation;
    }

    public Integer getsIsdelete() {
        return sIsdelete;
    }

    public void setsIsdelete(Integer sIsdelete) {
        this.sIsdelete = sIsdelete;
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
        TSupplier other = (TSupplier) that;
        return (this.getsId() == null ? other.getsId() == null : this.getsId().equals(other.getsId()))
            && (this.getsName() == null ? other.getsName() == null : this.getsName().equals(other.getsName()))
            && (this.getsAddress() == null ? other.getsAddress() == null : this.getsAddress().equals(other.getsAddress()))
            && (this.getsTel() == null ? other.getsTel() == null : this.getsTel().equals(other.getsTel()))
            && (this.getsSituation() == null ? other.getsSituation() == null : this.getsSituation().equals(other.getsSituation()))
            && (this.getsIsdelete() == null ? other.getsIsdelete() == null : this.getsIsdelete().equals(other.getsIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getsId() == null) ? 0 : getsId().hashCode());
        result = prime * result + ((getsName() == null) ? 0 : getsName().hashCode());
        result = prime * result + ((getsAddress() == null) ? 0 : getsAddress().hashCode());
        result = prime * result + ((getsTel() == null) ? 0 : getsTel().hashCode());
        result = prime * result + ((getsSituation() == null) ? 0 : getsSituation().hashCode());
        result = prime * result + ((getsIsdelete() == null) ? 0 : getsIsdelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sId=").append(sId);
        sb.append(", sName=").append(sName);
        sb.append(", sAddress=").append(sAddress);
        sb.append(", sTel=").append(sTel);
        sb.append(", sSituation=").append(sSituation);
        sb.append(", sIsdelete=").append(sIsdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}