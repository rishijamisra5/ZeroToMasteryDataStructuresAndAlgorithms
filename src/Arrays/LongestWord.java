package Arrays;
//https://coderbyte.com/editor/Longest%20Word:Java
//Longest Word
//        Have the function LongestWord(sen) take the sen parameter being passed and return the longest word in the string.
//        If there are two or more words that are the same length, return the first word from the string with that length.
//        Ignore punctuation and assume sen will not be empty. Words may also contain numbers, for example "Hello world123 567"
//        Examples
//        Input: "fun&!! time"
//        Output: time
//        Input: "I love dogs"
//        Output: love

import java.util.Scanner;

public class LongestWord {

    public static String LongestWord(String sen) {
        // code goes here
        String regex = "\\s+|(?=\\p{Punct})|(?<=\\p{Punct})";
        String[] strArray = sen.split(regex);
        int maxLength = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (maxLength < strArray[i].length()) {
                maxLength = strArray[i].length();
                sen = strArray[i];
            }
        }
        return sen;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }

}
