/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 22-09-2020
 *
 * Description of program
 ********************************************/

package Chapter_3;

import java.util.*;

public class Opg_10 {

    public static void main(String[] args) {

        Random rand = new Random();

        // 1. Generate two random integers
        int number1 = rand.nextInt((999 - 1) + 1) + 1;
        int number2 = rand.nextInt((999 - 1) + 1) + 1;

        // 2. If number1 < number2, swap number1 with number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // 3. Prompt the student to answer "what is number1 � number2?"
        System.out.print
                ("What is " + number1 + " * " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        // 4. Grade the answer and display the result
        if (number1 * number2 == answer)
            System.out.println("You are correct!");
        else
            System.out.println("Your answer is wrong.\n" +
                    number1 + " * " + number2 + " should be " + (number1 * number2));

    }

}
