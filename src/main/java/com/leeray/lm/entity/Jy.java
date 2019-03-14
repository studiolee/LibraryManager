package com.leeray.lm.entity;

import java.util.Date;

public class Jy extends JyKey {
    private Date jdate;

    private Date rdate;

    private Date ghdate;

    private Float fine;

    public Date getJdate() {
        return jdate;
    }

    public void setJdate(Date jdate) {
        this.jdate = jdate;
    }

    public Date getRdate() {
        return rdate;
    }

    public void setRdate(Date rdate) {
        this.rdate = rdate;
    }

    public Date getGhdate() {
        return ghdate;
    }

    public void setGhdate(Date ghdate) {
        this.ghdate = ghdate;
    }

    public Float getFine() {
        return fine;
    }

    public void setFine(Float fine) {
        this.fine = fine;
    }
}