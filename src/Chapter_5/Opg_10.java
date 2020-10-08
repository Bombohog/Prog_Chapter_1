/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 01-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_5;

import java.util.ArrayList;
import java.util.List;

public class Opg_10 {

    public static void main(String[] args) {

        List<Integer> divisableNumbers = new ArrayList<>();

        for (int i = 100; i <= 1000; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                divisableNumbers.add(i);
            }
        }

        for (int i = 0; i < divisableNumbers.size(); i++) {
            if (i % 10 == 0) {
                System.out.println();
                System.out.printf("%-4d", divisableNumbers.get(i));
            } else {
                System.out.printf("%-4d", divisableNumbers.get(i));
            }
        }

    }

}
