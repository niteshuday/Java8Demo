package com.nitesh.java8demo.stream;

import com.nitesh.java8demo.User;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class StreamTest {
    public static void main(String[] args) {
        //*****************Stream with lambda exp **************************
        //List<Integer> list= Arrays.asList(10,8,6,45,60,2,4,21,26,3);
        //Predicate the number is greater then 4
        //Predicate<Integer> predicate= num->num>4;
        //Call any static method using reference
        //list.stream().filter(predicate).sorted().forEach(StreamTest::printNum);

        //Call or stream non-static or instance method
        //StreamTest test= new StreamTest();
        //list.stream().filter(predicate).forEach(test::printNum2);

        //**********************Stream Map or Flat Map*************************************
        //Where we can use map or flat map in stream
//        List<User> users= Stream.of(
//                new User("Shyam","12578546854",Arrays.asList("xyz@gmail.com","abc@gmail.com")),
//                new User("Raj","658455445545",Arrays.asList("raj1@gmail.com","raj5@gmail.com"))
//        ).collect(Collectors.toList());
        //We are using Map where we did not have multiple values or array
        //Like if we want to print all the phone numbers or names, so we are using map.
//        List<String> phoneNumList=users.stream().map(User::getPhoneNumber).collect(Collectors.toList());
//        System.out.println(phoneNumList);
        //We are using Flat Map where we  have multiple values or array
        //Like if we want to print all the emails without showing in array format
//        List<String> emails=users.stream().flatMap(user->user.getEmails().stream()).collect(Collectors.toList());
//        System.out.println(emails);

        //***********************Stream grouping****************************
        String inputStr="vikasprajapat";
        //1.Changing input String into array--> inputStr.split("")
        Map<String, Long> map = Arrays.stream(inputStr.split(""))
                .collect(
        //Importing a static Collectors in th top of the class which is having
        // grouping by method and counting method
        // Grouping by required 2 function which is mentioned below
                        groupingBy(
                                Function.identity(), counting()
                        )
                );
        System.out.println(map);

    }
    public static void printNum(int i){
        System.out.println(i);
    }
    public void printNum2(int i){
        System.out.println(i);
    }
}
