package P01_DataTypesAndVariables;

import java.util.Scanner;

public class Task02_HelloYou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
