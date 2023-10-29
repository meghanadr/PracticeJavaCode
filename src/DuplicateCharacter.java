import java.util.Scanner;

public class DuplicateCharacter {
    public static void main(String[] args) {

        String string1 = "Meghana";
        int count;

        //Converts given string into character array
        char string[] = string1.toCharArray();

        System.out.println("Duplicate characters in a given string: ");
        //Counts each character present in the string
        for (int i = 0; i < string.length; i++) {

            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j]) {

                    System.out.println(string[i]);

                }
            }
            //A character is considered as duplicate if count is greater than 1

        }
    }
}