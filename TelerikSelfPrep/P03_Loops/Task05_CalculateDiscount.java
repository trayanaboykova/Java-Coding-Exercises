package P03_Loops;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Task05_CalculateDiscount {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        NumberFormat decimals = new DecimalFormat("#0.00");

        String lines = userInput.nextLine();
        int n = Integer.parseInt(lines);

        double itemPrice = 0;
        double discounted = 0;


        for (int i = 1; i <= n; i++) {
            String price = userInput.nextLine();
            itemPrice = Double.parseDouble(price);
            discounted = itemPrice * (1 - 0.65);
            BigDecimal rounded = BigDecimal.valueOf(discounted);
            rounded = rounded.setScale(2, RoundingMode.HALF_UP);
            System.out.println(rounded);
        }

    }
}
