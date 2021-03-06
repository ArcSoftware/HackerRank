package com.ArcSoftware;

//Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.
//
//        Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.
//
//        Input Format
//
//        The first line contains an integer, , denoting the size of the array.
//        The second line contains  space-separated integers describing an array of numbers .
//
//        Output Format
//
//        You must print the following  lines:
//
//        A decimal representing of the fraction of positive numbers in the array compared to its size.
//        A decimal representing of the fraction of negative numbers in the array compared to its size.
//        A decimal representing of the fraction of zeroes in the array compared to its size.
//        Sample Input
//
//        6
//        -4 3 -9 0 4 1
//        Sample Output
//
//        0.500000
//        0.333333
//        0.166667
//        Explanation
//
//        There are  positive numbers,  negative numbers, and  zero in the array.
//        The respective fractions of positive numbers, negative numbers and zeroes are ,  and , respectively.

import java.util.Scanner;

public class HRWPlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = Integer.valueOf(in.nextLine());
        String[] input = in.nextLine().split(" ");
            solveWOF(length, input);
        }


        //solve with conditionals
        public static void solveWOF(Integer length, String[] input) {
            double pos = 0, neg = 0, zero = 0;
            for (int i=0; i<length; i++) {
                Double test = Double.valueOf(input[i]);
                pos += (test > 0) ? 1:0;
                neg += (test < 0) ? 1:0;
                zero += (test == 0) ? 1:0;
            }
            System.out.printf("%.6f \n%.6f \n%.6f", (pos/length), (neg/length), (zero/length));
        }


//    //solve with for loop
//    public static void solve(int length, String[] input) {
//        double pos = 0;
//        double neg = 0;
//        double zero = 0;
//        for (int i = 0; i < length; i++){
//            int test = Integer.valueOf(input[i]);
//            if (test > 0) {pos++;}
//            else if (test < 0) {neg++;}
//            else {zero++;}
//        }
//        System.out.printf("%.6f \n%.6f \n%.6f", (pos/length), (neg/length), (zero/length));
//    }
}
