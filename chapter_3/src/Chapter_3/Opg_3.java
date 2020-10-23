/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 22-09-2020
 *
 * Description of program
 ********************************************/

package Chapter_3;

import java.util.*;

public class Opg_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter values for a, b, c, d, e and f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        LinearEquation(a, b, c, d, e, f);

    }

    public static void LinearEquation(double a, double b, double c, double d, double e, double f) {

        if (((a * d) - (b * c)) != 0) {

            double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
            System.out.println("x is " + x + " and y is " + y);

        } else {

            System.out.println("The equation has no solution");

        }

    }

}
