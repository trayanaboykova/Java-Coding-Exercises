package P03_Loops;

import java.util.Scanner;

public class Task01_NumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", i);
        }
    }
}
