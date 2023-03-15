package P05_MockExams.Exam03;

import java.util.Scanner;

public class Task02_Energy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        int evenSum = 0;
        int oddSum = 0;

        while (n > 0) {
            int digit = (int) (n % 10);
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            n /= 10;
        }

        if (evenSum > oddSum) {
            System.out.printf("%d energy drinks%n", evenSum);
        } else if (oddSum > evenSum) {
            System.out.printf("%d cups of coffee%n", oddSum);
        } else {
            System.out.printf("%d of both%n", oddSum);
        }
    }
}



//Energy:
//Energy drink calculations are simple - in order to decide how many drinks you should have, you are given a number. Find the sum of the even digits and the sum of the odd digits of that number, then compare these sums and:
//
//If the sum of the even digits is bigger, drink energy drinks.
//If the sum of the odd digits is bigger, drink cups of coffee.
//If the two sums are equal, drink both.
//Input
//The input data is read from the standard input (the console).
//
//The only input line contains the number N.
//Output
//The output data is printed on the standard output (the console).
//
//The output consists of one line. You must print the kind of beverage you should drink, as well as the sum of digits that lead to that decision.
//Note: The beverage is always in plural, no matter the number before it.
//
//Constraints
//That number can consist of up to 18 digits.
//The digit zero (0) is considered to be even.
