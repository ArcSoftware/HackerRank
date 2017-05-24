package com.ArcSoftware;

import java.util.List;

/**
 * Created by Jake on 5/24/17.
 */
public class Sonny extends Robot {
    public Sonny() {
        version = "2.0";
    }

    @Override
    public List<String> getLaws() {
        super.getLaws().add("A robot may not harm humanity, or, by inaction, allow humanity to come to harm.");
        return super.getLaws();
    }
}
