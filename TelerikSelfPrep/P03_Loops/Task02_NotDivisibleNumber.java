package P03_Loops;

import java.util.Scanner;

public class Task02_NotDivisibleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 || i % 7 == 0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
