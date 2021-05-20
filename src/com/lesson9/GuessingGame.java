package com.lesson9;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        int number = 0;
        int gNumber;
        Scanner sc = new Scanner(System.in);

        System.out.print("Player 1: Enter number between 1 and 20: ");
        number = sc.nextInt();
        while(true) {
            System.out.print("Player 2: Enter guess between 1 and 20: ");
            gNumber = sc.nextInt();
            if(gNumber == number) {
                System.out.println("You won");
                break;
            }
            if(gNumber <1 || gNumber >20) {
                System.out.println("The number isn't between 1 and 20.");
            } else if(gNumber > number) {
                System.out.println("The guess it too high");
            } else {
                System.out.println("The guess it too low");
            }
        }

    }

}
