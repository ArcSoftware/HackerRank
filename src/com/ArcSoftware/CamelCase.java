package com.ArcSoftware;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jake on 6/23/17.
 *

 Alice wrote a sequence of words in CamelCase as a string of letters, , having the following properties:

 It is a concatenation of one or more words consisting of English letters.
 All letters in the first word are lowercase.
 For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
 Given , print the number of words in  on a new line.

 Input Format

 A single line containing string .

 Constraints


 Output Format

 Print the number of words in string .

 Sample Input

 saveChangesInTheEditor
 Sample Output

 5
 Explanation

 String  contains five words:

 save
 Changes
 In
 The
 Editor
 Thus, we print  on a new line.
 */
public class CamelCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(camel(s));
    }

    public static int camel(String word) {
        Pattern p = Pattern.compile("([A-Z])");
        Matcher m = p.matcher(word);
        Integer uppers = word != "" ? 1 : 0;

        while (m.find()) {
           uppers++;
        }

        return uppers;
    }
}
