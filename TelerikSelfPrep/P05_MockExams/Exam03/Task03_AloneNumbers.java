package P05_MockExams.Exam03;

import java.util.Scanner;

public class Task03_AloneNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrStr = scanner.nextLine().split(", ");
        int[] arr = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }
        int target = scanner.nextInt();

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == target && arr[i-1] != target && arr[i+1] != target) {
                if (arr[i-1] > arr[i+1]) {
                    arr[i] = arr[i-1];
                } else {
                    arr[i] = arr[i+1];
                }
            }
        }

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

//Alone Numbers
//We will give you array and a target! You need to find all "alone" elements in the array that match the given target. These elements are alone if they have values before and after them, but those values are different from them.
//
//Return new version of the given array where every element that matches the target and is alone is replaced by whichever value to its left or right is larger.
//
//Input
//Read from the standard input:
//
//The first line is the array with coma separated integer values -> 1,2,3
//The second line is the target that you should check against -> 2
//Output
//Print to the standard output:
//
//One line of output - the changed array -> [1, 3, 3]
//please note that there is space after each coma.
