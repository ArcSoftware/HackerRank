package com.ArcSoftware;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jake on 5/4/17.
 */
public class Desireable {
    public static Integer desire(String input) {
        Pattern p = Pattern.compile("(?!=h{1,2})(r)(?=h{1,2})");
        Matcher m = p.matcher(input);
        int maxLength = 0;

        while (m.find()) {
            int matchLength = m.group(0).length();

            if (matchLength > maxLength) {
                maxLength = matchLength;
            }
        }

        return maxLength;
    }
}
