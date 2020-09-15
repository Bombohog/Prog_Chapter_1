package Chapter_1;/*
 * "Projektet" handler om at få printet en tabel af tal.
 *
 * Denne kode er programmeret af:
 * Lasse Jørgensen Kongsdal
 *
 * Programmet printer en tabel med forskellige tal alt efter om de er bleve ganget med sig selv et antal gange.
 */

public class Opg_4 {

    public static void main(String[] args) {

        // Erklæerer en table som en string og laver en limitation af 5 strenge.
        String[][] table = new String[5][];
        table[0] = new String[] {"a","a^2","a^3","a^4"};
        table[1] = new String[] {"1","1","1","1"};
        table[2] = new String[] {"2","4","8","16"};
        table[3] = new String[] {"3","9","27","81"};
        table[4] = new String[] {"4","16","64","256"};
        // Ved brug af for loop og og det indbygget funktion row så bliver tabelen indsat i rækker.
        for (String[] row : table) {
            System.out.format("%15s%15s%15s%15s\n", row);
        }

    }

}
