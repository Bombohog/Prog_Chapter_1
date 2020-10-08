/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 08-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_6;

public class Opg_6 {

    public static void main(String[] args) {

        System.out.println("Pattern test(n = 5)");
        DisplayPattern(5);

    }

    public static void DisplayPattern(int n) {

        int numbersPerLine = 1;
        int reachedNumber = 0;

        // going up
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (reachedNumber == numbersPerLine) {

                    numbersPerLine++;
                    reachedNumber = 0;
                    System.out.println();
                    break;

                } else {

                    System.out.print(j + " ");
                    reachedNumber++;

                }

            }

        }

        // reset
        reachedNumber = 0;
        numbersPerLine = n ;
        System.out.println();

        // going down
        for (int i = n; i >= 0; i--) {

            for (int j = n; j > 0; j--) {

                if (reachedNumber == numbersPerLine) {

                    numbersPerLine--;
                    reachedNumber = 0;
                    System.out.println();
                    break;

                } else {

                    System.out.print(j + " ");
                    reachedNumber++;

                }

            }

        }

    }

}
