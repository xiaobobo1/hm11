package com.web.entity;

import java.io.Serializable;

/**
 * ypql
 * @author 
 */
public class Ypql implements Serializable {
    private Integer ypqlid;

    private Integer ykid;

    private String lydw;

    private Integer lycount;

    private static final long serialVersionUID = 1L;

    public Integer getYpqlid() {
        return ypqlid;
    }

    public void setYpqlid(Integer ypqlid) {
        this.ypqlid = ypqlid;
    }

    public Integer getYkid() {
        return ykid;
    }

    public void setYkid(Integer ykid) {
        this.ykid = ykid;
    }

    public String getLydw() {
        return lydw;
    }

    public void setLydw(String lydw) {
        this.lydw = lydw;
    }

    public Integer getLycount() {
        return lycount;
    }

    public void setLycount(Integer lycount) {
        this.lycount = lycount;
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
        Ypql other = (Ypql) that;
        return (this.getYpqlid() == null ? other.getYpqlid() == null : this.getYpqlid().equals(other.getYpqlid()))
            && (this.getYkid() == null ? other.getYkid() == null : this.getYkid().equals(other.getYkid()))
            && (this.getLydw() == null ? other.getLydw() == null : this.getLydw().equals(other.getLydw()))
            && (this.getLycount() == null ? other.getLycount() == null : this.getLycount().equals(other.getLycount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYpqlid() == null) ? 0 : getYpqlid().hashCode());
        result = prime * result + ((getYkid() == null) ? 0 : getYkid().hashCode());
        result = prime * result + ((getLydw() == null) ? 0 : getLydw().hashCode());
        result = prime * result + ((getLycount() == null) ? 0 : getLycount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ypqlid=").append(ypqlid);
        sb.append(", ykid=").append(ykid);
        sb.append(", lydw=").append(lydw);
        sb.append(", lycount=").append(lycount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}