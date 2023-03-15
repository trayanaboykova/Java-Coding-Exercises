package P05_MockExams.Exam03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task01_RepeatingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        Map<Integer, Integer> counts = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        int mostCommon = -1;
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount || (count == maxCount && num < mostCommon)) {
                maxCount = count;
                mostCommon = num;
            }
        }

        System.out.println(mostCommon);
    }
}


//Repeating Numbers
//Write a program that accepts an array of integers and returns the one that occurs the most times. If there are two numbers that occur the same amount of times, return the smaller of the two.
//
//Input
//Read from the standard input;
//The number N is on the first line;
//An integer between 1 and 10 is written on each of the next N lines;
//The input data will always be valid and in the format described. There is no need to check it explicitly;
//Output
//Print to the standard output;
//On the only output line you must print the number that occurs the most;
//Constraints
//The number N is a positive integer between 1 and 100 000, inclusive;
//The list of numbers consists of positive integers between 1 and 10, inclusive;
