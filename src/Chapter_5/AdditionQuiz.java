/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 30-09-2020
 *
 * Description of program
 ********************************************/

package Chapter_5;

import java.util.Random;
import java.util.Scanner;

public class AdditionQuiz {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            int num1 = rand.nextInt((10 - 1) + 1) + 1;
            int num2 = rand.nextInt((10 - 1) + 1) + 1;

            System.out.print("What is " + num1 + " + " + num2 + ": ");
            int answer = input.nextInt();

            while (num1 + num2 != answer) {
                System.out.print("Wrong answer, try again: ");
                answer = input.nextInt();
            }

        }

    }

}
