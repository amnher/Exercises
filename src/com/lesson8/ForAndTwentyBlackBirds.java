package com.lesson8;

public class ForAndTwentyBlackBirds {
    public static void main(String[] args) {
        int birdsInPie = 0;
        for (int i = 0; i < 24; i++) {
            System.out.println("Blackbird #" + (i+1) + " goes into the pie!");
            birdsInPie++;
        }
        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
    }
}
