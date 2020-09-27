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

public class Opg_23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter x and y for a point in rectangle: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Center for rectangle = (1, 1)
        // Width = 10 , height = 5
        if (x > -4 && x < 5 && y > -1.5 && y < 3.5) {System.out.println("Point (" + x + ", " + y + ") is in the rectangle");}
        else if (x == -4 || x == 5 || y == -1.5 || y == 3.5) {System.out.println("Point (" + x + ", " + y + ") is on the perimeter of the rectangle");}
        else {System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");}

    }

}
