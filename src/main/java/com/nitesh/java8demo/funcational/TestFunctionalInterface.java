package com.nitesh.java8demo.funcational;

import com.nitesh.java8demo.funcational.interfac.UPIPayment;

public class TestFunctionalInterface {
    public static void main(String[] args) {
        UPIPayment amazonPay= new PhonePay();
        amazonPay.doPayment("wallet","Axis Bank");
        System.out.println(UPIPayment.datePattern("dd/MM/yyyy"));
        System.out.println(amazonPay.getScratchCard());
    }
}
