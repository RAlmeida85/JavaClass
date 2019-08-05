package com.ralmeida;

public class Main {

    public static void main(String[] args) {

        // an integer has a width of 32
        int minInt = -2_147_483_648;
        int maxInt = 2_147_483_647;

        // a byte has a width of 8
        byte minByte = -128;
        byte maxByte = 127;

        // a short has a width of 16
        short minShort = -32768;
        short maxShort = 32767;

        // a long has a width of 64
        // need to use letter 'L' at end of value to define it as long
        long minLong = -9_223_372_036_854_775_808L;
        long maxLong = 9_223_372_036_854_775_807L;

        //exercise:
        // 1. Create a byte variable and set it to any valid byte number
        // 2. Create a short variable and set it to any valid short number
        // 3. Create a int variable and set it to any valid int number
        // 4. Create a long variable and make it equal to
        //      5000 + 10 times the sum of the byte plus the short plus the int

        byte myByte = 26;
        short myShort = 228;
        int myInt = 9872;
        long myLong = 5000L + 10L * (myByte + myShort + myInt);

        System.out.println("myLong = " + myLong);
    }
}
