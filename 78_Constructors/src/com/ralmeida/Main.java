package com.ralmeida;

public class Main {

    public static void main(String[] args) {
//	    Account acc = new Account(12345, 200, "Zequinha", "zequinha@acme.com", 12345678);
//
//        System.out.println("Name: " + acc.getCustomerName());
//        System.out.println("Account Number: " + acc.getAccountNumber());
//        System.out.println("Email: " + acc.getEmail());
//        System.out.println("Phone: " + acc.getPhoneNumber());
//        System.out.println("Initial Balance: " + acc.getBalance());
//
//        acc.depositFunds(100);
//        acc.withdrawal(500);
//        acc.depositFunds(-30);
//        acc.withdrawal(150);

        VipCustomer vip = new VipCustomer();

        System.out.println("Name: " + vip.getName() + "\nemail: " + vip.getEmail() + "\nLimit: " + vip.getCreditLimit());

        VipCustomer otherVip = new VipCustomer("Joaozinho", 5000, "joaozinho@acme.com");

        System.out.println("Name: " + otherVip.getName() + "\nemail: " + otherVip.getEmail() + "\nLimit: " + otherVip.getCreditLimit());
    }

}
