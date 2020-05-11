package com.web.entity;

import java.io.Serializable;

/**
 * dd
 * @author 
 */
public class Dd implements Serializable {
    private Integer ddid;

    private Integer sid;

    private Integer ddcount;

    /**
     * 订货日期
     */
    private String dhdate;

    /**
     * 交货日期
     */
    private String jhdate;

    private String scaddress;

    private static final long serialVersionUID = 1L;

    public Integer getDdid() {
        return ddid;
    }

    public void setDdid(Integer ddid) {
        this.ddid = ddid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getDdcount() {
        return ddcount;
    }

    public void setDdcount(Integer ddcount) {
        this.ddcount = ddcount;
    }

    public String getDhdate() {
        return dhdate;
    }

    public void setDhdate(String dhdate) {
        this.dhdate = dhdate;
    }

    public String getJhdate() {
        return jhdate;
    }

    public void setJhdate(String jhdate) {
        this.jhdate = jhdate;
    }

    public String getScaddress() {
        return scaddress;
    }

    public void setScaddress(String scaddress) {
        this.scaddress = scaddress;
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
        Dd other = (Dd) that;
        return (this.getDdid() == null ? other.getDdid() == null : this.getDdid().equals(other.getDdid()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getDdcount() == null ? other.getDdcount() == null : this.getDdcount().equals(other.getDdcount()))
            && (this.getDhdate() == null ? other.getDhdate() == null : this.getDhdate().equals(other.getDhdate()))
            && (this.getJhdate() == null ? other.getJhdate() == null : this.getJhdate().equals(other.getJhdate()))
            && (this.getScaddress() == null ? other.getScaddress() == null : this.getScaddress().equals(other.getScaddress()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDdid() == null) ? 0 : getDdid().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getDdcount() == null) ? 0 : getDdcount().hashCode());
        result = prime * result + ((getDhdate() == null) ? 0 : getDhdate().hashCode());
        result = prime * result + ((getJhdate() == null) ? 0 : getJhdate().hashCode());
        result = prime * result + ((getScaddress() == null) ? 0 : getScaddress().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ddid=").append(ddid);
        sb.append(", sid=").append(sid);
        sb.append(", ddcount=").append(ddcount);
        sb.append(", dhdate=").append(dhdate);
        sb.append(", jhdate=").append(jhdate);
        sb.append(", scaddress=").append(scaddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}