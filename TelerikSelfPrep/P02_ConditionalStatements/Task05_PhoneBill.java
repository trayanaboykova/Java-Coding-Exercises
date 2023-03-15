package P02_ConditionalStatements;

import java.util.Scanner;

public class Task05_PhoneBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int messages = Integer.parseInt(input);
        input = scanner.nextLine();
        int minutes = Integer.parseInt(input);

        int extraMessages = 0;
        if (messages > 20){
            extraMessages = messages - 20;
        }
        int extraMinutes = 0;
        if (minutes > 60){
            extraMinutes = minutes - 60;
        }

        double extraMessagesPrice = extraMessages * 0.06;
        double extraMinutesPrice = extraMinutes * 0.10;
        double tax = (extraMessagesPrice + extraMinutesPrice) * 0.2;
        double total = 12 + extraMessagesPrice + extraMinutesPrice + tax;

        System.out.printf("%d additional messages for %.2f levas%n", extraMessages, extraMessagesPrice);
        System.out.printf("%d additional minutes for %.2f levas%n", extraMinutes, extraMinutesPrice);
        System.out.printf("%.2f additional taxes%n", tax);
        System.out.printf("%.2f total bill%n", total);
    }
}
