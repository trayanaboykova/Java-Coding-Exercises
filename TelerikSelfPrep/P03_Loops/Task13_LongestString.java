package P03_Loops;

import java.util.Scanner;

public class Task13_LongestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int countLength = 0;
        String biggestSize = "";

        while (!input.equals("END")) {
            String lunch = input;
            int length = lunch.length();

            if (length >= countLength) {
                countLength = length;
                biggestSize = input;
            }

            input = scanner.nextLine();
        }
        System.out.println(biggestSize);
    }
}
