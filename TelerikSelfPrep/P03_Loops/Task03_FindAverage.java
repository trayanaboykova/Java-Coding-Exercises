package P03_Loops;

import java.util.Scanner;

public class Task03_FindAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double totalAmount = 0;
        for (int i = 0; i < n; i++) {
            double number = scanner.nextDouble();
            totalAmount += number;
        }
        totalAmount /= n;
        System.out.printf("%.2f", totalAmount);
    }
}
