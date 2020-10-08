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

public class Opg_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter hex digit: ");
        String hexCode = input.next();

        switch (hexCode.toLowerCase()) {
            case "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" -> System.out.printf("\nThe binary value is %s", Integer.toBinaryString(Integer.parseInt(hexCode)));
            case "a", "b", "c", "d", "e", "f" -> {
                switch (hexCode.toLowerCase()) {
                    case "a" -> System.out.printf("\nThe binary value is %s", Integer.toBinaryString(10));
                    case "b" -> System.out.printf("\nThe binary value is %s", Integer.toBinaryString(11));
                    case "c" -> System.out.printf("\nThe binary value is %s", Integer.toBinaryString(12));
                    case "d" -> System.out.printf("\nThe binary value is %s", Integer.toBinaryString(13));
                    case "e" -> System.out.printf("\nThe binary value is %s", Integer.toBinaryString(14));
                    case "f" -> System.out.printf("\nThe binary value is %s", Integer.toBinaryString(15));
                }
            }
            default -> System.out.println(hexCode + " is an invalid input");
        }

    }

}
