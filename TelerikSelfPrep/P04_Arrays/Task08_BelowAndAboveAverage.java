package P04_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task08_BelowAndAboveAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputAsStringArray = input.split(",");
        int[] numbers = new int[inputAsStringArray.length];
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputAsStringArray[i]);
            sum += numbers[i];
        }

        double average = sum / numbers.length;
        List<Integer> below = new ArrayList<>();
        List<Integer> above = new ArrayList<>();

        for (int num : numbers) {
            if (num < average) {
                below.add(num);
            } else if (num > average) {
                above.add(num);
            }
        }

        System.out.printf("avg: %.2f\n", average);
        System.out.print("below: ");
        for (int i = 0; i < below.size(); i++) {
            System.out.print(below.get(i));
            if (i < below.size() - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.print("above: ");
        for (int i = 0; i < above.size(); i++) {
            System.out.print(above.get(i));
            if (i < above.size() - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
}

