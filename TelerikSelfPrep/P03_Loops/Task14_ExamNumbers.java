package P03_Loops;

import java.util.Scanner;

public class Task14_ExamNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int target = sc.nextInt();

        // loop through all numbers in the interval
        for (int i = start; i <= end; i++) {
            int sum = 0; // variable to store the sum of digits
            int num = i; // variable to store the current number

            // loop through each digit of the current number
            while (num > 0) {
                sum += num % 10; // add the current digit to the sum
                num /= 10; // remove the current digit from the number
            }

            // if the sum of digits equals the target, print the number
            if (sum == target) {
                System.out.println(i);
            }
        }
    }
}
