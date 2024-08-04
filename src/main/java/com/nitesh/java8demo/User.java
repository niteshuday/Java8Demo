package com.nitesh.java8demo;

import java.util.List;

public class User {
    private String name;
    private String phoneNumber;
    private List<String> emails;

    public User(String name, String phoneNumber, List<String> emails) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }
}
