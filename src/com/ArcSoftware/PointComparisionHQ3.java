package com.ArcSoftware;

import java.util.Scanner;

/**
 * Created by Jake on 5/9/17.
 */
public class PointComparisionHQ3 {
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        int alice = 0;
        int bob = 0;
        int[] score = new int[2];
        int[] a = new int[3];
        int[] b = new int[3];
        a[0] = a0;
        a[1] = a1;
        a[2] = a2;
        b[0] = b0;
        b[1] = b1;
        b[2] = b2;


        for (int i = 0; i < 3; i ++) {
            if (a[i] > b[i]) {alice++;}
            else if (a[i] < b[i]) {bob++;}
        }
        score[0] = alice;
        score[1] = bob;
        return score;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        String separator = "", delimiter = " ";
        for (Integer value : result) {
            System.out.print(separator + value);
            separator = delimiter;
        }
        System.out.println("");


    }
}