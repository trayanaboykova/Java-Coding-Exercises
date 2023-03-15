package P01_DataTypesAndVariables;

import java.util.Scanner;

public class Task03_RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int area = width * length;
        System.out.println(area);
    }

}
