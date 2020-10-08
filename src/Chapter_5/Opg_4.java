/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 30-09-2020
 *
 * Description of program
 ********************************************/

package Chapter_5;

public class Opg_4 {

    public static void main(String[] args) {

        System.out.println("Celcius     Fahrenheit");
        for (int i = 1; i <= 10; i++) {
            if (i < 10) {
                System.out.println(i + "           " + ((double) i * 2.54));
            } else {
                System.out.println(i + "          " + ((double) i * 2.54));
            }
        }

    }

}
