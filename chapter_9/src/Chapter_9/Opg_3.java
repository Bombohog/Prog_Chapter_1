/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 17-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_9;

import java.util.Date;

public class Opg_3 {

    public static void main(String[] args) {

        Date date = new Date();
        for (long i = 10000; i <= 100000000000l; i *= 10) {

            date.setTime(i);
            System.out.println(date);

        }

    }

}
