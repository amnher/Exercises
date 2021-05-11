package com.lesson8;
public class ForByFor {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if(j != 1 && i != 1) {
                        System.out.print("*");
                    } else {
                        if ( i == 1) {
                            if (j != 1) {
                                System.out.print("0");
                            } else {
                                System.out.print("#");
                            }
                        } else {
                            System.out.print("$");
                        }
                    }

                }
                System.out.print("|");
            }
            System.out.println("");
        }
    }
}
