package com.nitesh.java8demo.funcational.interfac;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@FunctionalInterface
public interface UPIPayment {
    /**
     * An interface has only one method
     *
     * @param source
     * @param dest
     * @return
     */
    String doPayment(String source, String dest);

    /**
     * One Interface we can create multiple default method.
     * It's optional to override
     * @return
     */
    default double getScratchCard() {
        System.out.println(this.getClass().getSimpleName()+" UPIPayment called");
        return new Random().nextDouble();
    }

    /**
     * One Interface we can create multiple static method
     * @return
     */
    static String datePattern(String pattern) {
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        return df.format(new Date());
    }
}
