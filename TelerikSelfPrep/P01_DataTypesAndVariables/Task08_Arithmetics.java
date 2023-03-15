package P01_DataTypesAndVariables;

import java.util.Scanner;

public class Task08_Arithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int remainder = a % b;
        double power = Math.pow(a, b);

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(remainder);
        System.out.printf("%.0f", power);

    }
}
