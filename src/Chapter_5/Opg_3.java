/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 30-09-2020
 *
 * Description of program
 ********************************************/

package Chapter_5;

public class Opg_3 {

    public static void main(String[] args) {

        System.out.println("Celcius     Fahrenheit");
        for (int i = 0; i <= 100; i += 2) {
            double x = i;
            if (i < 10) {
                System.out.println(i + "           " + ((x * ((double) 9/5)) + 32));
            } else if (i < 100) {
                System.out.println(i + "          " + ((x * ((double) 9/5)) + 32));
            } else {
                System.out.println(i + "         " + ((x * ((double) 9/5)) + 32));
            }
        }

    }

}
