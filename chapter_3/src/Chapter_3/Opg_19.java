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

public class Opg_19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of three sides on a triangle: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double smallSide1;
        double smallSide2;
        double bigSide;

        // Small side 1
        if (a < b && a < c) {smallSide1 = a;}
        else if (b < a && b < c) {smallSide1 = b;}
        else {smallSide1 = c;}

        // Small side 2
        if (a < b && a > c || a > b && a < c) {smallSide2 = a;}
        else if (b < a && b > c || b > a && b < c) {smallSide2 = b;}
        else {smallSide2 = c;}

        // Biggest side
        if (a > b && a > c) {bigSide = a;}
        else if (b > a && b > c) {bigSide = b;}
        else {bigSide = c;}

        if ((smallSide1 + smallSide2) > bigSide || a == b && b == c) {
            System.out.println("The perimeter = " + (a + b + c));
        } else {System.out.println("The input is invalid");}

    }

}
