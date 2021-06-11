package com.udemy.bankaccountapp;

public abstract class Account implements BaseRate{
    // List common properties for savings and checking accounts
    private String accountHolder;
    private int socialSecurityNumber;
    private double balance;
    private int accountNumber;
    private double rate;

    //Constructor to set base properties and initialize the account
    public Account(String name, int ssn, double deposit) {
        accountHolder = name;
        socialSecurityNumber = ssn;
        balance = deposit;
        generateAccountNumber();
    }

    private void generateAccountNumber() {

        accountNumber = 3;

    }

    // List common methods
    public void deposit() {

    }

    public void withdraw() {

    }

    public void transfer() {

    }

    public void checkBalance() {

    }

    @Override
    public String toString() {
        return "Account{" +
                "accountHolder='" + accountHolder + '\'' +
                ", socialSecurityNumber=" + socialSecurityNumber +
                ", balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", rate=" + rate +
                '}';
    }
}
