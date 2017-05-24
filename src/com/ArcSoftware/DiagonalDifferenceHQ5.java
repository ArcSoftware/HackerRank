package com.ArcSoftware;

import java.util.Scanner;

/**
 * Created by Jake on 5/10/17.
 */
public class DiagonalDifferenceHQ5 {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        int sideLength = Integer.valueOf(inputScanner.nextLine());
        int[][] matrix = new int[sideLength][sideLength];
//        11 2 4
//        4 5 6
//        10 8 -12
        // initialize matrix with ints from stdin
        for (int i = 0;i < sideLength;i++) {
            for (int j = 0;j < sideLength;j++) {
                matrix[i][j] = inputScanner.nextInt();
            }
        }





//        int arrayCount = 0;
//
//        for (int i = 0; i < numOfArrays; i++) {
//            String name = String.valueOf(arrayCount);
//            String[] name = inputScanner.nextLine().split(" ");
//            arrayCount++;
//        }


    }
}
