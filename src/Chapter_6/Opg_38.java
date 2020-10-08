/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 08-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_6;

public class Opg_38 {

    public static void main(String[] args) {

        System.out.println("Printing 200 random letters and digits");
        PrintLettersNumbers();

    }

    public static void PrintLettersNumbers() {

        int countdown = 200;
        int numbersPerLineReached = 10;

        while (countdown > 0) {

            if (numbersPerLineReached == 0) {

                System.out.print("\n" + GetRandomUpperCaseLetter() + " ");
                numbersPerLineReached = 9;

            } else {

                System.out.print(GetRandomUpperCaseLetter() + " ");
                numbersPerLineReached--;

            }

            countdown--;

        }

        countdown = 200;

        while (countdown > 0) {

            if (numbersPerLineReached == 0) {

                System.out.print("\n" + GetRandomDigitCharacter() + " ");
                numbersPerLineReached = 9;

            } else {

                System.out.print(GetRandomDigitCharacter() + " ");
                numbersPerLineReached--;

            }

            countdown--;

        }

    }

    public static char GetRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char GetRandomUpperCaseLetter() {
        return GetRandomCharacter('A', 'Z');
    }

    public static char GetRandomDigitCharacter() {
        return GetRandomCharacter('0', '9');
    }

}
