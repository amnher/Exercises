package com.lesson7;
import java.util.Scanner;
public class TriviaNight {
    public static void main(String[] args) {
        int score = 0;
        int answer;
        Scanner sc = new Scanner(System.in);
        System.out.println("It's TRIVIA NIGHT! Are you ready?!");
        System.out.println("\nFIRST QUESTION!");
        System.out.println("What is the lower-level programming language?");
        System.out.println("1) Source code");
        System.out.println("2) Assembly language");
        System.out.println("3) C#");
        System.out.println("4) Machine Code");
        System.out.print("\nYOUR ANSWER: ");
        answer = sc.nextInt();
        if (answer == 4) {
            score += 1;
            System.out.println("Correct! Score: " + score);
        } else {
            System.out.println("Incorrect! The answer is 4 Machine Code. Score: " + score);
        }

        System.out.println("\nSECOND QUESTION!");
        System.out.println("Website security CAPTCHA forms are descended from the work of?");
        System.out.println("1) Grace Hopper");
        System.out.println("2) Alan Turing");
        System.out.println("3) Charles Babbage");
        System.out.println("4) Larry Page");
        System.out.print("\nYOUR ANSWER: ");
        answer = sc.nextInt();
        if (answer == 2) {
            score += 1;
            System.out.println("Correct! Score: " + score);
        } else {
            System.out.println("Incorrect! The answer is 2 Alan Turing. Score: " + score);
        }

        System.out.println("\nLAST QUESTION!");
        System.out.println("Which of these sci-fi ships was once slated for a full-size replica in Las Vegas?");
        System.out.println("1) Serenity");
        System.out.println("2) The Battlestar Galactica");
        System.out.println("3) USS Enterprise");
        System.out.println("4) The Millenium Falcon");
        System.out.print("\nYOUR ANSWER: ");
        answer = sc.nextInt();
        if (answer == 3) {
            score += 1;
            System.out.println("Correct! Score: " + score);
        } else {
            System.out.println("Incorrect! The answer is 3 USS Enterprise. Score: " + score);
        }

        System.out.println("\nNice job - you got " + score + " correct!");



    }
}
