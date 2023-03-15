package P04_Arrays;

import java.util.Scanner;

public class Task05_IsAListSorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline character after reading n

        for (int i = 0; i < n; i++) {
            String[] list = scanner.nextLine().split(",");
            boolean sorted = true;
            for (int j = 1; j < list.length; j++) {
                if (Integer.parseInt(list[j]) < Integer.parseInt(list[j-1])) {
                    sorted = false;
                    break;
                }
            }
            System.out.println(sorted);
        }
    }
    }
