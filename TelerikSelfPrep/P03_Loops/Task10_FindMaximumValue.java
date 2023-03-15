package P03_Loops;

import java.util.Scanner;

public class Task10_FindMaximumValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = -201;
        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            if (max < temp) {
                max = temp;
            }
        }
        System.out.println(max);
    }
}
