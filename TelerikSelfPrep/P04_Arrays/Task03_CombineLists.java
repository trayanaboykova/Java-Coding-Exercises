package P04_Arrays;

import java.util.Scanner;

public class Task03_CombineLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] list1 = scanner.nextLine().split(",");
        String[] list2 = scanner.nextLine().split(",");
        String[] result = new String[list1.length + list2.length];
        int position = 0;
        for (int i = 0; i < result.length; i+=2) {
            result[i] = list1[position];
            result[i + 1] = list2[position];
            position++;
        }
        System.out.println(String.join(",", result));
    }
}
