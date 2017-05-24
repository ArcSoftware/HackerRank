package com.ArcSoftware;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Jake on 5/17/17.
 */
public class LamdaChallenge {

    public static void main(String [] a)  {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        System.out.println("Print all numbers:");
        evaluate(list, (n) -> true);
        System.out.println("");

        System.out.println("Print no numbers:");
        evaluate(list, (n) -> false);
        System.out.println("");

        System.out.println("Print even numbers:");
        evaluate(list, (n) -> n%2 == 0 );
        System.out.println("");

        System.out.println("Print odd numbers:");
        evaluate(list, (n) -> n%2 == 1 );
        System.out.println("");

        System.out.println("Print numbers greater than 5:");
        evaluate(list, (n) -> n > 5 );


    }

    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
//        for(Integer n: list)  {
//            if(predicate.test(n)) {
//                System.out.println(n + " ");
//            }
//        }
        //going to try and write this as lambda and shorthand without loops.
        list.forEach(n -> {
            String out = predicate.test(n) ? n + " " : "";

            System.out.print(out);
        });
    }
}
