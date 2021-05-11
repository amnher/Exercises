package com.lesson7;
import java.util.Scanner;
public class FieldDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String team = "";
        System.out.print("What's your last name? ");
        String name = sc.nextLine();
        if(name.compareTo("Baggins") < 0)
            team = "Red Dragons";
        else if((name.compareTo("Bagging") >= 0) && (name.compareTo("Dresden") < 0))
            team = "Dark Wizards";
        else if((name.compareTo("Dresden") >= 0) && (name.compareTo("Howl") < 0))
            team = "Moving Castle";
        else if((name.compareTo("Howl") >= 0) && (name.compareTo("Potter") < 0))
            team = "Golden Snitches";
        else if((name.compareTo("Potter") >= 0) && (name.compareTo("Vimes") < 0))
            team = "Night Guards";
        else if(name.compareTo("Bagging") >= 0)
            team = "Black Holes";

        System.out.println("Aha! You're on the team \"" + team + "\"!");
        System.out.println("Good luck in the games!");


    }
}
