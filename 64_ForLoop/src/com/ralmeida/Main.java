package com.ralmeida;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000d, 2d));

        for (int i=1; i<5; i++) {
            System.out.println("Value of i: " + i);
        }

        for (int interest = 2; interest <= 8; interest++){
            System.out.println("10,000 at " + interest + "% interest = " + calculateInterest(10000d, (double)interest));
        }

        for (int interest = 8; interest >= 2; interest--){
            System.out.println("10,000 at " + interest + "% interest = " + calculateInterest(10000d, (double)interest));
        }


        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint:  Use the break; statement to exit

        int count = 0;
        int range = 35;

        for (int i = 1; i <= range; i ++){
            if(isPrime(i)){
                System.out.println("Number " + i + " is prime");
                count++;
                if (count >= 3) {
                    break;
                }
            } else {
                System.out.println("Number " + i + " is NOT prime");
            }
        }

    }

    public static boolean isPrime(int n){
        if (n == 1) {
            return false;
        }

        for (int i=2; i <= (long) Math.sqrt(n); i++){
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

}
