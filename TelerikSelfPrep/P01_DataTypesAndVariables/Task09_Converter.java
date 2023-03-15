package P01_DataTypesAndVariables;

import java.util.Scanner;

public class Task09_Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mpg = Double.parseDouble(scanner.nextLine());
        double mile = 1.6;
        double gallon = 4.54;
        double result = (100 * gallon) / (mile * mpg);
        System.out.printf("%.0f litres per 100 km", Math.floor(result));


    }

}
