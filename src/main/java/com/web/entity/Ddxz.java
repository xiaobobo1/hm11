package com.web.entity;

import java.io.Serializable;

/**
 * ddxz
 * @author 
 */
public class Ddxz implements Serializable {
    private Integer ddxzid;

    private Integer ddid;

    private Integer ypid;

    /**
     * 购买药品数量
     */
    private Integer num;

    private String guige;

    private String ddph;

    private static final long serialVersionUID = 1L;

    public Integer getDdxzid() {
        return ddxzid;
    }

    public void setDdxzid(Integer ddxzid) {
        this.ddxzid = ddxzid;
    }

    public Integer getDdid() {
        return ddid;
    }

    public void setDdid(Integer ddid) {
        this.ddid = ddid;
    }

    public Integer getYpid() {
        return ypid;
    }

    public void setYpid(Integer ypid) {
        this.ypid = ypid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getGuige() {
        return guige;
    }

    public void setGuige(String guige) {
        this.guige = guige;
    }

    public String getDdph() {
        return ddph;
    }

    public void setDdph(String ddph) {
        this.ddph = ddph;
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
        Ddxz other = (Ddxz) that;
        return (this.getDdxzid() == null ? other.getDdxzid() == null : this.getDdxzid().equals(other.getDdxzid()))
            && (this.getDdid() == null ? other.getDdid() == null : this.getDdid().equals(other.getDdid()))
            && (this.getYpid() == null ? other.getYpid() == null : this.getYpid().equals(other.getYpid()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getGuige() == null ? other.getGuige() == null : this.getGuige().equals(other.getGuige()))
            && (this.getDdph() == null ? other.getDdph() == null : this.getDdph().equals(other.getDdph()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDdxzid() == null) ? 0 : getDdxzid().hashCode());
        result = prime * result + ((getDdid() == null) ? 0 : getDdid().hashCode());
        result = prime * result + ((getYpid() == null) ? 0 : getYpid().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getGuige() == null) ? 0 : getGuige().hashCode());
        result = prime * result + ((getDdph() == null) ? 0 : getDdph().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ddxzid=").append(ddxzid);
        sb.append(", ddid=").append(ddid);
        sb.append(", ypid=").append(ypid);
        sb.append(", num=").append(num);
        sb.append(", guige=").append(guige);
        sb.append(", ddph=").append(ddph);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}