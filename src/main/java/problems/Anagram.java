package problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String str1 = "SALT";
        String str2 = "LAST";
        System.out.println("Anagram?? :"+isAnagram(str1, str2));
    }
    private static boolean isAnagram(String word, String anagram) {

        boolean isAnagram = true;
        if (word.length() != anagram.length()){
            isAnagram = false;
        }else {
            int[] array = new int[128];
            Arrays.fill(array, 0);
            for (int i = 0; i < word.length(); i++) {
                array[word.charAt(i)] = array[word.charAt(i)] + 1;
            }
            for (int i = 0; i < anagram.length(); i++) {
                array[anagram.charAt(i)] = array[anagram.charAt(i)] - 1;
            }
            for (int i = 0; i < 128; i++) {
                if (array[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }
        }
        return isAnagram;
    }

    public void findAnagram(String word){
        // find whether this word is anagram or not
    }
}
