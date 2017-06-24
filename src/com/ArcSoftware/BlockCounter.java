package com.ArcSoftware;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jake on 5/2/17.
 */
public class BlockCounter {
    public static int maxBlock(String word) {
        Pattern p = Pattern.compile("(.)\\1*");
        Matcher m = p.matcher(word);

        int maxLength = 0;

        while (m.find()) {
            int matchLength = m.group(0).length();
            maxLength = matchLength > maxLength ? matchLength : maxLength;
        }

        return maxLength;
    }

}
