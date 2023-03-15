package P05_MockExams.Exam05;

import java.util.Scanner;

public class Task01_MineralWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int small = Integer.parseInt(scanner.nextLine());
        int big = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());


        int loadedBig = capacity/5;

        if(loadedBig>big){
            loadedBig=big;
        }


        int neededSmall = capacity-5*loadedBig;

        if(neededSmall > small){
            System.out.println("-1");
        }else{
            System.out.println(neededSmall);
        }
    }
}

//Mineral Water
//Jimmy is a truck driver who delivers mineral water. He loads the water from a warehouse and distributes it within many stores in the town. Sometimes when Jimmy goes to the warehouse there is not enough water to full the truck which makes him angry. He wants to go for delivery only if the truck is full.
//
//You can help him if you write a program that checks if it is possible to load the whole truck.
//
//The mineral water is available in two types of bottles - 1 liter and 5 liters. Jimmy always tries to load as much of the big bottles first and then adds small bottles. Given the capacity of the truck and the available bottles in the warehouse you should calculate the number of small bottles that he will load. If there are not enough small bottles the result should be -1.
//
//Input
//Read from the standard input:
//
//The number of small bottles in the warehouse - integer number
//The number of big bottles in the warehouse - integer number
//The capacity of the truck - integer number
//Output
//Print to the standard output:
//
//One line of output:
//the number of small bottles he will deliver.
//-1 if not possible to fill completely the truck.
