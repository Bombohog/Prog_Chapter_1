/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 02-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_5_Examples;

public class LoopBreakContinue {

    public static void main(String[] args) {

        int sum = 0;
        int number = 0;

        while (true) {

            number++;

            if (sum >= 100) {

                sum -= number;
                System.out.println("Ved nummer " + number + " er summen " + sum + " efter at number er trukke fra sum");
                continue;

            } else if (sum < 100 && !(sum < 0)) {

                sum += number;
                System.out.println("Ved nummer " + number + " er summen " + sum);

            } else if (sum < 0) {break;}

        }

    }

}
