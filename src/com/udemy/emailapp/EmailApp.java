package com.udemy.emailapp;

public class EmailApp {

    public static void main(String[] args) {
        Email em1 = new Email("John", "Smith");
        em1.setAlternateEmail("JohnSmith@ourcompany.com");
        System.out.println(em1.showInfo());
    }
}
