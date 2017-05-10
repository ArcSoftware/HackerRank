package com.ArcSoftware;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jake on 4/20/17.
 */
public class NarcissisticNumber {

    public static List<Integer> intToIntList(int in) { //creates list given numbers
        ArrayList<Integer> ints = new ArrayList<>(); //makes arraylist "ints"
        String inputString = String.valueOf(in); //creates a string value of "in"
        for(int i = 0; i < inputString.toCharArray().length; i++) { //loops arraylist till length is maxed
            ints.add(Integer.valueOf(String.valueOf(inputString.toCharArray()[i])));
        } //get char array value of "input string" index, get string value of char array, get intiger value of string, add it to arraylist
        return ints; //return "ints"
    }

    public static int narcissisticSum(List<Integer> in) { //sum of numbers
        int size = in.size(); //get size of input
        int sum = 0; // set sum to 0
        for(Integer n : in) { // create an array of "in" and call it "n"
            System.out.printf("%d^%d = %d\n",n, size, (int)Math.pow(n,size)); //print debug statement
            sum += (int)Math.pow(n,size); //cast int value of math statement (array to the power of size) and add to sum.
        }
        System.out.println("sum = "+sum);
        return sum;
    }

    public static boolean isANarcissisticNumber(int in) {
        return narcissisticSum(intToIntList(in)) == in; //return true or false based on two methods above.
    }
}

