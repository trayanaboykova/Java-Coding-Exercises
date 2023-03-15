package P04_Arrays;

import java.util.Scanner;

public class Task07_StrangeOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputAsStringArray = input.split(",");
        int[] numbers = new int[inputAsStringArray.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputAsStringArray[i]);
        }

        int count = 0;
        int temp = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                temp = numbers[count];
                numbers[count] = numbers[i];
                for (int j = i; j > count; j--) {
                    if (j == count + 1) {
                        numbers[j] = temp;
                    } else {
                        numbers[j] = numbers[j - 1];
                    }
                }
                count++;
            }
        }

        for (int i = count + 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                temp = numbers[count];
                numbers[count] = 0;
                for (int j = i; j > count; j--) {
                    if (j == count + 1) {
                        numbers[j] = temp;
                    } else {
                        numbers[j] = numbers[j - 1];
                    }
                }
                count++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : numbers) {
            sb.append(Integer.toString(num)).append(",");
        }

        System.out.println(sb.toString().substring(0, sb.length() - 1));

    }
}
