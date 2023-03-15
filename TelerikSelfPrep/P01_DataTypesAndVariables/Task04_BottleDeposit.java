package P01_DataTypesAndVariables;

import java.util.Scanner;

public class Task04_BottleDeposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String inputSmallBottle = scanner.nextLine();
        int smallBottle = Integer.parseInt(inputSmallBottle);

        String inputLargeBottle = scanner.nextLine();
        int largeBottle = Integer.parseInt(inputLargeBottle);

        double sum = 0.1 * smallBottle + 0.25 * largeBottle;
        System.out.printf("%.2f", sum);


    }
}
