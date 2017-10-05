package com.ArcSoftware;

import java.util.Scanner;

public class Candles {

    static int birthdayCakeCandles(int n, int[] ar) {
        int max = 0;
        for (int i: ar) {
            max = (max > i) ? max: i;
        }
        int count = 0;
        for (int i: ar) {
            count = (i != max)? count: count + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
