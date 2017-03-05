package com.abhishek.web.controller;

import com.abhishek.web.domain.Tax;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * Created by user on 3/5/2017.
 */
@RestController
public class TaxCalculator {

    @RequestMapping("/getTaxDetails")
    public Tax getTaxDetails() {
        return new Tax(00043256, BigDecimal.valueOf(123567));
    }

}
