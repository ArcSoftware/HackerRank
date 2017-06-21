package com.ArcSoftware;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static Scanner inputScanner = new Scanner(System.in);


    public static void main(String[] args) throws InterruptedException {
        String time = Instant.now().atZone(ZoneId.of("UTC-4")).format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(time);
    }
}




