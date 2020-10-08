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

public class Opg_8 {

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

        int bestScore = numberOfStudents - 1;

        for (int i = numberOfStudents - 1; i >= 0; i--) {
            if (scores[i] > scores[bestScore]) {bestScore = i;}
        }
        System.out.print("\nStudent number " + (bestScore + 1) + " named " + names[bestScore] + " had the best score of " + scores[bestScore]);

    }

}
