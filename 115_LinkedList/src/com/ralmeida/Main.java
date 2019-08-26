package com.ralmeida;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 555);
        Customer anotherCustomer = customer;

        anotherCustomer.setBalance(1234);

        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());


        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(001);
        intList.add(200);
        intList.add(300);

        for (int i=0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 100);

        for (int i=0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

    }
}
