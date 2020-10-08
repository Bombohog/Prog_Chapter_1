/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 01-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_5;

import java.util.Scanner;

public class Opg_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        String[] names = new String[numberOfStudents];
        int[] scores = new int[numberOfStudents];

        for (int i = numberOfStudents; i != 0; i--) {
            System.out.print("Name: ");
            names[i - 1] = input.next();
            System.out.print("Score: ");
            scores[i - 1] = input.nextInt();
        }

        int worstScore = numberOfStudents - 1;
        int secondWorstScore = numberOfStudents - 2;

        for (int x = 0; x < 2; x++) {
            for (int i = numberOfStudents - 1; i >= 0; i--) {

                if (x == 0) {

                    if (scores[i] < scores[worstScore]) {
                        worstScore = i;
                    }

                } else {

                    if (scores[i] > scores[worstScore] && scores[i] < scores[secondWorstScore]) {
                        secondWorstScore = i;
                    }

                }

            }
        }
        System.out.print("\nStudent number " + (worstScore + 1) + " named " + names[worstScore] + " had the worst score of " + scores[worstScore]);
        System.out.print("\nStudent number " + (secondWorstScore + 1) + " named " + names[secondWorstScore] + " had the second worst score of " + scores[secondWorstScore]);

    }

}
