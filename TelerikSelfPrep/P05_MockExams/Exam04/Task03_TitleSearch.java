package P05_MockExams.Exam04;

import java.util.Scanner;

public class Task03_TitleSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        int lines = Integer.parseInt(scanner.nextLine());
        String result = title;
        for (int i = 0; i < lines; i++) {
            String target = scanner.nextLine();
            int targetIndex = 0;
            for (int j = 0; j < result.length(); j++) {
                char searched = target.charAt(targetIndex);
                char found = result.charAt(j);
                if (found == searched) {
                    String temp = result.substring(0, j) + result.substring(j + 1);
                    result = temp;
                    targetIndex++;
                    j--;
                }
                if (targetIndex == target.length()) {
                    title = result;
                    System.out.println(title);
                    break;
                }
            }
            if (targetIndex != target.length()) {
                result = title;
                System.out.println("No such title found!");
            }
        }
        scanner.close();
    }
}


//Title Search
//You will receive a string title which contains only small latin letters [a-z]. After that you will have to read from the input N lines of text. For each of these lines, your task is to find out if there is such a sequence in the string you receive as input on the first line (title). The sequence may not be on consecutive indices. Each time you find a sequence of these characters you remove it from the initial string and print the modified string. If no such sequence is found you have to print No such title found! and not modify the string.
//
//Examples:
//telerik is found in telerikacademy and the remaining string is academy
//telerik is also found in tpeplpeprik and the remaining string is pppp
//Input
//Read from the standard input
//On the first line you receive a string containing small latin letters [a-z]
//On the next line you receive an integer N which represents the number of lines which you will have to read
//On each of the next N lines you receive a string
//Output
//Print on the standard output
//On every N line, print the result of the operation
//Examine the sample tests for explanation
//Constraints
//3 <= N <= 10
//200 <= title.length() <= 5000
