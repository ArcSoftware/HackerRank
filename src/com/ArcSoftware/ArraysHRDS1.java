package com.ArcSoftware;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Jake on 6/23/17.
 * Input Format

 The first line contains an integer,  (the number of integers in ).
 The second line contains  space-separated integers describing .

 Constraints



 Output Format

 Print all  integers in  in reverse order as a single line of space-separated integers.

 Sample Input

 4
 1 4 3 2

 Sample Output

 2 3 4 1

 */
public class ArraysHRDS1 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int length = Integer.valueOf(inputScanner.nextLine());
        String input = inputScanner.nextLine();



        //below tests out but doesn't pass tests on website for some reason...
        ArrayList reversed = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            reversed.add(input.charAt(i));
        }
        Collections.reverse(reversed);
        for (int i = 0; i < reversed.size(); i++) {
            System.out.print(reversed.get(i));
        }
    }
}
