/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 23-09-2020
 *
 * Description of program
 ********************************************/

package Chapter_3;

import java.util.Scanner;

public class Opg_22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter x and y for a point in circle: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        // Center for circle = (0, 0)
        // Radius = 10
        if (distance < 10) {System.out.println("Point (" + x + ", " + y + ") is in the circle");}
        else if (distance == 10) {System.out.println("Point (" + x + ", " + y + ") is on the perimeter of the circle");}
        else {System.out.println("Point (" + x + ", " + y + ") is not in the circle");}

    }

}
