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

public class Opg_7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investAmount = input.nextDouble();

        System.out.print("Enter annual interest rate(%): ");
        double interestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        double years = input.nextDouble();

        System.out.printf("\nFuture value is: $%d", FutureValue(investAmount, interestRate, years));

    }

    public static double FutureValue(double investAmount, double interestRate, double years) {

        return investAmount * (Math.pow((1 + interestRate), (years * 12)));

    }

}
