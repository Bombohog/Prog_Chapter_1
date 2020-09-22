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

public class Opg_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Write three non-decimal numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        NumberOrder(number1, number2, number3);

    }

    public static void NumberOrder(int number1, int number2, int number3) {

        int firstOrder;
        int secondtOrder;
        int thirdOrder;

        // first order
        if (number1 < number2 && number1 < number3) {firstOrder = number1;}
        else if (number2 < number1 && number2 < number3) {firstOrder = number2;}
        else {firstOrder = number3;}

        // second order
        if (number1 < number2 && number1 > number3 || number1 > number2 && number1 < number3) {secondtOrder = number1;}
        else if (number2 < number1 && number2 > number3 || number2 > number1 && number2 < number3) {secondtOrder = number2;}
        else {secondtOrder = number3;}

        // third order
        if (number1 > number2 && number1 > number3) {thirdOrder = number1;}
        else if (number2 > number1 && number2 > number3) {thirdOrder = number2;}
        else {thirdOrder = number3;}

        System.out.println("Ordered from smallest to biggest: " + firstOrder + " " + secondtOrder + " " + thirdOrder);

    }

}
