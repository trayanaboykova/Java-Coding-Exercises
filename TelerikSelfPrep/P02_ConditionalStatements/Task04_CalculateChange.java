package P02_ConditionalStatements;

import java.util.Scanner;

public class Task04_CalculateChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceInLeva = Double.parseDouble(scanner.nextLine());
        double paidInLeva = Double.parseDouble(scanner.nextLine());

        int price = (int) (priceInLeva * 100);
        int paid = (int) (paidInLeva * 100);
        int change = paid - price;

        int hundred = change / 100;
        int fifty = (change - hundred * 100) / 50;
        int twenty = (change - hundred * 100 - fifty * 50) / 20;
        int ten = (change - hundred * 100 - fifty * 50 - twenty * 20) / 10;
        int five = (change - hundred * 100 - fifty * 50 - twenty * 20 - ten * 10) / 5;
        int two = (change - hundred * 100 - fifty * 50 - twenty * 20 - ten * 10 - five * 5) / 2;
        int one = (change - hundred * 100 - fifty * 50 - twenty * 20 - ten * 10 - five * 5 - two * 2);

        if (hundred != 0) {
            System.out.printf("%d x 1 lev%n", hundred);
        }
        if (fifty != 0) {
            System.out.printf("%d x 50 stotinki%n", fifty);
        }
        if (twenty != 0) {
            System.out.printf("%d x 20 stotinki%n", twenty);
        }
        if (ten != 0) {
            System.out.printf("%d x 10 stotinki%n", ten);
        }
        if (five != 0) {
            System.out.printf("%d x 5 stotinki%n", five);
        }
        if (two != 0) {
            System.out.printf("%d x 2 stotinki%n", two);
        }
        if (one != 0) {
            System.out.printf("%d x 1 stotinka%n", one);
        }
    }
}
