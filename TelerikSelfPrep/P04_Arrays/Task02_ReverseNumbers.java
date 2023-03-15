package P04_Arrays;

import java.util.Scanner;

public class Task02_ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] inputStr = line.split("");
        for (int i = inputStr.length - 1; i >= 0; i--) {
            System.out.print(inputStr[i]);
        }
    }
}
