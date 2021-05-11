package com.lesson8;
import java.util.Scanner;

public class ForTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Which times table shall I recite? ");
        num = sc.nextInt();
        for(int i = 1 ; i < 16 ; i++) {
            System.out.println(i + " * " + num + " is: " + (i * num));
        }

    }
}
