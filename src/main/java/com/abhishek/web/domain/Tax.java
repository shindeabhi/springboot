package com.abhishek.web.domain;

import java.math.BigDecimal;

/**
 * Created by user on 3/5/2017.
 */
public class Tax {

    Integer year;

    BigDecimal amt;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public Tax(Integer year, BigDecimal amt) {
        this.year = year;
        this.amt = amt;
    }
}
