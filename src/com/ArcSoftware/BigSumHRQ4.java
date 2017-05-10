package com.ArcSoftware;

import java.util.Scanner;

/**
 * Created by Jake on 5/10/17.
 */
public class BigSumHRQ4 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner inputScanner = new Scanner(System.in);

    int length = Integer.valueOf(inputScanner.nextLine());
    String[] input = inputScanner.nextLine().split(" ");

    System.out.println(addThis(input, length));


    }
    public static Long addThis(String[] inputArray, int length) {
        Long sum = 0l;
        for (int i = 0; i<length; i++) {
            sum += Long.valueOf(inputArray[i]);
        }
        return sum;
    }
}
