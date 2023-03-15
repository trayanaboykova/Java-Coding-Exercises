package P05_MockExams.Exam02;

import java.util.Scanner;

public class Task01_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxResult = 0;
        while (true) {
            int input = sc.nextInt();
            String numStr = Integer.toString(input);
            char[] charNum = numStr.toCharArray();
            int[] numInt = new int[numStr.length()];
            int sum = 0;
            for (int i = 0; i < numStr.length(); i++) {
                numInt[i] = (int) charNum[i] - 48;

            }

            sum = numInt[2] + numInt[1] + numInt[0];
            if (numInt[0] > 1 && numInt[1] >=1 && numInt[2] > 1) {
                maxResult = numInt[0] * numInt[1] * numInt[2];
            } else if (numInt[0] > 1 && numInt[1] > 1 && (numInt[2] == 1 || numInt[2] == 0)) {
                maxResult = numInt[0] * numInt[1] + numInt[2];
            } else if (numInt[0] > 1 && numInt[1] == 0 && numInt[2] > 1) {
                maxResult = sum;;
            } else if ((numInt[0] == 1 ||numInt[0]==0) && numInt[1] > 1 && numInt[2] > 1) {
                maxResult = numInt[0]+numInt[2] * numInt[1];
            } else if (numInt[0] > 1 && (numInt[1] == 1 || numInt[1] == 0) && (numInt[2] == 1 || numInt[2] == 0)) {
                maxResult = sum;
            } else if ((numInt[0] == 1 ||numInt[0]==0) && (numInt[1] == 1 || numInt[1] == 0) && (numInt[2] == 1 || numInt[2] == 0)) {
                maxResult = sum;
            } else {
                break;
            }

            System.out.println(maxResult);
            break;
        }
    }
}



//Game
//Three friends came up with a game for having fun in the break between the classes. One of them says a three-digit number and the others use it to form a mathematical expressions by using operators for sum and multiplication between the digits.
//
//The winner is the first one who founds the biggest number that is a result of the above mentioned rules.
//
//Write a program 'game', which prints out that biggest number.
//
//Input
//Read from the standard input
//
//The first line of the input will be positive three-digit number N.
//Output
//Print on the standard output
//
//The result should be the calculated biggest number.
//The calculation order
