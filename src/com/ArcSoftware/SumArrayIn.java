package com.ArcSoftware;

import java.util.Scanner;

/**
 * Created by Jake on 5/9/17.
 */
public class SumArrayIn { //hacker rank Q2
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner inputScanner = new Scanner(System.in);
        // read things from input
        int length = Integer.valueOf(inputScanner.nextLine());
        String[] array = inputScanner.nextLine().split(" ");
        // calculate
        int solution = calculateSum(array, length);
        // print to output
        System.out.println(solution);
    }


    public static int calculateSum(String[] array, int length) {
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += Integer.valueOf(array[i]);
        }
        return sum;
    }
}

