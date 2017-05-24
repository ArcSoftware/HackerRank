package com.ArcSoftware;

// write a class called "Sonny" that inherits from "Robot".
// Override Sonny's getLaws() method to print out a fourth
// law of robotics.

// the fourth law is: A robot may not harm humanity, or, by inaction, allow humanity to come to harm.

import java.util.ArrayList;
import java.util.List;

// when a Sonny Object is created, also make sure his version field
// is set to "2.0";
public abstract class Robot {
    private List<String> laws;
    protected String version;

    public Robot() {
        version = "1.1";
        laws = new ArrayList<>();
        laws.add("A robot may not injure a human being or, through inaction, allow a human being to come to harm.");
        laws.add("A robot must obey orders given it by human beings except where such orders would conflict with the First Law.");
        laws.add("A robot must protect its own existence as long as such protection does not conflict with the First or Second Law.");
    }

    public List<String> getLaws() {
        return laws;
    }
}
