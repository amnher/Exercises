package com.lesson6;
import java.util.Scanner;
public class AddMultipleWindows {
    public static void main(String[] args) {
        // declare variables for height and width
        float height;
        float width;
        float glassCost;
        float trimCost;
        float numWindows;

        // declare String variables to hold the user's height, width, and
        // cost input
        String stringHeight;
        String stringWidth;
        String stringGlassCost;
        String stringTrimCost;
        String stringNumberWindows;

        // declare other variables
        float areaOfWindow;
        float cost, totalCost;
        float perimeterOfWindow;

        // declare and initialize the Scanner
        Scanner myScanner = new Scanner(System.in);

        // get input from the user
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width:");
        stringWidth = myScanner.nextLine();
        System.out.println("Please enter glass cost:");
        stringGlassCost = myScanner.nextLine();
        System.out.println("Please enter trim cost:");
        stringTrimCost = myScanner.nextLine();
        System.out.println("Please enter the number of windows:");
        stringNumberWindows = myScanner.nextLine();

        // convert String values of height, trim cost, glass cost and width to float values
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        glassCost = Float.parseFloat(stringGlassCost);
        trimCost = Float.parseFloat(stringTrimCost);
        numWindows = Float.parseFloat(stringNumberWindows);

        // calculate the area of the window
        areaOfWindow = height * width;

        // calculate the perimeter of the window
        perimeterOfWindow = 2 * (height + width);

        // calculate the total cost - use a hard-coded value
        // for material cost
        cost = ((glassCost * areaOfWindow) + (trimCost * perimeterOfWindow));
        totalCost = cost * numWindows;

        // display the results to the user
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Number of windows = " + numWindows);
        System.out.println("Cost = " + cost);
        System.out.println("Total Cost = " + totalCost);
    }
}
