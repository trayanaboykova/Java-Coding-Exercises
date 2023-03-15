package P03_Loops;

import java.util.Scanner;

public class Task04_MinMaxSumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double minNum = 10000.0;
        double maxNum = -10000.0;
        double sum = 0.0;


        for (int i = 0; i < n; i++) {
            double currentNumber = scanner.nextDouble();
            minNum = Math.min(minNum, currentNumber);
            maxNum = Math.max(maxNum, currentNumber);
            sum += currentNumber;

        }
        double average = sum / n;
        System.out.printf("min=%.2f\n", minNum);
        System.out.printf("max=%.2f\n", maxNum);
        System.out.printf("sum=%.2f\n", sum);
        System.out.printf("avg=%.2f", average);
    }
}
