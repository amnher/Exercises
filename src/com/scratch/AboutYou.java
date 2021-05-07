package com.scratch;

public class AboutYou {
    public static void main(String[] args) {
        int age = 16;
        boolean registered = true;
        if(age >= 18 && registered == true) {
            System.out.println("You can vote!");
        }

        if(age < 18 || registered != true) {
            System.out.println("You are not eligible to vote!");
        }
    }
}
