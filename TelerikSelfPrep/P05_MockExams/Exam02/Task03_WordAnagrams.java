package P05_MockExams.Exam02;

import java.util.Arrays;
import java.util.Scanner;

public class Task03_WordAnagrams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String w = input.nextLine().trim().toLowerCase();
        int n = Integer.parseInt(input.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String word = input.nextLine().trim().toLowerCase();
            if (isAnagram(w, word)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static boolean isAnagram(String s1, String s2) {
        // Remove whitespace and sort characters in each string
        char[] arr1 = s1.replaceAll("\\s", "").toCharArray();
        char[] arr2 = s2.replaceAll("\\s", "").toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted character arrays
        return Arrays.equals(arr1, arr2);
    }
}


//Word Anagrams
//You are given a word and a list of words. Your task is to check whether all the words from the list are anagrams of the word.
//
//An anagram is a word formed by rearranging the letters of another word:
//
//The following are anagrams of "anagram":
//"gramana", "aaagrnm", "margana", etc..
//The following are NOT anagrams of "anagram":
//"aanagram", "aaagram", "anagra", "anagrama", "yxy"
//Input
//Read from the standard input
//
//On the first line, find W - the word to check against;
//On the second line, find N - the number of words in the list of words WORDS;
//On the next N lines, the words from WORDS;
//Output
//Print to the standard output
//
//For each word from WORDS print either:
//"Yes", if the word is an anagram of W;
//"No", if the word is NOT an anagram of W;
