package P05_MockExams.Exam01;

import java.util.Scanner;

public class Task01_CrookedDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int counter =0;
        line = line.replace("-","");
        line = line.replace(".","");
        int [] array = new int[line.length()];
        for (int i = 0; i <array.length ; i++) {
            array[i]= Character.getNumericValue(line.charAt(i));
        }
        for (int j = 0; j <array.length ; j++) {
            counter = counter + array[j];
            if(counter>9){
                counter=counter/10+counter%10;
            }
        }
        System.out.println(counter);
    }

}

//Crooked Digits
//The crooked digit of a given number N is calculated using the number's digits in a very weird and bendy algorithm. The algorithm takes the following steps:
//
//Sums the digits of the number N and stores the result back in N.
//If the obtained result is bigger than 9, step 1. is repeated, otherwise the algorithm finishes.
//The last obtained value of N is the result, calculated by the algorithm.
//
//Input
//The input data should be read from the console.
//The only line in the input contains a number N, which can be an integer or real number (decimal fraction), positive or negative.
//The input data will always be valid and in the format described. There is no need to check it explicitly.
//Output
//The output data should be printed on the console.
//
//You must print the calculated crooked digit of the number N on the first and only line of the output.
//
//Constraints
//The number N will have no more than 300 digits before and after the decimal point.
//The decimal separator will always be the "." symbol.