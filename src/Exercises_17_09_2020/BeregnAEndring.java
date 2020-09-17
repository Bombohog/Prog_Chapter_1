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

public class BeregnAEndring {

    public static void main(String[] args) {

        // Lav en Scanner
        Scanner input = new Scanner(System.in);

        // Hent/få et antal
        System.out.print(
                "Skriv et antal i decimaltal, fx. 11.56: ");
        double antal = input.nextDouble();

        // Denne kode er erstattet
        /*int resterendeAntal = (int)(antal * 100);

        // Find antallet af et dollars
        int antalAfEtDollars = resterendeAntal / 100;
        resterendeAntal = resterendeAntal % 100;

        // Find antallet af quarters i det resterende antal
        int antalAfQuarters = resterendeAntal / 25;
        resterendeAntal = resterendeAntal % 25;

        // Find antallet af dimes i det resterende antal
        int antalAfDimes = resterendeAntal / 10;
        resterendeAntal = resterendeAntal % 10;

        // Find antallet af nickels i det resterende antal
        int antalAfNickels = resterendeAntal / 5;
        resterendeAntal = resterendeAntal % 5;

        // Find antallet af pennies i det resterende antal
        int antalAfPennies = resterendeAntal;

        // Vis resultatet
        System.out.println("Dit antal " + antal + "$ består af");
        System.out.println("    " + antalAfEtDollars + " dollars");
        System.out.println("    " + antalAfQuarters + " quarters");
        System.out.println("    " + antalAfDimes + " dimes");
        System.out.println("    " + antalAfNickels + " nickels");
        System.out.println("    " + antalAfPennies + " pennies");*/

        int valutaer[] = AntalAfValuta(antal);

        // Vis resultatet
        System.out.println("Dit antal " + antal + "$ består af\n" +
                "    " + valutaer[0] + " dollars\n" +
                "    " + valutaer[1] + " quarters\n" +
                "    " + valutaer[2] + " dimes\n" +
                "    " + valutaer[3] + " nickels\n" +
                "    " + valutaer[4] + " pennies");
        // Denne kode er erstattet med "\n" og 'int valutaer[]'
        /*System.out.println("    " + AntalAfValuta(antal)[0] + " dollars");
        System.out.println("    " + AntalAfValuta(antal)[1] + " quarters");
        System.out.println("    " + AntalAfValuta(antal)[2] + " dimes");
        System.out.println("    " + AntalAfValuta(antal)[3] + " nickels");
        System.out.println("    " + AntalAfValuta(antal)[4] + " pennies");*/

    }

    public static int[] AntalAfValuta(double antal){

        int resterendeAntal = (int)(antal * 100);

        // Find antallet af et dollars
        int antalAfEtDollars = resterendeAntal / 100;
        resterendeAntal = resterendeAntal % 100;

        // Find antallet af quarters i det resterende antal
        int antalAfQuarters = resterendeAntal / 25;
        resterendeAntal = resterendeAntal % 25;

        // Find antallet af dimes i det resterende antal
        int antalAfDimes = resterendeAntal / 10;
        resterendeAntal = resterendeAntal % 10;

        // Find antallet af nickels i det resterende antal
        int antalAfNickels = resterendeAntal / 5;
        resterendeAntal = resterendeAntal % 5;

        // Find antallet af pennies i det resterende antal
        int antalAfPennies = resterendeAntal;

        int valuta[] = {antalAfEtDollars, antalAfQuarters, antalAfDimes, antalAfNickels, antalAfPennies};

        return valuta;
    }

}
