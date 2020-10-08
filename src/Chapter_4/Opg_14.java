/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 06-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_4;

import java.util.Scanner;

public class Opg_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter letter: ");
        String grade = input.next();

        switch (grade.toLowerCase()) {
            case "a" -> System.out.println("The numeric value of grade" + grade + " is 4");
            case "b" -> System.out.println("The numeric value of grade" + grade + " is 3");
            case "c" -> System.out.println("The numeric value of grade" + grade + " is 2");
            case "d" -> System.out.println("The numeric value of grade" + grade + " is 1");
            case "f" -> System.out.println("The numeric value of grade" + grade + " is 0");
        }

    }

}
