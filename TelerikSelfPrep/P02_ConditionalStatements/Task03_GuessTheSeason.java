package P02_ConditionalStatements;

import java.util.Scanner;

public class Task03_GuessTheSeason {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.nextLine();
        int date = in.nextInt();

        switch (month) {
            case "March":
                if (date >= 1 && date <= 19) {
                    System.out.println("Winter");
                    break;
                } else if (date >= 20 && date <= 31) {
                    System.out.println("Spring");
                    break;
                }
            case "April":
                if (date >= 1 && date <= 30) {
                    System.out.println("Spring");
                    break;
                }
            case "May":
                if (date >= 1 && date <= 31) {
                    System.out.println("Spring");
                    break;
                }
            case "June":
                if (date >= 1 && date <= 20) {
                    System.out.println("Spring");
                    break;
                } else if (date >= 21 && date <= 30) {
                    System.out.println("Summer");
                    break;
                }
            case "July":
                if (date >= 1 && date <= 31) {
                    System.out.println("Summer");
                    break;
                }
            case "August":
                if (date >= 1 && date <= 31) {
                    System.out.println("Summer");
                    break;
                }
            case "September":
                if (date >= 1 && date <= 21) {
                    System.out.println("Summer");
                    break;
                } else if (date >= 22 && date <= 30) {
                    System.out.println("Autumn");
                    break;
                }
            case "October":
                if (date >= 1 && date <= 31) {
                    System.out.println("Autumn");
                    break;
                }
            case "November":
                if (date >= 1 && date <= 30) {
                    System.out.println("Autumn");
                    break;
                }
            case "December":
                if (date >= 1 && date <= 20) {
                    System.out.println("Autumn");
                    break;
                } else if (date >= 21 && date <= 31) {
                    System.out.println("Winter");
                    break;
                }
            case "January":
                if (date >= 1 && date <= 31) {
                    System.out.println("Winter");
                    break;
                }
            case "February":
                if (date >= 1 && date <= 29) {
                    System.out.println("Winter");
                    break;
                }


        }

    }

}
