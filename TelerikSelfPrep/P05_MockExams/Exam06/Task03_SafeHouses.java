package P05_MockExams.Exam06;

import java.util.Arrays;
import java.util.Scanner;

public class Task03_SafeHouses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();
        String[] safehousesString = line.split(" ");
        int[] safeHouses = new int[safehousesString.length];
        for (int i = 0; i < safeHouses.length; i++) {
            safeHouses[i] = Integer.parseInt(safehousesString[i]);
        }
        Arrays.sort(safeHouses);

        int[] game = new int[length];
        for (int i = 0; i < game.length; i++) {
            game[i] = i;
        }
        double maxDiff = 0;
        int position = 0;
        int counter = 0;
        if(safeHouses.length >=1 && game.length >2 && game.length < 30){
            if (safeHouses.length > 1) {
                for (int j = safeHouses[0]; j < game.length; j++) {
                    if (position < safeHouses.length) {
                        if (j == safeHouses[position]) {
                            position++;
                            counter = 0;
                        } else {
                            counter++;
                            maxDiff = Math.max(counter, maxDiff);

                        }
                    }
                }
                maxDiff /= 2;
                maxDiff =Math.floor(maxDiff + 0.5);
            }
            int beginDiff = safeHouses[0] - game[0];
            int endDiff = game[game.length - 1] - safeHouses[safeHouses.length -1];

            maxDiff = Math.max(maxDiff, Math.max(beginDiff, endDiff));



            System.out.printf("%.0f", maxDiff);
        }
    }
}

//Safe Houses
//Your first project in the Academy is to develop a simple game about a hero who must save the princess and rule the kingdom. However, as in all great games, the first few levels are difficult and the evil uncle's guards are constantly on the hunt for our hero. Luckily, there are several safehouses, where the hero can hide.
//
//When starting a game, safehouses spawn at random locations and, according to the difficulty level, our hero may spawn far from or near to a safehouse. Your task is to determine the spawning location of the hero in Easy Mode. To do that, you must find the greatest distance from a possible spawn location to a safehouse and not spawn there.
//
//In the example below, there are 6 possible spawn points, 1 of them has a safehouse (S), and 5 don't (X). The greatest distance from X to S is therefore 3. This is the spawn point that must be excluded in easy mode.
//
//X - X - X - S - X - X
//3   2   1   0   1   2
//If there are multiple safehouses, for each spawn location you need to determine the nearest safe house, and then return the largest of those distances. (Check the second example)
//
//Input
//Exactly two lines:
//
//The number of spawn points
//Numbers (unique, unordered) - the indices (zero-based) of spawn points with safe houses.
//Output
//Exactly one line:
//
//The greatest distance
//Constraints
//2 < spawn points < 30
//there will always be at least one safehouse
    
