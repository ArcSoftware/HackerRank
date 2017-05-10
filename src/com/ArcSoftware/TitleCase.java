package com.ArcSoftware;

/**
 * Created by Jake on 5/1/17.
 */
public class TitleCase {

    public static String titleCase(String input) {
        boolean shouldBeCapitalized = true;
        StringBuilder sb = new StringBuilder(input);

        for (int i = 0; i < sb.length(); i++) {
            Character currentCharacter = sb.charAt(i);

            if(shouldBeCapitalized) {
                sb.setCharAt(i, Character.toTitleCase(currentCharacter));
            } else {
                sb.setCharAt(i, Character.toLowerCase(currentCharacter));
            }


        shouldBeCapitalized = Character.isSpaceChar(currentCharacter); //equals below statement.
//            if (Character.isSpaceChar(currentCharacter)) {
//                shouldBeCapitalized = true;
//            } else {
//                shouldBeCapitalized = false;
//
//                }
            }
            return sb.toString();
        }



}
