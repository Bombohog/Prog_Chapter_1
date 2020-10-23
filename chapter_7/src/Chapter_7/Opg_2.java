/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 23-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_7;

import java.util.Random;
import java.util.Scanner;

public class Opg_2 {

    public static void main(String[] args) {

        // scanner
        Scanner input = new Scanner(System.in);

        // input code
        System.out.print("Enter 11 numbers: ");
        int[] numbers = new int[11];
        for (int i = 0; i < 11; i++) {numbers[i] = input.nextInt();}

        // method call
        compareNumbers(numbers);

    }

    public static void compareNumbers(int[] numbers) {

        for (int i = 0; i < 10; i++) {

            if (numbers[i] > numbers[10]) {
                System.out.printf("\n%s is greater than %s", numbers[i], numbers[10]);
            } else if (numbers[i] < numbers[10]) {
                System.out.printf("\n%s is smaller than %s", numbers[i], numbers[10]);
            } else {
                System.out.printf("\n%s is eqaul to %s", numbers[i], numbers[10]);
            }

        }

    }

}
