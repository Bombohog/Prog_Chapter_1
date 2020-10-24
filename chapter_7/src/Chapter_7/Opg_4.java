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

public class Opg_4 {

    public static void main(String[] args) {

        // scanner
        Scanner input = new Scanner(System.in);

        // input
        System.out.print("Enter the assortment of scores and end the scores by entering a negative number.\nmax 100 and the ending negative number: ");

        int[] scores = new int[101];

        int currentScore = input.nextInt();
        int currentIndex = 0;
        while (currentScore < 0) {

            // add numbers to array
            scores[currentIndex] = currentScore;
            currentScore = input.nextInt();
            currentIndex++;

        }

        // find average score
        int averageOfNumbers = 0;
        boolean reachedEndOfScores = false;
        currentIndex = 0;
        while (!reachedEndOfScores) {

            // add numbers to sum to find average
            if (scores[currentIndex] >= 0) { averageOfNumbers += scores[currentIndex]; }
            else { reachedEndOfScores = true; }
            currentIndex++;

        }
        averageOfNumbers /= currentIndex - 1;

        // find out how many are under, over and equal to the average
        reachedEndOfScores = false;
        currentIndex = 0;
        int underAverage = 0, overAverage = 0, equalToAverage = 0;
        while (!reachedEndOfScores) {

            // add numbers to sum to find average
            if (scores[currentIndex] < 0) { reachedEndOfScores = true; }
            else if (scores[currentIndex] < averageOfNumbers) { underAverage++; }
            else if (scores[currentIndex] > averageOfNumbers) { overAverage++; }
            else { equalToAverage++; }
            currentIndex++;

        }

        // print out results
        System.out.printf("\nAverage score is: %d\n" +
                "Amount of scores under the average: %d\n" +
                "Amount of scores equal to the average: %d\n" +
                "Amount of scores over the average: %d", averageOfNumbers, underAverage, equalToAverage, overAverage);

    }

}
