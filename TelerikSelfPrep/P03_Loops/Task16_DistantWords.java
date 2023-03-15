package P03_Loops;

import java.util.Scanner;

public class Task16_DistantWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine(); // consume the remaining newline character

        int totalDistance = 0; // variable to store the total distance

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();

            int distance = 0; // variable to store the distance for the current word

            // loop through each character in the word
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                distance += (int) c - 96; // calculate the position in the alphabet and add it to the distance
            }

            totalDistance += Math.abs(distance - target); // add the absolute difference to the total distance
            System.out.println(word + " " + Math.abs(distance - target)); // print the word and its distance
        }

        double averageDistance = (double) totalDistance / n; // calculate the average distance
        System.out.printf("%.2f", averageDistance); // print the average distance rounded to two decimal places
    }
}

