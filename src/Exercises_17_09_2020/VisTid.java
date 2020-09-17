/********************************************
 * Dette program har til opgave at kunne vise
 * hvor mange timer, minutter og sekunder der
 * er i et antal sekunder.
 *
 * Created by: Lasse J. Kongsdal
 * Date: 16-09-2020
 *
 * Brugeren kan indtaste et antal sekunder,
 * som så bliver omregnet i timer og minutter
 * der den udskriver timer, minutter og sekunder
 ********************************************/

package Exercises_17_09_2020;

import java.util.Scanner;

public class VisTid {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Prompter brugeren for input
        System.out.print("Skriv et heltal for sekunder: ");
        int sekunder = input.nextInt();

        // Denne kode er erstattet med metoden
        /*int minutter = sekunder / 60; // Finder minuter i sekunder
        int resterendeSekunder = sekunder % 60; // Sekunder tilbage
        System.out.println(sekunder + " sekunder er " + minutter +
                " minutter og " + resterendeSekunder + " sekunder");*/

        Tid(sekunder);

    }

    public static void Tid(int sekunder){

        int minutter = sekunder / 60; // Finder minuter i sekunder
        int resterendeSekunder = sekunder % 60; // Sekunder tilbage
        System.out.println(sekunder + " sekunder er " + minutter +
                " minutter og " + resterendeSekunder + " sekunder");

    }

}
