package com.company;

import java.util.Scanner;

public class bankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    bankAccount(String cname,String cId){
        customerName = cname;
        customerId = cId;
    }

    void deposit(int amount){
        if(amount!=0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }
    void withdrawAmount(int amount){
        if(amount!=0){
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }
    void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposited "+previousTransaction);
        }
        else if(previousTransaction < 0){
            System.out.println("Withdrawn "+ Math.abs(previousTransaction));
        }
        else{
            System.out.println("No transaction occured");
        }
    }
    void showMenu(){
        char option = 'a';
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome "+ customerName);
        System.out.println("Your ID is "+ customerId);
        System.out.println();
        System.out.println("A : check balance");
        System.out.println("B : deposit");
        System.out.println("C : Withdraw");
        System.out.println("D : Previous Transaction");
        System.out.println("E : Exit");
        do{
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("Enter an Option :");
            System.out.println("--------------------------------------------------------------------------------------");
            option = sc.next().charAt(0);
            System.out.println();
            switch (option){
                case 'A':
                    System.out.println("_____________________________________");
                    System.out.println("Balance = " +balance);
                    System.out.println("_____________________________________");
                    System.out.println();
                    break;

                case 'B':
                    System.out.println("_____________________________________");
                    System.out.println("Enter an amount to Deposit ");
                    System.out.println("_____________________________________");
                    int amount = sc.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;

                case 'C':
                    System.out.println("_____________________________________");
                    System.out.println("Enter amount to Withdraw ");
                    System.out.println("_____________________________________");
                    int amount2 = sc.nextInt();
                    withdrawAmount(amount2);
                    System.out.println();
                    break;

                case 'D':
                    System.out.println("_____________________________________");
                    getPreviousTransaction();
                    System.out.println("_____________________________________");
                    System.out.println();
                    break;

                case 'E':
                    System.out.println("_____________________________________");
                    System.out.println("");
                    break;

                default:
                    System.out.println("Invalid Option!! Please enter again ");
                    break;

            }

        }while(option!='E');
        System.out.println("Thank you for using our System");

    }
}
