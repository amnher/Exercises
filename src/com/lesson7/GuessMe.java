package com.lesson7;
import java.util.Scanner;
public class GuessMe {
    public static void main(String[] args) {
        String stringNumber;
        int correctNumber = 44;
        Scanner sc = new Scanner(System.in);
        System.out.println("I've chosen a number. Betcha can't guess it!");
        System.out.print("Your guess: ");
        stringNumber = sc.nextLine();
        int number = Integer.parseInt(stringNumber);

        if (number > correctNumber)
            System.out.println("\n" + number + "? Too bad, way to high! I chose " + correctNumber);
        else if (number < correctNumber)
            System.out.println("\n" + number + "? Ha, nice try - too low! I choose " + correctNumber);
        else
            System.out.println("\n" + number + "? Wow, nice guess! That was it!");
    }
}
