package com.ArcSoftware;

/**
 * Created by Jake on 4/25/17.
 */
public class PancakeFlip {
    public static double probability() {
        int successful = 0;
        double chance = 0.8;

        for (int i = 0;i < 1000000;i++) {
            if (Math.random() < chance &&
                Math.random() < chance &&
                Math.random() < chance) {
                successful++;
            }
        }

        return Double.valueOf(successful) / 1000000;
    }

}
