package com.lesson7;

import java.util.Scanner;
public class PickyEater {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("How many times has it been fried? (#) ");
        int timesFried = Integer.parseInt(userInput.nextLine());
        System.out.print("Does it have any spinach in it? (y/n) ");
        String hasSpinach = userInput.nextLine();
        System.out.print("Is it covered in cheese? (y/n) ");
        String cheeseCovered = userInput.nextLine();
        System.out.print("How many pats of butter are on top? (#) ");
        int butterPats = Integer.parseInt(userInput.nextLine());
        System.out.print("Is it covered in chocolate? (y/n) ");
        String chocolatedCovered = userInput.nextLine();
        System.out.print("Does it have a funny name? (y/n) ");
        String funnyName = userInput.nextLine();
        System.out.print("Is it broccoli? (y/n) ");
        String isBroccoli = userInput.nextLine();
// Conditionals should go here! Here's the first one for FREE!
        if (hasSpinach.equals("y") || funnyName.equals("y")) {
            System.out.println("There's no way he'll eat that!");
        }
    }
}
