package P03_Loops;

import java.util.Scanner;

public class Task11_FindLargestThreeValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int maxNumber = Math.max(Math.max(firstNumber, secondNumber), thirdNumber);
        int minxNumber = Math.min(Math.min(firstNumber, secondNumber), thirdNumber);
        int mediumNumber = (firstNumber + secondNumber + thirdNumber) - maxNumber - minxNumber;

        for (int i = 3; i < n; i++) {
            int currentNumber = scanner.nextInt();
            if (currentNumber > maxNumber) {
                minxNumber = mediumNumber;
                mediumNumber = maxNumber;
                maxNumber = currentNumber;
                continue;
            }
            if (currentNumber > mediumNumber) {
                minxNumber = mediumNumber;
                mediumNumber = currentNumber;
                continue;
            }
            if (currentNumber > minxNumber) {
                minxNumber = currentNumber;
                continue;
            }
        }
        System.out.printf("%d, %d and % d", maxNumber, mediumNumber, minxNumber);
    }
}
