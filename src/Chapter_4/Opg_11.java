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

public class Opg_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter binary digits (0000 to 1111): ");
        int binaryCode = input.nextInt();

        int num1 = (binaryCode / 1000) * 8;
        int num2 = ((binaryCode / 100) % 10) * 4;
        int num3 = ((binaryCode / 10) % 10) * 2;
        int num4 = (binaryCode % 10) * 1;

        int decNumber = num1 + num2 + num3 + num4;
        System.out.printf("\nThe decmal value is %d", decNumber);

    }

}
