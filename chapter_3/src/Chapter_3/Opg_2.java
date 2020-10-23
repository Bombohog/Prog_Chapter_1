/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 22-09-2020
 *
 * Description of program
 ********************************************/

package Chapter_3;

import java.util.Random;
import java.util.Scanner;

public class Opg_2 {

    public static void main(String[] args) {

        Random rand = new Random();

        int number1 = rand.nextInt((9 - 1) + 1) + 1;
        int number2 = rand.nextInt((9 - 1) + 1) + 1;
        int number3 = rand.nextInt((9 - 1) + 1) + 1;

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print(
                "What is " + number1 + " * " + number2 + " * " + number3 + "? ");

        int answer = input.nextInt();

        System.out.println(
                number1 + " * " + number2 + " * " + number3 + " = " + answer + " is " +
                        (number1 * number2 * number3 == answer));

    }

}
