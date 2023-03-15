package P04_Arrays;

import java.util.Scanner;

public class Task10_ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(",");
        String missing = "";
        for (int currentNumber = 1; currentNumber <= input.length ; currentNumber++) {
            boolean isFound = false;

            for (String number : input) {
                if (currentNumber == Integer.parseInt(number)){
                    isFound = true;
                    break;
                }
            }
            if (!isFound){
                if (missing.length() > 0){
                    missing += ",";
                }
                missing += currentNumber;
            }
        }
        System.out.println(missing);
    }
}
