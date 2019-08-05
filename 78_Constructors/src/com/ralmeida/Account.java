package com.ralmeida;

import java.sql.SQLOutput;

// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.
public class Account {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public Account(int accountNumber, double balance, String customerName, String email, long phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double value){

        if (value > 0){
            this.balance += value;
            System.out.println("Deposit value: " + value + " - New Balance: " + this.balance);
        } else {
            System.out.println("Invalid Value");
            System.out.println("Current Balance: " + this.balance);
        }
    }


    public void withdrawal (double value) {

        if (value > this.balance){
            System.out.println("Insuficient funds.");
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Withdrawal: " + value);
            this.balance -= value;
            System.out.println("Current Balance: " + balance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
