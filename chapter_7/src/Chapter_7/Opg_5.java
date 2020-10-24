/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 24-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_7;

import java.util.Scanner;

public class Opg_5 {

    public static void main(String[] args) {

        // scanner
        Scanner input = new Scanner(System.in);

        // input
        System.out.print("End the numbers '0'\nEnter numbers: ");

        int[] numbers = new int[101];

        int currentScore = input.nextInt();
        int currentIndex = 0;
        while (currentScore != 0) {

            // add numbers to array
            numbers[currentIndex] = currentScore;
            currentScore = input.nextInt();
            currentIndex++;

        }

        int oddNumbers = 0, evenNumbers = 0;
        boolean reachedEndOfScores = false;
        currentIndex = 0;
        while (!reachedEndOfScores) {

            // add numbers to sum to find average
            if (numbers[currentIndex] == 0) { reachedEndOfScores = true; }
            else if (numbers[currentIndex] % 2 == 0) { evenNumbers++; }
            else { oddNumbers++; }
            currentIndex++;

        }

        // print out results
        System.out.printf("\nThe number of odd numbers: %d\n" +
                "The number of even numbers: %d\n", oddNumbers, evenNumbers);

    }

}
