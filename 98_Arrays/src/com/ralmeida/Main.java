package com.ralmeida;

import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers (int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i=0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int i=0; i < array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

    public static void main(String[] args) {

//        // Declaration of an Array of size 10
//        int[] myIntArray = new int[10];
//        // assign a value to a position (in this case 0) of an Array
//        myIntArray[0] = 50;
//        // to access/retrieve a value from a position in Array
//        System.out.println(myIntArray[0]);
//
//        // Another way to declare an Array and assign values
//        int[] anotherArray = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(anotherArray[0]);
//        System.out.println(anotherArray[5]);
//
//        // populating Array using a for loop
//        for (int i=0; i < myIntArray.length; i++){
//            myIntArray[i] = i*10;
//        }
//
//        printArray(myIntArray);
//
////        for (int i=0; i<10; i++){
////            System.out.println("Element " + i + ", value is " + myIntArray[i]);
////        }

        int[] myInt = getIntegers(5);

        for (int i=0; i<myInt.length; i++){
            System.out.println("Element " + i + ", typed values was " + myInt[i]);
        }

        System.out.printf("Average is " + getAverage(myInt));
    }

    public static void printArray(int[] array){
        for (int i=0; i < array.length; i++){
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
