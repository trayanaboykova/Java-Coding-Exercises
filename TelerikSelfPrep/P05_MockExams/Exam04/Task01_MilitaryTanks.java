package P05_MockExams.Exam04;

import java.util.Scanner;

public class Task01_MilitaryTanks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moves = scanner.nextLine();
        scanner.close();

        int x = 0, y = 0;
        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            if (move == 'L') {
                x--;
            } else if (move == 'R') {
                x++;
            } else if (move == 'U') {
                y++;
            } else if (move == 'D') {
                y--;
            }
        }

        System.out.println("(" + x + ", " + y + ")");
    }
}


//Military Tanks
//Military scientists are training battle tanks using artificial intelligence. The first lesson is to teach them to move across the (x,y) - plane. They give them a sequence of moves and observe whether the tanks get to the correct (x, y) position on the field. This sequence is represented by string, and the character at position i represents the tank’s i-th move.
//
//There are several commands – R – moves right, L – moves left, U – moves up and D – moves down.
//
//To help the scientists, you have to write a program that collects the learning results of the tanks.
//
//Imgur
//
//Input
//Read from the standard input:
//
//There is one line of input, a string that contains tank's sequence of moves, represented by capital letters - R, L, D, U, no intervals:
//RLDULLR
//Output
//Print to the standard output:
//
//One line of output - tank's coordinates -> (-1, 0)
//Please note there is a space between the comma and the second coordinate.