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

public class Opg_7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double: ");

        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount %= 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of:");
        if (numberOfOneDollars != 0) {System.out.println(" " + numberOfOneDollars + " " + SingleOrPlural("dollars", numberOfOneDollars));}
        if (numberOfQuarters != 0) {System.out.println(" " + numberOfQuarters + " " + SingleOrPlural("quarters", numberOfQuarters));}
        if (numberOfDimes != 0) {System.out.println(" " + numberOfDimes + " " + SingleOrPlural("dimes", numberOfDimes));}
        if (numberOfNickels != 0) {System.out.println(" " + numberOfNickels + " " + SingleOrPlural("nickels", numberOfNickels));}
        if (numberOfPennies != 0) {System.out.println(" " + numberOfPennies + " " + SingleOrPlural("pennies", numberOfPennies));}

    }

    public static String SingleOrPlural(String denomination, int amount) {

        String singleOrPluralString = null;
        
        if (amount > 1) {
            switch (denomination) {
                case "dollars" -> singleOrPluralString = "dollars";
                case "quarters" -> singleOrPluralString = "quarters";
                case "dimes" -> singleOrPluralString = "dimes";
                case "nickels" -> singleOrPluralString = "nickels";
                case "pennies" -> singleOrPluralString = "pennies";
            }
        } else if (amount == 1) {
            switch (denomination) {
                case "dollars" -> singleOrPluralString = "dollar";
                case "quarters" -> singleOrPluralString = "quarter";
                case "dimes" -> singleOrPluralString = "dime";
                case "nickels" -> singleOrPluralString = "nickel";
                case "pennies" -> singleOrPluralString = "penny";
            }
        }
        
        return singleOrPluralString;
    }

}
