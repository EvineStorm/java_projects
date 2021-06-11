package com.udemy.bankaccountapp;

public class Checking extends Account{
    // List properties specific to checking account
    int debitCard;
    int debitCardPin;


    // Constructor to initialize checking account properties
    public Checking(String name, int ssn, double deposit) {
        super(name, ssn, deposit);

    }

    // List any methods specific to the checking account

}
