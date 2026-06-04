package org.example;

import java.util.*;

public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;   // initial balance
        int choice;

        while (true) {
            System.out.println("\n===== ATM MACHINE =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: System.out.println("Your balance is:" + balance);
                    break;
                case 2: System.out.print("Enter deposit amount: ");
                    int deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Money Deposited Successfully");
                    break;
                case 3: System.out.print("Enter withdraw amount: ");
                    int withdraw = sc.nextInt();
                    if (withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your cash");
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    break;
                case 4: System.out.println("Thank you for using ATM");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        }
    }
}
