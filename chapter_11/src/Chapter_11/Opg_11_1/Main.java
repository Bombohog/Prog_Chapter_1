package Chapter_11.Opg_11_1;

import java.util.Scanner;

/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 10-11-2020
 *
 * Description of program
 ********************************************/

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Chapter_11.Opg_11_1.Triangle
        System.out.print("Enter sides[? ? ?]: ");
        double s1 = input.nextDouble(), s2 = input.nextDouble(), s3 = input.nextDouble();
        Triangle testTriangle = new Triangle(s1, s2, s3);

        // Color
        System.out.print("Enter color[blue/etc.]: ");
        testTriangle.setColor(input.next());

        // Filled
        System.out.print("Enter filled[true/false]:");
        testTriangle.setFilled(input.nextBoolean());

        System.out.printf(
                "\nArea: %.3f" +
                "\nPerimeter: %.2f" +
                "\nColor: %s" +
                "\nFilled: %b",
                testTriangle.getArea(),
                testTriangle.getPerimeter(),
                testTriangle.getColor(),
                testTriangle.isFilled());

    }

}
