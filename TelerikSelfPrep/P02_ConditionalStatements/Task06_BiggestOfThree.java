package P02_ConditionalStatements;

import java.util.Scanner;

public class Task06_BiggestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());


        if (a > b && a > c){
            System.out.println(a);
        } else System.out.println(Math.max(b, c));
    }
}
