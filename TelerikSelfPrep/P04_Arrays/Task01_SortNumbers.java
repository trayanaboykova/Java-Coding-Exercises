package P04_Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task01_SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(", ");
        Integer[] sortedNumbers = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            sortedNumbers[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(sortedNumbers, Collections.reverseOrder());
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.print(sortedNumbers[i]);
            if (i < sortedNumbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
