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

public class Opg_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of sides: ");
        int n = input.nextInt();
        System.out.print("Enter length of a side: ");
        double s = input.nextDouble();

        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));

        System.out.printf("The area of the hexagon is %.3f", area);

    }

}
