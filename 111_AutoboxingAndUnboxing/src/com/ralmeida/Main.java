package com.ralmeida;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // ArrayList (and any other List in java expect Class objects, and we cannot use primitive types
        // For this purpose we can use Autoboxing and Unboxing concepts

        // Java provide object classes for primitives types
        Integer integer = 54; //Integer.valueOf(56)
        Double doubleValue = 12.56;

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for (int i=0; i<10; i++){
            // we can use Integer.valueOf(int) method to AUTOBOX an int value to an Integer object
            intArrayList.add(i);
        }

        for (int i=0; i<10; i++){
            // we can use ArrayList.get(index).intValue() method to Unbox a Integer object value to an int variable
            System.out.println("Integer " + i + " --> " + intArrayList.get(i));
        }
        ArrayList<Double> doubleList = new ArrayList<Double>();
        for (double d=0.0; d <=5.5; d+= 0.5){
            doubleList.add(d);
        }

        for (int i=0; i < doubleList.size(); i++){
            double value = doubleList.get(i);
            System.out.println("Double " + i + " --> " + value);
        }


    }
}
