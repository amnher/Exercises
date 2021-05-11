package com.lesson8;

import java.util.Scanner;

public class GuessMefinally {
    public static void main(String[] args) {
        String stringNumber;
        int correctNumber = 44;
        boolean loop = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("I've chosen a number. Betcha can't guess it!");
        do {

            System.out.print("Your guess: ");
            stringNumber = sc.nextLine();
            int number = Integer.parseInt(stringNumber);
            if (number > correctNumber)
                System.out.println("\nToo bad, way to high!");
            else if (number < correctNumber)
                System.out.println("\nHa, nice try - too low!");
            else {
                System.out.println("\nFinally! It's about time you got it!");
                break;
            }

        } while (loop==false);

    }
}
