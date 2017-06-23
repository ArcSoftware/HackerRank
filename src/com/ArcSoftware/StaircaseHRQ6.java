package com.ArcSoftware;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Jake on 6/23/17.
 * Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.

 Write a program that prints a staircase of size .

 Input Format

 A single integer, , denoting the size of the staircase.

 Output Format

 Print a staircase of size  using # symbols and spaces.

 Note: The last line must have  spaces in it.
 */
public class StaircaseHRQ6 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        Integer stackSize = Integer.valueOf(inputScanner.nextLine());
                stairCase(stackSize);
    }
    public static void stairCase(int stackSize) {
        ArrayList stack = new ArrayList<>();
            for(int i = 0; i < stackSize; i++) {
                stack.add(i, " ");
            }
            while(stackSize > 0) {
                stack.set((stackSize-1), "#");
                stackSize--;
                for(int i = 0; i < stack.size(); i++) {
                    System.out.print(stack.get(i));
                }
                System.out.print("\n");
            }
    }
}
//Completed the algorithm with this, probably not the best way to do it though. Would want to revisit this
//using recursion or String Builder.
