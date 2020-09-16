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

public class Opg_19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter: point 1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter: point 2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.print("Enter: point 3: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double side1 = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        double side2 = Math.sqrt(((x3 - x1) * (x3 - x1)) + ((y3 - y1) * (y3 - y1)));
        double side3 = Math.sqrt(((x2 - x3) * (x2 - x3)) + ((y2 - y3) * (y2 - y3)));

        double s = (side1 + side2 + side3) / 2;

        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("Area: " + area);

    }

}
