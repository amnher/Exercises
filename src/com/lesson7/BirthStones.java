package com.lesson7;
import  java.util.Scanner;
public class BirthStones {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        String month, birthstone;
        System.out.print("What month's birthstone do you want to know? ");
        number = sc.nextInt();
        switch (number) {
            case 1:
                month = "January";
                birthstone = "Garnet";
                break;
            case 2:
                month = "February";
                birthstone = "Amethyst";
                break;
            case 3:
                month = "March";
                birthstone = "Aquamarine";
                break;
            case 4:
                month = "April";
                birthstone = "Diamond";
                break;
            case 5:
                month = "May";
                birthstone = "Emerald";
                break;
            case 6:
                month = "June";
                birthstone = "Pearl";
                break;
            case 7:
                month = "July";
                birthstone = "Ruby";
                break;
            case 8:
                month = "August";
                birthstone = "Peridot";
                break;
            case 9:
                month = "September";
                birthstone = "Sapphire";
                break;
            case 10:
                month = "October";
                birthstone = "Opal";
                break;
            case 11:
                month = "November";
                birthstone = "Topaz";
                break;
            case 12:
                month = "December";
                birthstone = "Turquiose";
                break;
            default:
                month = null;
                birthstone = null;
                break;
        }
        if ((month != null) && (birthstone != null))
            System.out.println(month + "'s birthstone is " + birthstone);
        else
            System.out.println("I think you might be confused, " + number + " doesn't match a month.");

    }
}
