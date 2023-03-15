package P01_DataTypesAndVariables;

import java.util.Scanner;

public class Task07_Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputDeposit = scanner.nextLine();
        int deposit = Integer.parseInt(inputDeposit);
        double interest = 1.05;

        double firstYear = deposit * interest;
        double secondYear = firstYear * interest;
        double thirdYear = secondYear * interest;

        System.out.printf("%.2f%n", firstYear);
        System.out.printf("%.2f%n", secondYear);
        System.out.printf("%.2f%n", thirdYear);

    }
}
