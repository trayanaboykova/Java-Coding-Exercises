package P03_Loops;

import java.util.Scanner;

public class Task15_VowelToLengthRatio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of foods
        sc.nextLine(); // consume the rest of the first line

        String bestFood = "";
        double bestRatio = Double.MAX_VALUE;
        int mostVowels = Integer.MIN_VALUE;
        int mostLetters = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            String food = sc.nextLine();
            int numVowels = countVowels(food);
            int numLetters = food.length();
            double ratio = (double) numVowels / numLetters;

            if (ratio < bestRatio ||
                    (ratio == bestRatio && numVowels > mostVowels) ||
                    (ratio == bestRatio && numVowels == mostVowels && numLetters > mostLetters)) {
                // update best food
                bestFood = food;
                bestRatio = ratio;
                mostVowels = numVowels;
                mostLetters = numLetters;
            }
        }

        System.out.printf("%s %d/%d%n", bestFood, mostVowels, mostLetters);
    }

    // helper method to count the number of vowels in a string
    private static int countVowels(String s) {
        int count = 0;
        String vowels = "aouei";
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}
