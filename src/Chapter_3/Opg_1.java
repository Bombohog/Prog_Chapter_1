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

public class Opg_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter values for a, b and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        Roots(a, b, c);

    }

    public static void Roots(double a, double b, double c) {

        double discriminant = Math.pow(b, 2) - (4 * a * c);
        double root1;
        double root2;

        if (discriminant > 0) {

            root1 = ((-b) + Math.sqrt(discriminant)) / (2 * a);
            root2 = ((-b) - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two roots: x1 = " + root1 + " and x2 = " + root2);

        } else if (discriminant == 0) {

            root1 = ((-b) + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has one root: x = " + root1);

        } else {

            System.out.println("The equation has no real roots");

        }

    }

}
