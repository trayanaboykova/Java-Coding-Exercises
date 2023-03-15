package P03_Loops;

import java.util.Scanner;

public class Task12_PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i++)
        {
            while (n % i == 0)
            {
                n /= i;
                System.out.println(i);
            }
        }
    }
}
