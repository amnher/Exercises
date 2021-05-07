package com.lesson6;
import java.util.Scanner;
public class AddValidation {
    public static void main(String[] args) {
        // declare variables for height and width
        float height;
        float width;
        float glassCost;
        float trimCost;
        float numWindows;

        // declare String variables to hold the user's height, width, and
        // cost input
        String stringHeight = "";
        String stringWidth = "";
        String stringGlassCost = "";
        String stringTrimCost = "";
        String stringNumberWindows = "";

        // declare other variables
        float areaOfWindow;
        float cost, totalCost;
        float perimeterOfWindow;

        // declare and initialize the Scanner
        Scanner myScanner = new Scanner(System.in);
        AddValidation ck = new AddValidation();

        // get input from the user
        System.out.println("Please enter window height:");
        height = ck.convertValidate(stringHeight);
        System.out.println("Please enter window width:");
        width = ck.convertValidate(stringWidth);
        System.out.println("Please enter glass cost:");
        glassCost = ck.convertValidate(stringGlassCost);
        System.out.println("Please enter trim cost:");
        trimCost = ck.convertValidate(stringTrimCost);
        System.out.println("Please enter the number of windows:");
        numWindows = ck.convertValidate(stringNumberWindows);







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

    float convertValidate(String input) {
        float num = 0;
        boolean isValid = false;
        Scanner sc = new Scanner(System.in);

        do {
            try
            {
                input = sc.nextLine();
                num = Float.parseFloat(input);
                isValid = true;

            } catch (NumberFormatException ex) {
                System.out.println("Please enter a valid value");
            }
        } while(!isValid);

        return num;
    }
}
