package P03_Loops;

import java.util.Scanner;

public class Task09_OddAndEvenProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int oddProductValue =1, evanProductValue = 1;
        int num;

        for (int i = 1; i <= n; i++) {
            num = Integer.parseInt(scanner.next());
            if(i%2 != 0){
                oddProductValue *= num;
            }
            else {
                evanProductValue *= num;
            }

        }

        if(oddProductValue == evanProductValue){
            System.out.printf("yes %d", oddProductValue);
        }
        else {
            System.out.printf("no %d %d", oddProductValue, evanProductValue);
        }
    }
}

