/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 30-09-2020
 *
 * Description of program
 ********************************************/

package Chapter_5;

public class Opg_5 {

    public static void main(String[] args) {

        double fahrenheit = 20;

        System.out.printf("%-10s%-10s%-5s%-10s%-10s", "Celcius", "Fahrenheit", "", "Celcius", "Fahrenheit");
        for (double celcius = 0; celcius <= 100; celcius += 2) {
            fahrenheit += 5;
            System.out.println("");
            System.out.printf("%-10s%-10.3f%-5s%-10s%-10.3f", celcius, ((celcius * ((double) 9 / 5)) + (double) 32), "|", fahrenheit, ((fahrenheit - 32) * 5 / 9));
        }

    }

}
