/**
 * Created by marcking2 on 7/17/17.
 */

import java.util.*;
import java.util.Scanner;

public class AblayIxsay {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String words;   //for original input from user
        String wordscopy;   //used to perform manipulation of string
        String pigVersion;  //used to store result of manipulation from pigtrans method
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

        wordscopy = words;

        pigVersion = pigtrans(wordscopy);   /*send string copy to pigtrans. */
        System.out.println("\n\nThis is your translation: " + pigVersion);
    }

    public static String pigtrans(String convertcopy) {
        //^^^method to convert string copy to pig latin
        String wordbk = "";

        StringTokenizer word = new StringTokenizer(convertcopy);

        while (word.hasMoreTokens()) {
            wordbk = convWord(word.nextToken());

            //System.out.print(word.nextToken() + ' ');

        }

        return wordbk + " ";
    }

    public static String convWord(String translateThis) {

        // code by Monique West
        String translatedWord = " ";
        char n = 0;
        translateThis = translateThis.toLowerCase();

        char v = translateThis.charAt(0);
        if (v == 'a' || v == 'e' || v == 'o' || v == 'i' || v == 'u') {
            //process Pig Latin with vowel

            translatedWord = translateThis + "way";
        }
else if (Character.isDigit(n));
         else {

            for (int i = 0; i < translateThis.length(); i++) {

                char d;
                d = translateThis.charAt(i);
                if (d == 'a' || d == 'e' || d == 'o' || d == 'i' || d == 'u') {
                    //process pig Latin with consonant
                    translatedWord = translateThis.substring(i);
                    translatedWord += translateThis.substring(0, i);
                    translatedWord = translatedWord + "ay";
                    break;
                }


            }

        }
        return translatedWord;
    }
}