import java.util.Scanner;

/**
 * Created by marcking2 on 7/16/17.
 */
public class AblayIxsay {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String words;   //for original input from user
        String wordscopy;   //used to perform manipulation of string
        String pigVersion;  //used to store result of manipulation from pigtrans method
        boolean goodstr;

        System.out.print("Welcome to Pig Latin Translator!");

        //make code to verify text has been entered


            System.out.println("Enter a line to be translated (500 characters or less): ");
            do {
                words = "The way is 99% clear!";    //scnr.nextLine(); //<<<fixme change back to the input scanner
                if (!words.length() >= 500){
                    goodstr = false;
                }
                else if ((words.charAt(0)).equals(" "))

                goodstr = true;
            }while (goodstr = false);

            wordscopy = words;
            wordscopy = wordscopy.toLowerCase();    //convert string copy to lower case



        pigVersion = pigtrans(wordscopy, words);    /*send string copy  and original string to pigtrans. Original string is used to compare capitol
        letter placement */
        System.out.println(pigVersion);

        System.out.println("Good so far!");
    }

    public static String pigtrans(String convertcopy, String origwords){
        //^^^method to convert string copy to pig latin
    String converted;
    char finalString [] = new char [500];


    int count = convertcopy.length();   //counts the number of chars in the convert copy to set the size of
        char origstrArray[] = new char [count];     //creates an array of the original string
        char charArray[] = new char [count];    //creates array to the exact size of the string sent

    origwords.getChars(0, count, origstrArray, 0 );
    //^^^moves (count) number of chars in the string to the array in sequential order
    convertcopy.getChars(0, count, charArray, 0 );
    //^^^moves (count) number of chars in the string to the array in sequential order



    System.out.printf("\n\n\nThere are %s chars in this string.", count);
    System.out.print("\n\n\nMETHOD copy of string: ");    //used to verify the contents of the array
    for (char character : charArray ){
        System.out.print(character);
    }System.out.print("\n");

    System.out.print("\n\n\nMETHOD original string: ");    //used to verify the contents of the array
    for (char origcharacter : origstrArray ){
        System.out.print(origcharacter);
    }System.out.println("\n");

    convertcopy = new String(charArray);

    converted = convertcopy;
    return converted;
    }
}
