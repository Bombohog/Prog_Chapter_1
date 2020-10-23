/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 30-09-2020
 *
 * Description of program
 ********************************************/

package Chapter_5;

import java.util.*;

public class Opg_2 {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        final int NUMBER_OF_QUESTIONS = 10;
        int correntCount = 0;
        int count = 0;
        long starTime = System.currentTimeMillis();
        String output = " ";

        while (count < NUMBER_OF_QUESTIONS) {
            int num1 = rand.nextInt((12 - 1) + 1) + 1;
            int num2 = rand.nextInt((12 - 1) + 1) + 1;

            System.out.print("What is " + num1 + " * " + num2 + ": ");
            int answer = input.nextInt();

            if (num1 * num2 == answer) {
                System.out.println("You are correct!");
                correntCount++;
            } else {
                System.out.println("Your answer wrong.\n" + num1 + " * " + num2 + " should be " + (num1 * num2));
            }

            count++;

            output += "\n" + num1 + " * " + num2 + " = " + answer + ((num1 * num2 == answer) ? " correct": " wrong");

        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - starTime;

        System.out.println("\nCorrect amount is " + correntCount + "\nTest time is " + (testTime / 1000) + " seconds\n" + output);

    }

}
