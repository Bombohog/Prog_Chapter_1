/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 02-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_5_Examples;

public class LoopInLoop {

    public static void main(String[] args) {

        System.out.printf("    %4d%4d%4d%4d%4d%4d%4d%4d%4d", 1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("\n---------------------------------------------");

        for (int x = 1; x <= 9; x++) {

            System.out.print(x + " | ");

            for (int y = 1; y <= 9; y++) {

                System.out.printf("%4d", y * x);

            }

            System.out.println();

        }

    }

}
