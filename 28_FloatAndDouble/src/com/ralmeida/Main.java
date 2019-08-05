package com.ralmeida;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 3;
        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        // width of float = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue    = " + myIntValue);
        System.out.println("myFloatValue  = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);


        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of kilograms for the number above and store in a variable
        // 3. Print out the result.
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms

        double valueOfPounds = 200;
        double convertedToKilograms = valueOfPounds * 0.45359237d;
        System.out.println("Value of Pounds = " + valueOfPounds);
        System.out.println("Converted to Kilograms = " + convertedToKilograms);
    }
}
