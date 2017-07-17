import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * Created by marcking2 on 7/16/17.
 */
public class AblayIxsay {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String words;   //for original input from user
        String wordscopy;   //used to perform manipulation of string
        String pigVersion;  //used to store result of manipulation from pigtrans method
        String blank = " ";
        int goodstr = 0;

        System.out.print("\n\n\nWelcome to Pig Latin Translator!");

        //make code to verify text has been entered



            do {
                System.out.println("\n\nEnter a line to be translated (500 characters or less): ");
                words = scnr.nextLine();
                if (words.length() >= 500){   //must be less than 500 chars
                    System.out.println("Too many characters.");
                    goodstr = 0;
                }
                else if (words.charAt(0) == ' '){
                    System.out.println("You can't start with a blank space.");  //must not start with blank space
                    goodstr = 0;
                }else{
                    goodstr = 1;
                }
            }while (goodstr == 0);
            words = "The way is 99% clear!";  //fixme remove this
            wordscopy = words;

        pigVersion = pigtrans(wordscopy);   /*send string copy to pigtrans. */
        System.out.println(pigVersion);
    }

    public static String pigtrans(String convertcopy){
        //^^^method to convert string copy to pig latin
    String converted;
        ArrayList<String> arrayList = new ArrayList<>();//list array for concatenating wrd2add strings as they are generated

    int count = convertcopy.length();   //counts the number of chars in the convert copy to set the size of the string
    boolean hasNum = false;
        String wrd2add = (""); //will add wrd2add.toLowerCase(); later

        for (int i = 0; i < count; i++){
            char x = convertcopy.charAt(i);
            if (x != ' '){
                if (Character.isDigit(x)){
                    hasNum = true;

                }
                else if (!Character.isDigit(x)) {
                    hasNum = false;
                }
                wrd2add += x;
            }
            if (hasNum){
                return wrd2add;
            }

            else if (!hasNum){
                wrd2add = convWord(wrd2add);
                return wrd2add;
            }

                wrd2add = "";
    }


    }


    public static String convWord (String wrd2add) {
        boolean make1stUpper = false;
        boolean consonant = false;
        String wrd2add2 = "";

        int count = wrd2add.length();

        if (Character.isUpperCase(wrd2add.charAt(0))) {
            make1stUpper = true;
        }
        String wrd2addB = wrd2add.toLowerCase();

        for (int i = 0; i < count; i++) {
            char f = wrd2addB.charAt(0);
            char x = wrd2addB.charAt(i);
            if (x != 'a' && x != 'e' && x != 'i' && x != 'o' && x != 'u') {
                consonant = true;
                wrd2add2 = wrd2addB.substring(1) + f;
            } else {
                wrd2add2 = wrd2addB + x;

            }


        }
        if (make1stUpper) {
            wrd2add2 = wrd2add2.substring(0, 1).toUpperCase() + wrd2add2.substring(1);
        }
        if (consonant) {
            wrd2add2 = wrd2add + "ay";
        } else {
            wrd2add2 = wrd2add + "way";
        }
        return wrd2add2;
    }
}

//char charArray[] = new char [count];    //creates array to the exact size of the string sent

//    convertcopy.getChars(0, count, charArray, 0 );
//^^^moves (count) number of chars in the string to the array in sequential order