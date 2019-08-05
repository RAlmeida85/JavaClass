package com.ralmeida;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result -1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result +1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.printf("It is not an alien!");

        int score = 70;
        boolean isApproved = score >= 65 ? true : false;
        if (isApproved)
            System.out.println("Approved with score: " + score);

        // 1. Create a double variable with the value of 20
        // 2. Create a second double variable with the value 80
        // 3. Add both up and multiply by 25
        // 4. Use the reminder operator to figure out the remainder from step e divided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit"
        //  if the remaining total (#4) is equal to 20 or less

        double firstValue = 20d;
        double secondValue = 80d;
        double total = (firstValue + secondValue) * 25;
        double remainder = total % 40;
        if (remainder <= 20)
            System.out.printf("Total was over the limit");
    }
}
