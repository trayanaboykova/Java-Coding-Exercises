package P04_Arrays;

import java.util.Scanner;

public class Task04_RotateLists2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] list = sc.nextLine().split(",");
        int rotation = Integer.parseInt(sc.nextLine());
        int n = list.length;

        if (n > rotation) {

            int[] tempArr = new int[rotation];
            int[] rest = new int[n - rotation];

            for (int i = 0; i < n - rotation; i++) {
                rest[i] = Integer.parseInt(list[i + rotation]);
                System.out.print(rest[i] + ",");

            }

            for (int i = 0; i < rotation; i++) {
                tempArr[i] = Integer.parseInt(list[i]);
                System.out.print(tempArr[i]);
                if (i != rotation - 1) {
                    System.out.print(",");
                }
            }


        } else if (n < rotation) {

            int rotationTimes = rotation % n;
            int[] tempArr = new int[rotationTimes];
            int[] rest = new int[n - rotationTimes];

            for (int i = 0; i < n - rotationTimes; i++) {
                rest[i] = Integer.parseInt(list[i + rotationTimes]);
                System.out.print(rest[i] + ",");
            }

            for (int i = 0; i < rotationTimes; i++) {
                tempArr[i] = Integer.parseInt(list[i]);
                System.out.print(tempArr[i]);

                if (i < rotationTimes - 1) {
                    System.out.print(",");
                }
            }


        } else {
            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i]);

                if (i < list.length - 1) {
                    System.out.print(",");
                }

            }

        }
    }

}
