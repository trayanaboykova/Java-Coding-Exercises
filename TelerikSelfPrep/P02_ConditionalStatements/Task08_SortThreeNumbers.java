package P02_ConditionalStatements;

import java.util.Scanner;

public class Task08_SortThreeNumbers {
    public static boolean rangeCheck (int num, int min, int max){
        return num > min && num < max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (rangeCheck(c, -1000, 1000))
            if ((a >= b) && (a >= c)) {
                if (b >= c) {
                    System.out.printf("%d %d %d", a, b, c);
                } else
                    System.out.printf("%d %d %d", a, c, b);
            } else if ((b >= a) && (b >= c)) {
                if (a >= c) {
                    System.out.printf("%d %d %d", b, a, c);
                } else
                    System.out.printf("%d %d %d", b, c, a);
            } else if ((c >= a) && (c >= b)) {
                if (a >= b) {
                    System.out.printf("%d %d %d", c, a, b);
                } else
                    System.out.printf("%d %d %d", c, b, a);
            }
    }
}
