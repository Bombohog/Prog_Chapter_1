/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 07-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_6;

import java.util.Scanner;

public class Opg_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Write three non-decimal numbers: ");
        double number1 = input.nextInt();
        double number2 = input.nextInt();
        double number3 = input.nextInt();
        NumberOrder(number1, number2, number3);

    }

    public static void NumberOrder(double number1, double number2, double number3) {

        double firstOrder;
        double secondtOrder;
        double thirdOrder;

        // first order
        if (number1 < number2 && number1 < number3) {thirdOrder = number1;}
        else if (number2 < number1 && number2 < number3) {thirdOrder = number2;}
        else {thirdOrder = number3;}

        // second order
        if (number1 < number2 && number1 > number3 || number1 > number2 && number1 < number3) {secondtOrder = number1;}
        else if (number2 < number1 && number2 > number3 || number2 > number1 && number2 < number3) {secondtOrder = number2;}
        else {secondtOrder = number3;}

        // third order
        if (number1 > number2 && number1 > number3) {firstOrder = number1;}
        else if (number2 > number1 && number2 > number3) {firstOrder = number2;}
        else {firstOrder = number3;}

        System.out.println("Ordered from smallest to biggest: " + firstOrder + " " + secondtOrder + " " + thirdOrder);

    }

}
