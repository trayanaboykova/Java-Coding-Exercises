package P02_ConditionalStatements;

import java.util.Scanner;

public class Task01_DogYears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int humanYears = Integer.parseInt(input);
        int dogYears = 0;

        if (humanYears <=2){
            dogYears = humanYears * 10;
        } else {
            dogYears = 20 + (humanYears -2) * 4;
        }

        System.out.println(dogYears);
    }
}
