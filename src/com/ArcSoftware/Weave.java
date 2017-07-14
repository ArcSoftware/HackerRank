package com.ArcSoftware;

/**
 * Created by Jake on 5/3/17.
 */
public class Weave {
    public static String weaveCreate(String input, int count) {
        StringBuilder sb = new StringBuilder(input);

        for (int i = 0; i < sb.length(); i++) {
            if(i % count == 0) {
                sb.setCharAt(i, 'x');
            }
        }
        return sb.toString();
    }
}
