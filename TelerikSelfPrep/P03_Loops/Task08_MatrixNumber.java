package P03_Loops;

import java.util.Scanner;

public class Task08_MatrixNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n + i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
