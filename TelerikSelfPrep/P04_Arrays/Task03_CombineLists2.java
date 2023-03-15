package P04_Arrays;

import java.util.Scanner;

public class Task03_CombineLists2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] list1 = scanner.nextLine().split(",");
        String[] list2 = scanner.nextLine().split(",");
        String[] result = new String[list1.length + list2.length];

        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < result.length; i++) {
            if (i % 2 == 0) {
                result[i] = list1[index1];
                index1++;
            } else {
                result[i] = list2[index2];
                index2++;
            }
        }

        System.out.println(String.join(",", result));
    }
}

