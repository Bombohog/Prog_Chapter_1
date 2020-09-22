/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 22-09-2020
 *
 * Description of program
 ********************************************/

package Chapter_3;

import java.util.Scanner;

public class Opg_18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight of the package: ");
        double weight = input.nextDouble();
        double cost = 0;

        if (!(weight > 20)) {
            if (weight > 0 && weight <= 2) {
                cost = 2.5;
            } else if (weight > 2 && weight <= 4) {
                cost = 4.5;
            } else if (weight > 4 && weight <= 10) {
                cost = 7.5;
            } else if (weight > 10 && weight <= 20) {
                cost = 10.5;
            }
            System.out.println("The cost shipping the package is " + cost);
        } else {System.out.println("The package cannot be shipped");}

    }

}
