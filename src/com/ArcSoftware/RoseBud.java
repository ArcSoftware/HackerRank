package com.ArcSoftware;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jake on 4/26/17.
 */
public class RoseBud {
    //check if input string starts with rosebud and ends with 1. If it does, for every ! in between, give a dollar
    //to the user.

    public static int rosebud(String input) {

        //using regular expression
        Pattern p = Pattern.compile("rosebud(!+)1"); //compiles pattern object of capture group in ()
        Matcher m = p.matcher(input); //returns how many ! marks are in the string

        if(!m.matches()) { //if matches doesn't have a value
            return 0; //return 0
        }
        return m.group(1).length();  //return length of matcher object

        //not using RE
//        int dollarCount = 0;
//        if(input.startsWith("rosebud") && input.endsWith("1")) {
//            int idx = input.indexOf("!");
//            if(idx != -1) { if it is grater than 0 it exists.
//                //we have found an exclamation point
//                while (input.charAt(idx) == '!') {
//                    dollarCount++;
//                    idx++;
//                }
//            }
//        } doesnt work with rosebud!!pants!!1
//        return dollerCount;
    }
}
