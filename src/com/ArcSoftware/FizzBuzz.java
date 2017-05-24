package com.ArcSoftware;

import java.util.Scanner;

/**
 * Take in an input;
 * If the input is divisible by 5, print "fizz"
 * If the input is divisible by 7, print "buzz"
 * If the input is divisible by both 5 and 7, print "fizzbuzz"
 * If divisible by neither, return the number.
 */

public class FizzBuzz {
    public static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Please enter your number:");
            int input = Integer.valueOf(inputScanner.nextLine());
            if (input > 0) {
                System.out.println("Solve using conditional operators: " + cos(input));
                System.out.println("Solve using if statement: " + ifStatements(input));
            } else {
                System.err.println("Your input was not a valid input");
            }
        }
    }
    public static String cos(int input) {
        String answer = (input % 7 == 0) && (input % 5 == 0) ? "fizzbuzz":
                input % 7 == 0 ? "fizz":
                        input % 5 == 0 ? "buzz":
                                String.valueOf(input);
        return answer;
    }
    public static Object ifStatements(int input) {
        if (input % 7 == 0 && input % 5 == 0) {
            return "fizzbuzz";
        } else if (input % 7 == 0) {
            return "fizz";
        } else if (input % 5 == 0) {
            return "buzz";
        } else {
            return input;
        }
    }
}
