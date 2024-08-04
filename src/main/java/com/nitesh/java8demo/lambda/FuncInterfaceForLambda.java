package com.nitesh.java8demo.lambda;

public interface FuncInterfaceForLambda {
    /**
     * Example:-<b>withoutArg()</b>
     * FuncInterfaceForLambda lambda = () -> System.out.println("Method call without arguments");
     * lambda.withoutArg();
     */
//    void withoutArg();

    /**
     * <b>oneArg()</b>
     * Since if you dont want to calculate to much or a single line of calculation there<br>
     * No need to give return type.
     * Example 1:-
     * FuncInterfaceForLambda lambda=(i)->i*10;
     * System.out.println(lambda.oneArg(5));
     *
     *
     * Example 2:-
     * FuncInterfaceForLambda lambda=(i)->{
     *             int multiple=i* new Random().nextInt();
     *             return multiple+10;
     *         };
     * System.out.println(lambda.oneArg(5));
     */
//    int oneArg(int i);


    String multipleArg(String s1,String s2);
}
