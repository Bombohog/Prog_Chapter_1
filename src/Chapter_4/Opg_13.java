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

public class Opg_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter language (DA or EN): ");
        String lang = input.next();
        System.out.print("Enter letter: ");
        String letter = input.next();

        if (lang.toLowerCase().equals("da")) {

            switch (letter.toLowerCase()) {
                case "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z" -> System.out.println(letter + " is a consonant");
                case "a", "e", "i", "o", "u", "y", "æ", "ø", "å" -> System.out.println(letter + " is a vowel");
                default -> System.out.println(letter + " is an invalid input");
            }

        } else if (lang.toLowerCase().equals("en")) {

            switch (letter.toLowerCase()) {
                case "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z" -> System.out.println(letter + " is a consonant");
                case "a", "e", "i", "o", "u", "y" -> System.out.println(letter + " is a vowel");
                default -> System.out.println(letter + " is an invalid input");
            }

        }
        else {System.out.println("Invalid language");}

    }

}
