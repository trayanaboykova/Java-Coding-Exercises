package P05_MockExams.Exam05;

import java.util.Scanner;

public class Task03_HeaviestWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String heaviestWord = "";
        int heaviestWeight = 0;
        for (int i = 0; i < n; i++) {
            String word = input.nextLine();
            int weight = calculateWeight(word);
            if (weight > heaviestWeight) {
                heaviestWord = word;
                heaviestWeight = weight;
            }
        }
        System.out.println(heaviestWeight + " " + heaviestWord);
    }

    public static int calculateWeight(String word) {
        int weight = 0;
        for (char c : word.toCharArray()) {
            weight += Character.toLowerCase(c) - 'a' + 1;
        }
        return weight;
    }
}



//Heaviest Word
//The Academy needs you! We have this list of words and we have to find the heaviest one, but we haven't a clue how to approach the problem.
//
//Word heaviness is determined by summing all the letters in it. The letter value corresponds to the position in the English alphabet - where a is 1 and z is 26. For example, the word alpha has a weight of 1 + 12 + 16 + 8 + 1 = 38.
//Treat lower- and uppercase letters the same, so a and A both have the value 1.
//
//Your task is to create a program that finds the heaviest word and prints its weight and the word itself to the standart output.
//
//Input
//On the first line, N - the number of words to follow.
//On the next N lines - a single word.
//Output
//The heaviest weight and the heaviest word, separated by a space.
//Constraints
//5 <= N <= 500
//3 <= letters in a word <= 20
