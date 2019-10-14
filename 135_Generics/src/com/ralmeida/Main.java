package com.ralmeida;

import java.util.ArrayList;

public class Main {

    // used to define a type of generic objects and comes inside diamonds <>
    // I.E. below defining the ArrayList to accept only Integer
    public static void main(String[] args) {
	    ArrayList<Integer> items = new ArrayList<>();

	    items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> items){
        for (int i : items){
            System.out.println(i * 2);
        }
    }
}
