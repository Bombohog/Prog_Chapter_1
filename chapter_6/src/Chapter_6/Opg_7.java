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

        System.out.printf("\nFuture value is: $%.2f", FutureInvestmentValue(investAmount, interestRate, years));
        System.out.println("\n\nThese are the foregoing values:");
        FutureValues(investAmount, interestRate, years);

    }

    public static double FutureInvestmentValue(double investmentAmount, double yearlyInterest, double years) {

        double futureAmount = 0;
        double monthlyInterestRate = (yearlyInterest / 100) / 12;
        for (int i = 1; i <= years; ++i) {
            for (int m = 1; m <= 12 ; ++m){
                futureAmount = investmentAmount + (investmentAmount * monthlyInterestRate);
                investmentAmount = futureAmount;
            }
        }


        return investmentAmount;
    }

    public static void FutureValues(double investAmount, double interestRate, double years) {

        System.out.printf("\n%-12s%11s", "Years", "Future Value\n"); // Table header

        for (int i = 1; i <= years; i++) {

            System.out.printf("%-10d", i);
            System.out.printf("%11.2f\n", FutureInvestmentValue(investAmount, interestRate, i));
            //System.out.printf("\nFuture value of year %d is: $%.2f", i, FutureInvestmentValue(investAmount, interestRate, i)); // old code

        }

    }

}
