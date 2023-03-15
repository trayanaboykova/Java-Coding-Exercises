package P05_MockExams.Exam04;

import java.util.Arrays;
import java.util.Scanner;

public class Task02_GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstArray = sc.nextLine().split(",");
        String[] secondArray = sc.nextLine().split(",");
        int n = firstArray.length;
        int m = secondArray.length;
        int[] results = new int[n];
        Arrays.fill(results, -1); // initialize all results to -1

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(firstArray[i]);
            for (int j = 0; j < m; j++) {
                int y = Integer.parseInt(secondArray[j]);
                if (x == y) {
                    for (int k = j+1; k < m; k++) {
                        int z = Integer.parseInt(secondArray[k]);
                        if (z > y) {
                            results[i] = z;
                            break;
                        }
                    }
                    break;
                }
            }
        }

        // print the results
        for (int i = 0; i < n; i++) {
            System.out.print(results[i]);
            if (i != n-1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
}


//Greater Number
//You are given two arrays where the elements of the first one are subset of the elements of the second one. For each element in the first array, find the next greater element in the second array, starting at the position of the given element.
//
//Input
//Read from the standard input.
//On the first line will be the first array of numbers, separated by comma.
//On the second line will be the second array of numbers, separated by comma.
//Output
//Print the result on the standard output.
//The result should be the numbers, separated by comma.
//Constraints
//All elements will be unique (the elements from the first array are unique in the first array, the elements from the second array are unique in the second array).
//The length of both arrays would not exceed 1000.