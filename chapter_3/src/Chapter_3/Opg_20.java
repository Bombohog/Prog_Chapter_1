/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 22-09-2020
 *
 * Description of program
 ********************************************/

package Chapter_3;

import java.util.*;

public class Opg_20 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature(-58F to 41F): ");
        double temp = input.nextDouble();

        System.out.print("Enter wind speed(2 or greater): ");
        double windSpeed = input.nextDouble();
        double windSpeedPOW = Math.pow(windSpeed, 0.16);

        if (temp < 41 && temp > -58 && windSpeed >= 2) {

            double windChillTemp = 35.74 + (0.6215 * temp) - (35.75 * windSpeedPOW) + ((0.4275 * temp) * windSpeedPOW);
            System.out.println("The wind chill index is: " + windChillTemp);

        } else if ((temp < -58 || temp > 41) && !(windSpeed < 2)) {

            System.out.println("Sorry the temperature is invalid!");

        } else if (windSpeed < 2 && (!(temp < -58) && !(temp > 41))) {

            System.out.println("Sorry the wind speed is invalid!");

        } else {

            System.out.println("Sorry both the temperature and wind speed are invalid inputs!");

        }

    }

}
