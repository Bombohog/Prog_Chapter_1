/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 08-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_6;

import java.util.Scanner;

public class Opg_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers and numbers per line: ");
        PrintNumbers(input.nextInt(), input.nextInt(), input.nextInt());
        System.out.println("Test");
        PrintNumbers(1, 100, 10);

    }

    public static void PrintNumbers(int num1, int num2, int numberPerLine) {

        int numbersPerLineReached = numberPerLine;
        int[] numberOrder = LowHighestNumber(num1, num2);

        for (int i = numberOrder[0] + 1; i < numberOrder[1]; i++) {

            if (numbersPerLineReached == 0) {

                System.out.print("\n" + i + " ");
                numbersPerLineReached = numberPerLine - 1;

            } else {

                System.out.print(i + " ");
                numbersPerLineReached -= 1;

            }

        }

    }

    public static int[] LowHighestNumber(int num1, int num2) {

        int lowNumber;
        int highNumber;

        if (num1 < num2) {lowNumber = num1; highNumber = num2;}
        else {highNumber = num1; lowNumber = num2;}

        return new int[]{lowNumber, highNumber};
    }

}
