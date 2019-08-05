package com.ralmeida;

public class Main {

    public static void main(String[] args) {
	    int count = 7;
	    while (count < 5) {
            System.out.println("Count value is " + count);
            count++;
        }

	    do{
            System.out.println("Count value is " + count);
            count++;
        }while(count < 6);

        count = 1;
	    while (count < 8){
            System.out.println(count + " is Even? " + isEvenNumber(count));
            count++;
	    }
    }

    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    public static boolean isEvenNumber (int number){

        if ((number < 0) || (number % 2 != 0)){
            return false;
        } else {
            return true;
        }
    }
}
