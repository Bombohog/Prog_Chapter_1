/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 16-09-2020
 *
 * Description of program
 ********************************************/

package Exercises_17_09_2020;

import java.util.Scanner;

public class FahrenheitTilCelsius {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Skriv en temperatur i Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Denne kode er erstattet med metoden
        /*// Konverter Fahrenheit til Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " er " +
                celsius + " i Celsius");*/

        Konverter(fahrenheit);

    }

    public static void Konverter(double fahrenheit){

        // Konverter Fahrenheit til Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " er " +
                celsius + " i Celsius");

    }

}
