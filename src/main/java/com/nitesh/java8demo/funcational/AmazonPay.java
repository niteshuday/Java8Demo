package com.nitesh.java8demo.funcational;

import com.nitesh.java8demo.funcational.interfac.UPIPayment;

public class AmazonPay implements UPIPayment {

    @Override
    public String doPayment(String source, String dest) {
        System.out.println("Amazon Pay called");
        return "";
    }
}
