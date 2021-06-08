package com.udemy.studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private final String firstName;
    private final String lastName;
    private final int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance;
    private static final int costOfCourse = 600;
    private static int id = 1000;

        public Student() {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter student's first name: ");
            this.firstName = in.nextLine();

            System.out.print("Enter student's last name: ");
            this.lastName = in.nextLine();

            System.out.print(
                    "1 - Freshmen\n" +
                    "2 - Sophomore\n" +
                    "3 - Junior\n" +
                    "4 - Senior\n" +
                    "Enter student's class level: ");
            this.gradeYear = in.nextInt();

            setStudentID();
        }

        private void setStudentID() {
            id++;
            this.studentID = gradeYear + "" + id;
        }

        public void enroll() {
            do {
                System.out.print("Enter course to enroll (Q to quit): ");
                Scanner in = new Scanner(System.in);
                String course = in.nextLine();
                if (!course.equals("Q")) {
                    courses = courses + "\n" + course;
                    tuitionBalance = tuitionBalance + costOfCourse;
                } else {
                    break;
                }

            } while (1 != 0);
            System.out.println("Enrolled in: " + courses);
        }

        public void viewBalance() {
            System.out.println("Your balance is : $" + tuitionBalance);
        }

        public void payTuition() {
            viewBalance();
            System.out.print("Enter your payment: $");
            Scanner in = new Scanner(System.in);
            int payment = in.nextInt();
            tuitionBalance = tuitionBalance - payment;
            System.out.println("Thank you for your payment of: $" + payment);
            viewBalance();
        }

        public String showInfo() {
            return "Name: " + firstName + " " + lastName +
                   "\nYear: "+ gradeYear +
                   "\nStudent ID: "+ studentID +
                   "\nCourses enrolled: "+ courses +
                   "\nBalance: $" + tuitionBalance;
        }
}
