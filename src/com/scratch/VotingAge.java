package com.scratch;

public class VotingAge {
    public static void main(String[] args) {
        int age = 19;
        String result = "";

        result = (age >= 18) ? "You can register" : "You are not old enough to vote";
        System.out.println(result);
    }
}
