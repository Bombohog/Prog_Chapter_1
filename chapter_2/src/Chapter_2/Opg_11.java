package Chapter_2;

import java.util.Scanner;

public class Opg_11 {

    public static void main(String[] args) {

        // input af år
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of years: ");
        int years = input.nextInt();

        // dette er start populatioen.
        int currentPopulation = 312032486;
        int iHolder = 0;

        // dette loop løber gennem alle fem år.
        for (int x = 1; x <= years; x++) {
            // dette loop tæller befolkningen op alt efter hvor lang tide der er gået siden starten af året.
            for (int i = 1; i <= (365 * 24 * 60 * 60); i++) {
                // Jeg bruger modulo for at tjekke om der gået 7 sekunder ved at se om der kommer rest hvis i blive divideret med 7
                // og hvis den kan divideres uden rest, så betyder det at der er gået 7 sekunder og et menneske kan adderes.
                if (i % 7 == 0) {
                    currentPopulation += 1;
                }
                if (i % 13 == 0) {
                    currentPopulation -= 1;
                }
                if (i % 45 == 0) {
                    currentPopulation += 1;
                }
            }
            // efter året er gået så udkrives den nuværende befolkning.
            System.out.println("Nuværende befolkning (i år " + x + " efter begyndelses året) = " + currentPopulation);
        }

        // Dette er ikke perfect, men ved sammenligning af hvad Deniz, så afviger den, 0,1,2,2,3 mennesker.

    }

}
