/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 30-09-2020
 *
 * Description of program
 ********************************************/

package Chapter_5;

import java.util.Scanner;

public class Opg_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score: ");
        double enteredInput = input.nextInt();
        boolean status = true;

        while (status) {

            if (enteredInput == -1) {
                System.out.println("No numbers are entered except 0");
                status = false;
            } else if (enteredInput >= 60) {
                System.out.println("You pass the exam");
            } else {
                System.out.println("You pass the exam");
            }

        }

    }

}
