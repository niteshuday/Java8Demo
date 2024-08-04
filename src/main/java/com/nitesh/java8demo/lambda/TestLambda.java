package com.nitesh.java8demo.lambda;

import java.util.Random;
import java.util.function.Function;

public class TestLambda {

    public static void main(String[] args) {
//        FuncInterfaceForLambda lambda = () -> System.out.println("Method call without arguments");
//        lambda.withoutArg();

//        FuncInterfaceForLambda lambda=(i)->{
//            int multiple=i* new Random().nextInt();
//            return multiple+10;
//        };
//        System.out.println(lambda.oneArg(5));
        Function<Integer,String> function=(num)->String.valueOf(num)+" value get";
        System.out.println(function.apply(10));
    }
}
