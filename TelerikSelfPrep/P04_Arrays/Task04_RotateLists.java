package P04_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task04_RotateLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] list = scanner.nextLine().split(",");
        int n = scanner.nextInt();

        // Calculate the number of elements to rotate
        int k = n % list.length;

        // Split the list into two parts: the first k elements and the remaining elements
        String[] part1 = Arrays.copyOfRange(list, 0, k);
        String[] part2 = Arrays.copyOfRange(list, k, list.length);

        // Concatenate the two parts in reverse order to produce the rotated list
        String[] rotatedList = new String[list.length];
        System.arraycopy(part2, 0, rotatedList, 0, part2.length);
        System.arraycopy(part1, 0, rotatedList, part2.length, part1.length);

        System.out.println(String.join(",", rotatedList));
    }
}
