package Chapter_2;

import java.util.Scanner;

public class Opg_17 {

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

        } else {

            System.out.println("Something went wrong try again!");

        }

    }

}
