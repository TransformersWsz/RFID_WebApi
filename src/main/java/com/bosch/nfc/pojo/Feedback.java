package com.bosch.nfc.pojo;

import java.sql.Date;

public class Feedback {
    private Date rq;
    private String comment;

    public void setRq(Date rq) {
        this.rq = rq;
    }

    public Date getRq() {
        return rq;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
