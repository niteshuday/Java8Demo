package com.nitesh.java8demo.funcational;

import com.nitesh.java8demo.funcational.interfac.UPIPayment;

public class PhonePay implements UPIPayment {
    @Override
    public String doPayment(String source, String dest) {
        return "";
    }

    @Override
    public double getScratchCard() {
        System.out.println(this.getClass().getSimpleName()+" getScratchCard called");
        UPIPayment.datePattern("dd/MM/yyyy");
        return UPIPayment.super.getScratchCard();
    }

}
