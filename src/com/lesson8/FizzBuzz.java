package com.lesson8;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int counter = 0;
        System.out.print("how many units of fizzing and buzzing do you need in your life? ");
        number = sc.nextInt();

        for (int i = 0 ; counter < number ; i++) {
            if (i != 0 && ((i%3==0) && (i%5==0))) {
                System.out.println("fizz buzz");
                counter++;
            } else if (i != 0 && (i % 3 == 0)) {
                System.out.println("fizz");
                counter++;
            } else if (i != 0 && (i % 5 ==0)) {
                System.out.println("buzz");
                counter++;
            } else {
                System.out.println(i);
            }

        }
        System.out.println("TRADITION!!!!!");

    }
}
