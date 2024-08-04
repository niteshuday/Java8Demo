package com.nitesh.java8demo.stream;

import com.nitesh.java8demo.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        //********************************************************
        //List<Integer> list= Arrays.asList(10,8,6,45,60,2,4,21,26,3);
        //Predicate the number is greater then 4
        //Predicate<Integer> predicate= num->num>4;
        //Call any static method using reference
        //list.stream().filter(predicate).sorted().forEach(StreamTest::printNum);

        //Call or stream non-static or instance method
        //StreamTest test= new StreamTest();
        //list.stream().filter(predicate).forEach(test::printNum2);

        //***********************************************************
        //Where we can use map or flat map in stream
        List<User> users= Stream.of(
                new User("Shyam","12578546854",Arrays.asList("xyz@gmail.com","abc@gmail.com")),
                new User("Raj","658455445545",Arrays.asList("raj1@gmail.com","raj5@gmail.com"))
        ).collect(Collectors.toList());
        //We are using Map where we did not have multiple values or array
        //Like if we want to print all the phone numbers or names, so we are using map.
        List<String> phoneNumList=users.stream().map(User::getPhoneNumber).collect(Collectors.toList());
        System.out.println(phoneNumList);
        //We are using Flat Map where we  have multiple values or array
        //Like if we want to print all the emails without showing in array format
        List<String> emails=users.stream().flatMap(user->user.getEmails().stream()).collect(Collectors.toList());
        System.out.println(emails);

    }
    public static void printNum(int i){
        System.out.println(i);
    }
    public void printNum2(int i){
        System.out.println(i);
    }
}
