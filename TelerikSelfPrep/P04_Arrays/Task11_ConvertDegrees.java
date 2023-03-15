package P04_Arrays;

import java.util.Scanner;

public class Task11_ConvertDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] temperatures = scanner.nextLine().split(" ");

        for (String temp : temperatures) {
            double celsius = Double.parseDouble(temp);
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(Math.round(fahrenheit));
        }
    }
}

