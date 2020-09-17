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

public class UdregnLaan {

    public static void main(String[] args) {

        // Lav en Scanner
        Scanner input = new Scanner(System.in);

        // Skriv årlige rate
        System.out.print("Skriv årlige rate, fx. 8.25: ");
        double aarligRate = input.nextDouble();

        // Skriv antal år
        System.out.print(
                "Skriv antallet af år i heltal, fx. 5: ");
        int antalAAr = input.nextInt();

        // Skriv beløbet af lånet
        System.out.print("Skriv beløbet af lånet, fx. 120000.95: ");
        double laan = input.nextDouble();

        // Denne kode er erstattet
        /*// Fang månedlige rate
        double maanedligRate = aarligRate / 1200;*/

        // Denne kode er erstattet
        /*// Beregn tilbagebetaling
        double maanedligBetaling = laan * maanedligRate / (1
                - 1 / Math.pow(1 + maanedligRate, antalAAr * 12));
        double totalBetaling = maanedligBetaling * antalAAr * 12;

        // Vis resultatet
        System.out.println("Det månedlige tilbagebetaling er " +
                (int)(maanedligBetaling * 100) / 100.0 + " kr");
        System.out.println("Det totale tilbagebetaling er på " +
                (int)(totalBetaling * 100) / 100.0 + " kr");*/

        // Vis resultatet
        System.out.println("Det månedlige tilbagebetaling er " +
                Betaling(aarligRate, laan, antalAAr)[0] + " kr");
        System.out.println("Det totale tilbagebetaling er på " +
                Betaling(aarligRate, laan, antalAAr)[1] + " kr");

    }

    public static double[] Betaling(double aarligRate, double laan, int antalAAr){

        // Fang månedlige rate
        double maanedligRate = aarligRate / 1200;

        // Beregn tilbagebetaling
        double maanedligBetaling = laan * maanedligRate / (1
                - 1 / Math.pow(1 + maanedligRate, antalAAr * 12));
        double totalBetaling = maanedligBetaling * antalAAr * 12;

        maanedligBetaling = (int)(maanedligBetaling * 100) / 100.0;

        totalBetaling = (int)(totalBetaling * 100) / 100.0;

        double Betaling[] = {maanedligBetaling, totalBetaling};

        return Betaling;
    }

}
