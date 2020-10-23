/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 23-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_7;

import java.util.Scanner;

public class Opg_1 {

    public static void main(String[] args) {

        // scanner
        Scanner input = new Scanner(System.in);

        // input code
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        System.out.printf("Enter %d scores: ", numberOfStudents);
        int[] scores = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {scores[i] = input.nextInt();}

        // method call and grade definition
        String[] grades = giveGrade(numberOfStudents, scores);

        // result and printing
        int currentStudent = 1;
        int currentScore = 0;
        for (String grade : grades) {

            System.out.printf("\nStudent %d score is %d and grade is %s", currentStudent, scores[currentScore], grade);
            currentStudent++; currentScore++;

        }

    }

    public static String[] giveGrade(int numberOfStudents, int[] scores) {

        String[] grades = new String[numberOfStudents];

        int bestScore = 0;
        for (int score : scores) {
            if (score > bestScore) {
                bestScore = score;
            }
        }

        int currentEmptyIndexOfGrades = 0;
        for (int score : scores) {
            if (score >= bestScore - 5) {
                grades[currentEmptyIndexOfGrades] = "A";
                currentEmptyIndexOfGrades++;
            } else if (score >= bestScore - 10) {
                grades[currentEmptyIndexOfGrades] = "B";
                currentEmptyIndexOfGrades++;
            } else if (score >= bestScore - 15) {
                grades[currentEmptyIndexOfGrades] = "C";
                currentEmptyIndexOfGrades++;
            } else if (score >= bestScore - 20) {
                grades[currentEmptyIndexOfGrades] = "D";
                currentEmptyIndexOfGrades++;
            } else {
                grades[currentEmptyIndexOfGrades] = "F";
                currentEmptyIndexOfGrades++;
            }
        }

        return grades;
    }
}
