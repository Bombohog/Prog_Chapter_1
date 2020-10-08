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

public class Opg_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        TestMethod();

        while (true) {

            System.out.print("\nEnter an integer number: ");
            System.out.printf("\nThe number is %d", SumDigits(input.nextLong()));

        }


    }

    public static int SumDigits(long num) {

        int numLength = String.valueOf(num).length();
        int resultat = 0;

        for (int i = 0; i < numLength; i++) {

            resultat += num % 10;
            num /= 10;

        }

        if (resultat < 0) {resultat *= -1;}

        return resultat;
    }

    public static void TestMethod() {
        System.out.printf("\n234 skal give 9, og det giver %d", SumDigits(234));
        System.out.printf("\n10000 skal give 1, og det giver %d", SumDigits(10000));
        System.out.printf("\n-234 skal give 9, og det giver %d", SumDigits(-234));
    }

}
