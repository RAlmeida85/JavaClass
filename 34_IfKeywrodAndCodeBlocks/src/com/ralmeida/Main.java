package com.ralmeida;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score == 5000){
//            System.out.println("Your score was " + score);
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.printf("Your final score was " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.printf("\nYour final score was " + finalScore);
        }

    }
}
