package com.scratch;
import java.util.Scanner;
public class NumberRange {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Please enter a number between 0 and 21: ");
            number = sc.nextInt();
        } while((number < 1) || (number > 20));
        System.out.println("Thank You!");
    }
}
