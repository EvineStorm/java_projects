package com.udemy.bankaccountapp;

public class Savings extends Account {
    // List properties specific to savings account
    int safetyDepositBoxNr;
    int depositBoxPin;

    // Constructor to initialize savings account properties
    public Savings(String name, int ssn, double deposit) {
        super(name, ssn, deposit);
    }

    // List any methods specific to the checking account

}
