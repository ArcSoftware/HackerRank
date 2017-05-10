package com.ArcSoftware;

/**
 * Created by Jake on 4/24/17.
 */
public class Long {
    //finds the amount of back to back "x" in a string.
    public static int Longx(String x) {
        Integer xCount = 0; //counts amount of x, resets if not an x in a string.
        Integer max = 0; //max value of xCount
        for (int i = 0; i < x.length(); i++) {
            char currentChar = x.charAt(i);

            if (currentChar == 'x') {
                //we found an x!
                // increment xcount
                xCount++;
                //if xCount > max, update max
                if (xCount > max) {
                    max = xCount;
                }
            }
            else {
                xCount = 0;
            }

        }
        return max;
    }

}



