package P01_DataTypesAndVariables;

import java.util.Scanner;

public class Task10_Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());

        int totalSeconds = (days * 86400) + (hours * 3600) + (minutes * 60) + seconds;
        System.out.println(totalSeconds);
    }
}
