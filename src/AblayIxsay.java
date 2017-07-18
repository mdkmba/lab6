/**
 * Created by marcking2 on 7/17/17.
 */

import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

public class lab6 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String words;   //for original input from user
        String wordscopy;   //used to perform manipulation of string
        String pigVersion;  //used to store result of manipulation from pigtrans method
        String blank = " ";
        int goodstr = 0;
        boolean hasNum = false;

        System.out.print("\n\n\nWelcome to Pig Latin Translator!\n\n\n");

        //make code to verify text has been entered

        do {
            System.out.println("\n\nEnter a line to be translated (500 characters or less): ");
            words = scnr.nextLine();
            if (words.length() >= 500) {   //must be less than 500 chars
                System.out.println("Too many characters.");
                goodstr = 0;
            } else if (words.charAt(0) == ' ') {
                System.out.println("You can't start with a blank space.");  //must not start with blank space
                goodstr = 0;
            } else {
                goodstr = 1;
            }
        } while (goodstr == 0);
        words = "The way is 99% clear";  //fixme remove this
        wordscopy = words;

        pigVersion = pigtrans(wordscopy);   /*send string copy to pigtrans. */
        System.out.println(pigVersion);
    }

    public static String pigtrans(String convertcopy) {
        //^^^method to convert string copy to pig latin
        String wordbk = "";

        StringTokenizer word = new StringTokenizer(convertcopy);

        while (word.hasMoreTokens()) {
            wordbk = convWord(word.nextToken());

            //System.out.print(word.nextToken() + ' ');

        }

        return wordbk;
    }

    public static String convWord(String wrd2add) {

        // code by Monique West
        String newPig = " ";

        char v = wrd2add.charAt(0);
        if (v == 'a' || v == 'e' || v == 'o' || v == 'i' || v == 'u') {
            //System.out.println("Vowel: " + wrd2add);
            //process Pig Latin with vowel

            newPig = wrd2add + "way";
            //System.out.print("Your translated word is: " + newPig);

        } else {
            System.out.println("Consonant: " + wrd2add);
            for (int i = 0; i < wrd2add.length(); i++) {

                char p = wrd2add.charAt(i);
                if (p == 'a' || p == 'e' || p == 'o' || p == 'i' || p == 'u') {
                    //process pig Latin with consonant
                    newPig = wrd2add.substring(i);
                    newPig += wrd2add.substring(0, i);

                }newPig = newPig + "ay";

            }

        }return newPig;
    }
}