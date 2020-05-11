package com.web.entity;

import java.io.Serializable;

/**
 * yk
 * @author 
 */
public class Yk implements Serializable {
    private Integer ykid;

    private Integer ykfzid;

    private String yklb;

    private Double area;

    private static final long serialVersionUID = 1L;

    public Integer getYkid() {
        return ykid;
    }

    public void setYkid(Integer ykid) {
        this.ykid = ykid;
    }

    public Integer getYkfzid() {
        return ykfzid;
    }

    public void setYkfzid(Integer ykfzid) {
        this.ykfzid = ykfzid;
    }

    public String getYklb() {
        return yklb;
    }

    public void setYklb(String yklb) {
        this.yklb = yklb;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
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
        Yk other = (Yk) that;
        return (this.getYkid() == null ? other.getYkid() == null : this.getYkid().equals(other.getYkid()))
            && (this.getYkfzid() == null ? other.getYkfzid() == null : this.getYkfzid().equals(other.getYkfzid()))
            && (this.getYklb() == null ? other.getYklb() == null : this.getYklb().equals(other.getYklb()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYkid() == null) ? 0 : getYkid().hashCode());
        result = prime * result + ((getYkfzid() == null) ? 0 : getYkfzid().hashCode());
        result = prime * result + ((getYklb() == null) ? 0 : getYklb().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ykid=").append(ykid);
        sb.append(", ykfzid=").append(ykfzid);
        sb.append(", yklb=").append(yklb);
        sb.append(", area=").append(area);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}