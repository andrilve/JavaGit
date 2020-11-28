// Cравнение двух введеных чисел с клавиатуры.

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input a number one ");
        int numberOne = in.nextInt();

        System.out.print("Input a number two ");
        int numberTwo = in.nextInt();

        if(numberOne == numberTwo){
            System.out.println("The numbers are equal");
        }
        else {
            int big     = max(numberOne, numberTwo);
            int little  = min(numberOne, numberTwo);
            System.out.printf("Number %s is greater than number %s", big, little);
        }
    }
}
