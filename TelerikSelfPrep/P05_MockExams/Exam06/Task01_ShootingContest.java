package P05_MockExams.Exam06;

import java.util.Scanner;

public class Task01_ShootingContest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long gs = input.nextLong();
        long gl = input.nextLong();
        long ps = input.nextLong();
        long pl = input.nextLong();
        long georgeTime = getTime(n, gs, gl);
        long peterTime = getTime(n, ps, pl);
        if (georgeTime < peterTime) {
            System.out.println("George");
        } else if (peterTime < georgeTime) {
            System.out.println("Peter");
        } else {
            System.out.println("Draw");
        }
    }

    public static long getTime(int n, long speed, long latency) {
        return n * speed + 2 * latency;
    }
}

//Shooting Contest
//George and Peter (aka Gosho & Pesho) are participating in an online shooting contest. The game is simple - everyone will receive N amount of targets to hit and the first who hits all targets wins the round.
//
//However, George and Peter shoot at different speeds and accuracy, so for example George will hit a target roughly once every Gs seconds, while Peter will need roughy Ps seconds.
//
//Additionally, George and Peter are playing from different PCs and there is a variable amount of latency for each one of them - Gl and Pl.
//
//So for example, the server sends the targets to George, which takes Gl seconds, Gosho shoots all targets with his shooting speed, and then the response back to the server take another Gl seconds.
//
//Your task is to write a program which will determine if George or Peter will win the current round, or there will be a draw.
//
//Input
//Read from the standard input:
//
//On the first line - the number N - the number of targets.
//On the second line - Gs - George's speed.
//On the third line - Gl - George's latency.
//On the fourth line - Ps - Peter's speed
//On the fifth line Pl - Peter's latency.
//Output
//Print to the standard output:
//
//There is one line of output:
//George - if George wins
//Peter - if Peter wins
//Draw - if the amount it takes is the same for both of them
//Constraints
//1 <= N, Gs, Gl, Ps, Pl <= 232