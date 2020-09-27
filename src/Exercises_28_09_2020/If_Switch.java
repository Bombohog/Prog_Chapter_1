/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 27-09-2020
 *
 * Description of program
 ********************************************/

package Exercises_28_09_2020;

import java.util.Scanner;

public class If_Switch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 10: ");

        int number = input.nextInt();

        if (number >= 1 && number <= 10) {

            // normal or old switch statement
            switch (number) {
                case 1,2,3:
                    System.out.println("Your number is within the interval [1, 3]");
                    break;
                case 4,5,6:
                    System.out.println("Your number is within the interval [4, 6]");
                    break;
                case 7,8,9:
                    System.out.println("Your number is within the interval [7, 9]");
                    break;
                case 10:
                    System.out.println("Your number is 10, a 2-digit number outside the boundaries of the other 1-digit numbers and is therefore a loner.");
                    break;
            }

            // new and enhanced switch statement
            switch (number) {
                case 1, 2, 3 -> System.out.println("Your number is within the interval [1, 3]");
                case 4, 5, 6 -> System.out.println("Your number is within the interval [4, 6]");
                case 7, 8, 9 -> System.out.println("Your number is within the interval [7, 9]");
                case 10 -> System.out.println("Your number is 10, a 2-digit number outside the boundaries of the other 1-digit numbers and is therefore a loner.");
            }

        } else {

            System.out.println("Invalid input, try again.");

        }


    }

}
