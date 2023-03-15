package P01_DataTypesAndVariables;

import java.util.Scanner;

public class Task05_Tips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bill = Double.parseDouble(scanner.nextLine());
        double billPlusTip = bill + bill * 0.1;
        System.out.printf("%.0f", billPlusTip);


    }
}
