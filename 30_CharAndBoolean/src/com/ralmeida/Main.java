package com.ralmeida;

public class Main {

    public static void main(String[] args) {
        // width of 16 (2 bytes)
        char myCharValue = 'b';
        char myCharUnicode = '\u00A9';

        System.out.println("myCharValue = " + myCharValue);
        System.out.println("myCharUnicode = " + myCharUnicode);

        char registerUnicode = '\u00AE';
        System.out.println("registerUnicode = " + registerUnicode);
    }
}
