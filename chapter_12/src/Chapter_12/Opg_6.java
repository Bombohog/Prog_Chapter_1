package Chapter_12;

import java.util.Scanner;

/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 22-11-2020
 *
 * Description of program
 ********************************************/

public class Opg_6 {

    public static void main(String[] args) {

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        while (true) {

            // Prompt the user to enter a string
            System.out.print("\n\nEnter a hex number: ");
            String hex = input.nextLine();

            System.out.printf("The decimal value for hex number %s is %s", hex, hexToDecimal(hex.toUpperCase()));

        }

    }

    public static int hexToDecimal(String hex) {

        int decimalValue = 0;

        try {

            for (int i = 0; i < hex.length(); i++) {

                char hexChar = hex.charAt(i);
                if (!(hexChar >= 'A' && hexChar <= 'F' || hexChar >= '0' && hexChar <= '9')) {
                    throw new NumberFormatException();
                }

                decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);

            }

        } catch (NumberFormatException exception) {

            System.out.println("String is not a hexString");

        }

        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {

        if (ch >= 'A' && ch <= 'F') { return 10 + ch - 'A'; }
        else { return ch - '0'; }

    }

}
