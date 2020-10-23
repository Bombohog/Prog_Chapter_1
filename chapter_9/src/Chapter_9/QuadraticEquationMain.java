/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 21-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_9;

import java.util.Scanner;

public class QuadraticEquationMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b and c for a quadratic equation: ");
        QuadraticEquation equation = new QuadraticEquation(input.nextDouble(), input.nextDouble(), input.nextDouble());

        if (equation.getDiscriminant() > 0) {
            System.out.printf("Equation: %.2f^2 + %.2fx + %.2f\nDiscriminant: %.2f\nRoots: %.2f and %.2f", equation.getA(), equation.getB(), equation.getC(), equation.getDiscriminant(), equation.getRoot1(), equation.getRoot2());
        } else if (equation.getDiscriminant() == 0) {
            System.out.printf("Equation: %.2f^2 + %.2fx + %.2f\nDiscriminant: %.2f\nRoot: %.2f", equation.getA(), equation.getB(), equation.getC(), equation.getDiscriminant(), equation.getRoot1());
        } else {
            System.out.printf("Equation: %.2f^2 + %.2fx + %.2f\nDiscriminant: %.2f", equation.getA(), equation.getB(), equation.getC(), equation.getDiscriminant());
        }

    }

}
