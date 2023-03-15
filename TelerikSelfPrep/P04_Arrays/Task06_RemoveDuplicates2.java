package P04_Arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task06_RemoveDuplicates2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(",");
        Set<String> uniqueElements = new LinkedHashSet<>(Arrays.asList(elements));
        System.out.println(String.join(",", uniqueElements));
    }
}


