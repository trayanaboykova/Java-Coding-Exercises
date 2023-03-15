package P01_DataTypesAndVariables;

import java.util.Scanner;

public class Task11_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int rem = 0;

        while(N > 0) {
            rem = N % 10;
            sum = sum + rem;
            N = N / 10;
        }
        System.out.println(sum);
    }
}
