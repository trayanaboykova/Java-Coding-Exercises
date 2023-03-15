package P05_MockExams.Exam05;

import java.util.Scanner;

public class Task02_ChickenLatin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            char firstChar = word.charAt(0);
            if (isVowel(firstChar)) {
                result.append(word.substring(1));
                result.append(firstChar);
                result.append("che");
            } else {
                result.append(word);
                result.append("che");
            }
            if (word.length() % 2 == 0) {
                result.append("e");
            }
            result.append(" ");
        }
        System.out.println(result.toString().trim());
    }

    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}


//Chicken Latin
//Even though the Latin is considered dead language there are several variations of it still living in Shakespeare’s plays and programming tasks. I refer to Pig and Dog Latin.
//
//Today we’ll dive into the Chicken Latin. This specific dialect comes from Bulgarian South and the chickens there use "che" instead of "pi”.
//
//To translate one sentence, we need to take in consideration each word in it. The sentence consists of words, separated by only one space. Every word is composed only of lower or uppercase letters.
//
//The rules of Chicken Latin are:
//
//If a word begins with a vowel (a, e, i, o, u or A, E, I, O, U), remove the first letter and append it to the end, then add "che". If you have the word “orange” It translates to “rangeoche”
//If a word begins with a consonant (i.e. not a vowel), append "che" to the end of the word. For example, the word "chicken" becomes "chickenche".
//If the word has even number of letters append one more "e" to the end of it.
//Print the translated sentence.
//
//Input
//Read from the standard input:
//
//There is one line of input, a string:
//Hello there Amy
//Output
//Print to the standard output:
//
//One line of output - the translated sentence
//Helloche thereche myAche
//Constraints
//The sentence contains only uppercase, lowercase and spaces. Exactly one space between each word.
//1 <= sentence.length <= 150.
