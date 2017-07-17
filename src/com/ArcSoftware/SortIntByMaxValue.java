package com.ArcSoftware;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Created by Jake on 7/17/17.
 */
public class SortIntByMaxValue {
    public static int solution(int N) {
        String s = String.valueOf(N);
        ArrayList al = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            al.add(s.charAt(i));
        }
        Collections.sort(al);
        Collections.reverse(al);
        Object a = al.stream()
                .map(Object::toString)
                .collect(Collectors.joining(""));
        return Integer.valueOf(String.valueOf(a));
    }
}
