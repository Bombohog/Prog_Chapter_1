/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 17-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_9;

import java.util.Random;

public class Opg_4 {

    public static void main(String[] args) {

        Random rand = new Random(1000);

        for (int i = 0; i < 50; i++) {

            System.out.println(rand.nextInt(100));

        }

    }

}
