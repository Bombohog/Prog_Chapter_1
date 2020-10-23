/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 16-09-2020
 *
 * Description of program
 ********************************************/

package Chapter_2;

import java.util.Scanner;

public class Opg_21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investAmount = input.nextDouble();

        System.out.print("Enter annual interest rate(%): ");
        double interestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        double years = input.nextDouble();

        double futureValue = investAmount * (Math.pow((1 + interestRate), (years * 12)));

        System.out.println("Future value is: $" + futureValue);


    }

}
