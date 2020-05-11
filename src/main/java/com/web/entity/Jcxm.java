package com.web.entity;

import java.io.Serializable;

/**
 * jcxm
 * @author 
 */
public class Jcxm implements Serializable {
    private Integer mzblid;

    private String jcys;

    private String jcnr;

    private String jcfx;

    private String jxjg;

    private Double jcfy;

    private static final long serialVersionUID = 1L;

    public Integer getMzblid() {
        return mzblid;
    }

    public void setMzblid(Integer mzblid) {
        this.mzblid = mzblid;
    }

    public String getJcys() {
        return jcys;
    }

    public void setJcys(String jcys) {
        this.jcys = jcys;
    }

    public String getJcnr() {
        return jcnr;
    }

    public void setJcnr(String jcnr) {
        this.jcnr = jcnr;
    }

    public String getJcfx() {
        return jcfx;
    }

    public void setJcfx(String jcfx) {
        this.jcfx = jcfx;
    }

    public String getJxjg() {
        return jxjg;
    }

    public void setJxjg(String jxjg) {
        this.jxjg = jxjg;
    }

    public Double getJcfy() {
        return jcfy;
    }

    public void setJcfy(Double jcfy) {
        this.jcfy = jcfy;
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
        Jcxm other = (Jcxm) that;
        return (this.getMzblid() == null ? other.getMzblid() == null : this.getMzblid().equals(other.getMzblid()))
            && (this.getJcys() == null ? other.getJcys() == null : this.getJcys().equals(other.getJcys()))
            && (this.getJcnr() == null ? other.getJcnr() == null : this.getJcnr().equals(other.getJcnr()))
            && (this.getJcfx() == null ? other.getJcfx() == null : this.getJcfx().equals(other.getJcfx()))
            && (this.getJxjg() == null ? other.getJxjg() == null : this.getJxjg().equals(other.getJxjg()))
            && (this.getJcfy() == null ? other.getJcfy() == null : this.getJcfy().equals(other.getJcfy()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMzblid() == null) ? 0 : getMzblid().hashCode());
        result = prime * result + ((getJcys() == null) ? 0 : getJcys().hashCode());
        result = prime * result + ((getJcnr() == null) ? 0 : getJcnr().hashCode());
        result = prime * result + ((getJcfx() == null) ? 0 : getJcfx().hashCode());
        result = prime * result + ((getJxjg() == null) ? 0 : getJxjg().hashCode());
        result = prime * result + ((getJcfy() == null) ? 0 : getJcfy().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mzblid=").append(mzblid);
        sb.append(", jcys=").append(jcys);
        sb.append(", jcnr=").append(jcnr);
        sb.append(", jcfx=").append(jcfx);
        sb.append(", jxjg=").append(jxjg);
        sb.append(", jcfy=").append(jcfy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}