package com.leeray.lm.entity;

public class Bookkind {
    private String bkno;

    private String bkname;

    private String bkd;

    public String getBkno() {
        return bkno;
    }

    public void setBkno(String bkno) {
        this.bkno = bkno == null ? null : bkno.trim();
    }

    public String getBkname() {
        return bkname;
    }

    public void setBkname(String bkname) {
        this.bkname = bkname == null ? null : bkname.trim();
    }

    public String getBkd() {
        return bkd;
    }

    public void setBkd(String bkd) {
        this.bkd = bkd == null ? null : bkd.trim();
    }
}