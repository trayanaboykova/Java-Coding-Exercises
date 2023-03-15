package P02_ConditionalStatements;

import java.util.Scanner;

public class Task07_BiggestOfFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());
        int e = Integer.parseInt(scanner.nextLine());


        if (a > b && a > c && a > d && a > e){
            System.out.println(a);
        } else if (b > c && b > d && b > e) {
            System.out.println(b);
        } else if (c > d && c > e) {
            System.out.println(c);
        } else System.out.println(Math.max(d, e));

    }
}
