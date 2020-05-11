package com.web.entity;

import java.io.Serializable;

/**
 * yp
 * @author 
 */
public class Yp implements Serializable {
    private Integer ypid;

    private String ypname;

    private String ypgg;

    private String ypdw;

    private Double ypprice;

    private String ypbztime;

    private static final long serialVersionUID = 1L;

    public Integer getYpid() {
        return ypid;
    }

    public void setYpid(Integer ypid) {
        this.ypid = ypid;
    }

    public String getYpname() {
        return ypname;
    }

    public void setYpname(String ypname) {
        this.ypname = ypname;
    }

    public String getYpgg() {
        return ypgg;
    }

    public void setYpgg(String ypgg) {
        this.ypgg = ypgg;
    }

    public String getYpdw() {
        return ypdw;
    }

    public void setYpdw(String ypdw) {
        this.ypdw = ypdw;
    }

    public Double getYpprice() {
        return ypprice;
    }

    public void setYpprice(Double ypprice) {
        this.ypprice = ypprice;
    }

    public String getYpbztime() {
        return ypbztime;
    }

    public void setYpbztime(String ypbztime) {
        this.ypbztime = ypbztime;
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
        Yp other = (Yp) that;
        return (this.getYpid() == null ? other.getYpid() == null : this.getYpid().equals(other.getYpid()))
            && (this.getYpname() == null ? other.getYpname() == null : this.getYpname().equals(other.getYpname()))
            && (this.getYpgg() == null ? other.getYpgg() == null : this.getYpgg().equals(other.getYpgg()))
            && (this.getYpdw() == null ? other.getYpdw() == null : this.getYpdw().equals(other.getYpdw()))
            && (this.getYpprice() == null ? other.getYpprice() == null : this.getYpprice().equals(other.getYpprice()))
            && (this.getYpbztime() == null ? other.getYpbztime() == null : this.getYpbztime().equals(other.getYpbztime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYpid() == null) ? 0 : getYpid().hashCode());
        result = prime * result + ((getYpname() == null) ? 0 : getYpname().hashCode());
        result = prime * result + ((getYpgg() == null) ? 0 : getYpgg().hashCode());
        result = prime * result + ((getYpdw() == null) ? 0 : getYpdw().hashCode());
        result = prime * result + ((getYpprice() == null) ? 0 : getYpprice().hashCode());
        result = prime * result + ((getYpbztime() == null) ? 0 : getYpbztime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ypid=").append(ypid);
        sb.append(", ypname=").append(ypname);
        sb.append(", ypgg=").append(ypgg);
        sb.append(", ypdw=").append(ypdw);
        sb.append(", ypprice=").append(ypprice);
        sb.append(", ypbztime=").append(ypbztime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}