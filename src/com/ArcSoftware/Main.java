package com.ArcSoftware;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner inputScanner = new Scanner(System.in);


    public static void main(String[] args) throws InterruptedException {
        String test1= "This";
        String test2="test";
        System.out.println("thisis" + test1 + test2);
        String[] stringArray = { "Barbara", "James", "Mary", "John",
                "Patricia", "Robert", "Michael", "Linda" };
        Arrays.sort(stringArray, String::compareToIgnoreCase);



    }
}




