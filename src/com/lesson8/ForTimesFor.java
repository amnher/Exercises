package com.lesson8;
import java.util.Scanner;

public class ForTimesFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, score = 0;
        int ans;
        System.out.print("Which times table shall I recite? ");
        num = sc.nextInt();
        for(int i = 1 ; i < 16 ; i++) {
            System.out.print(i + " * " + num + " is: ");
            ans = sc.nextInt();
            if(ans == (i*num)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Sorry no, the answer is: " + (i * num));
            }
        }
        System.out.println("You got " + score + " correct.");

    }
}
