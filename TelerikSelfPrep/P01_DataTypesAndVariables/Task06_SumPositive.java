package P01_DataTypesAndVariables;

import java.util.Scanner;

public class Task06_SumPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(input);
        int sum = n * (n + 1) / 2;
        System.out.println(sum);

    }
}
