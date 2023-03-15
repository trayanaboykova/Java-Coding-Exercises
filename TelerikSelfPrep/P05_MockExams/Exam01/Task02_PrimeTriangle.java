package P05_MockExams.Exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task02_PrimeTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> sequence = new ArrayList<>();
        List<Integer> primes = new ArrayList<>();
        List<String> output = new ArrayList<>();

        for (int i = 1; i < n + 1; i++) {
            sequence.add(i);
        }

        for (int i = 0; i < sequence.size(); i++) {
            if (isPrime(sequence.get(i))) {
                primes.add(sequence.get(i));
            }
        }

        for (int i = 0; i < primes.get(primes.size() - 1); i++) {
            if (isPrime(sequence.get(i))) {
                output.add("1");
                System.out.println(String.join("", output));
            } else {
                output.add("0");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num == 1) {
            return true;
        } else if (num <= 3) {
            return true;
        } else if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        int j = 5;
        while (j * j <= num) {
            if (num % j == 0 || num % (j + 2) == 0) {
                return false;
            }
            j += 6;
        }
        return true;
    }
}

//Prime Triangle
//Description
//We know that you love math, so we have prepared a very interesting task, that involves both geometry and prime numbers.
//
//By a given N number, from which you need to generate a sequence of 1 to N inclusive. For every prime number in that sequence, you need to print out all the other numbers before it (and the number itself), whether they are prime or not
//
//Note:
//For the purposes of this task (and against the laws of mathematics), the number 1 is considered as prime.
//
//Example
//Let's say N=10
//
//We have the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
//The prime numbers are 1, 2, 3, 5, 7 - 5 prime numbers, so we print 5 rows
//Each row contains all the numbers for 1 to PRIME_NUMBER
//Result:
//
//1
//
//1 2
//
//1 2 3
//
//1 2 3 4 5
//
//1 2 3 4 5 6 7
//
//Let's make things simpler:
//
//Print 0 if the numbers is not prime
//Print 1 if the number is prime
//Final result:
//
//1
//
//1 1
//
//1 1 1
//
//1 1 1 0 1
//
//1 1 1 0 1 0 1
//
//Input
//Read from the standard input
//On the single line, find the number N
//The input data will always be valid and in the format described. There is no need to check it explicitly
//Output
//Print on the standard output
//The output should consist of several lines of digits each of which can be either 1 or 0
//Without any space between them

