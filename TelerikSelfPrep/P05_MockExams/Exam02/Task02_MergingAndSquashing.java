package P05_MockExams.Exam02;

import java.util.Scanner;

public class Task02_MergingAndSquashing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int sum = 0;

        int[] mergingNumbers = new int[n - 1];

        for (int y = 1; y < array.length; y++) {
            n1 = ((array[y - 1]) % 10 * 10);
            n2 = ((array[y] / 10));
            sum = n1 + n2;
            mergingNumbers[y - 1] = sum;
        }

        int[] squashedNumbers = new int[n - 1];

        for (int q = 1; q < array.length; q++) {
            n1 = array[q - 1] / 10 * 100;
            int mid = ((array[q - 1] % 10) + (array[q] / 10));

            if (mid > 10) {
                n2 = (mid - 10) * 10;
            }
            if (mid < 10) {
                n2 = mid * 10;
            }
            if (mid == 10) {
                n2 = 0;
            }
            n3 = (array[q] % 10);
            sum = n1 + n2 + n3;

            squashedNumbers[q - 1] = sum;
        }

        for (int item : mergingNumbers) {
            System.out.print(item + " ");
        }
        System.out.println();

        for (int item : squashedNumbers) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

//Merging and Squashing
//We have the following operations defined for two-digit numbers. There are two possible ways of merging them:
//
//Merging ab and cd produces bc
//42 merged with 17 produces 21
//17 merged with 42 produces 74
//Squashing ab and cd produces a(b+c)d - the middle digit is the sum of b and c
//42 squashed with 17 produces 437
//39 squashed with 57 produces 347 (9 + 5 = 14, we use only the 4)
//You have a sequence of N two-digit numbers. Your task is to merge and squash each pair of adjacent numbers.
//
//Input
//All input data is read from the standard input
//
//On the first line, you will receive an integer N
//On the next N lines you will receive N two-digit numbers
//Each number will be on a separate line
//Output
//The output data is printed on the standard output
//
//On the first output line print the merged numbers
//
//There should be N - 1 of them
//Separate them by spaces
//On the second output line print the squashed numbers
//
//There should be N - 1 of them
//Separate them by spaces
//Constraints
//2 <= N <= 1000
//Numbers will consist of two non-zero digits
//The input data will always be correct and there is no need to check it explicitly
