package Chapter_2;

import java.util.Scanner;

public class Opg_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter: Savings: ");
        double savings = input.nextDouble();
        double interest = 3.75;
        double account = 0;

        for (int i = 1; i <= 6; i++) {

            if (i == 1) {

                account = savings * (1 + ((interest / 100) / 12));

            } else {

                account = (savings + account) * (1 +  ((interest / 100) / 12));

            }

            System.out.println("month: " + i + " value in account " + account);

        }

    }

}
