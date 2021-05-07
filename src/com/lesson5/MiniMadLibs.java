package com.lesson5;
import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringInput = "";
        int input = 0;

        System.out.print("Enter a number: ");
        input = Integer.parseInt(stringInput = sc.nextLine());
        if (input >= 0)
            System.out.println("The number is positive");
        else
            System.out.println("The number is negative");
    }
}
