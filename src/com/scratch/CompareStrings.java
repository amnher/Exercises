package com.scratch;

public class CompareStrings {
    public static void main(String[] args) {
        String stringOne = "aaa";
        String stringTwo = "Zzz";
        String stringThree = "grapes";

        int result = 0;
        result = stringOne.compareTo(stringTwo);
        if (result == 0) {
            System.out.println( stringOne + " equals " + stringTwo);
        } else if (result < 0) {
            System.out.println( stringOne + " is less than (before) " +
                    stringTwo);
        } else {
            System.out.println( stringOne + " is greater than (after) " +
                    stringTwo);
        }
        result = stringThree.compareTo(stringTwo);
        if (result == 0) {
            System.out.println( stringThree + " equals " + stringTwo);
        } else if (result < 0){
            System.out.println( stringThree + " is less than (before) " +
                    stringTwo);
        } else {
            System.out.println( stringThree + " is greater than (after) " +
                    stringTwo);
        }
    }
}
