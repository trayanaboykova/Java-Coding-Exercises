package P04_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task09_ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(",");
        int[] nums = new int[input.length];
        int nextNonZeroIndex = 0;

        for (String s : input) {
            int num = Integer.parseInt(s);
            if (num != 0) {
                nums[nextNonZeroIndex++] = num;
            }
        }

        while (nextNonZeroIndex < nums.length) {
            nums[nextNonZeroIndex++] = 0;
        }

        System.out.println(Arrays.toString(nums).replaceAll("\\[|\\]|\\s", ""));
    }
}

