package com.ArcSoftware;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jake on 4/27/17.
 */
public class Tester7 {

    public static int Recursion(int input) {
        System.out.println("The value of input:\n " + input);

        //base case
        if (input == 0) {
            return 0;
        }
        //find the last 7 in the number
        boolean found = (input % 10) == 7;

        return(found ? 1 : 0) + Recursion(input / 10);

//        if (found) {
//            return 1 + Recursion(input / 10);
//        } else {
//            return Recursion(input /10);
//        }

//        return Recursion(input);




// Pattern p = Pattern.compile("(7)");
//        Matcher m = p.matcher(input);
//
//        int found = 0;
//        while (m.find()) {
//            found++;
//        }
//        return found;
//
//
    }
}
