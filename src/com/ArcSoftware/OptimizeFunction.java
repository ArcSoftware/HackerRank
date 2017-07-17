package com.ArcSoftware;

/**
 * Created by Jake on 7/17/17.
 * Was not able to solve this one,
 * Problem is the double for loops.
 * Solution is probably a hashmap finding like values and subtracting the furthest apart index values.
 */
public class OptimizeFunction {
    public static void main(String[] args) {
        int[] a = new int[] {2, 3, 2};
        System.out.print(solution(a));
    }
    public static int solution(int[] A) {
        int N = A.length;
        int result = 0;
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (A[i] == A[j])
                    result = Math.max(result, Math.abs(i - j));
        return result;
    }
}
