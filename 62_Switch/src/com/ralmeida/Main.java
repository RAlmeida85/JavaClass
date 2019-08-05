package com.ralmeida;

public class Main {

    public static void main(String[] args) {
	    int value = 1;

	    switch (value){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Values was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was 3, or 4, or 5");
                break;

            default:
                System.out.println("Value was not 1 or 2");
        }

        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char charValue = 'G';

	    switch (charValue){
            case 'a': case 'A':
                System.out.println("Char 'a' was found: " + charValue);
                break;
            case 'b': case 'B':
                System.out.println("Char 'b' was found: " + charValue);
                break;
            case 'c': case 'C':
                System.out.println("Char 'c' was found: " + charValue);
                break;
            case 'd': case 'D':
                System.out.println("Char 'd' was found: " + charValue);
                break;
            case 'e': case 'E':
                System.out.println("Char 'e' was found: " + charValue);
                break;
            default:
                System.out.println("Expected char not found: " + charValue);
                break;
        }




    }


}
