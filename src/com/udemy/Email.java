package com.udemy;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("New email created: " + this.firstName + " " + this.lastName);

        this.department = setDepartment();
        System.out.println("Chosen department: " + this.department);
    }

    private String setDepartment() {
        System.out.print("Enter the department:\n1 for Sales \n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {return "sales"; }
        else if (depChoice == 2) {return "dev"; }
        else if (depChoice == 3) {return "acct"; }
        else {return ""; }
    }
}
