package P04_Arrays;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task06_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] elements = input.split(",");

        Set<String> uniqueElements = new LinkedHashSet<>();
        for (String element : elements) {
            uniqueElements.add(element);
        }

        StringBuilder output = new StringBuilder();
        for (String element : uniqueElements) {
            output.append(element).append(",");
        }
        output.deleteCharAt(output.length() - 1); // remove the trailing comma

        System.out.println(output.toString());
    }
    }

