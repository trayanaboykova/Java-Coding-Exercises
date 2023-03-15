package P05_MockExams.Exam01;

import java.util.Scanner;

public class Task03_BalancedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        boolean balanced = true;

        while (balanced) {
            String input = scanner.nextLine();
            if (input.length() != 3) {
                balanced = false;
            } else {
                int first = Character.getNumericValue(input.charAt(0));
                int second = Character.getNumericValue(input.charAt(1));
                int third = Character.getNumericValue(input.charAt(2));

                if (second == first + third) {
                    sum += Integer.parseInt(input);
                } else {
                    balanced = false;
                }
            }
        }

        System.out.println(sum);
    }
}

//Balanced Numbers
//A balanced number is a 3-digit number whose second digit is equal to the sum of the first and last digit.
//
//Write a program which reads and sums balanced numbers. You should stop when an unbalanced number is given.
//
//Input:
//Input data is read from the standard input
//Numbers will be given
//Each one will be on a separate line
//Output
//Print to the standard output
//
//Constraints
//No more than 1000 numbers will be given

