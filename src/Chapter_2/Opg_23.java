/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 16-09-2020
 *
 * Description of program
 ********************************************/

package Chapter_2;

import java.util.Scanner;

public class Opg_23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance to drive(miles): ");
        double distance = input.nextDouble();

        System.out.print("Enter miles/gallon: ");
        double mPRgallon = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        double price = input.nextDouble();

        System.out.println("The cost of driving is: $" + ((distance / mPRgallon) * price));


    }

}
