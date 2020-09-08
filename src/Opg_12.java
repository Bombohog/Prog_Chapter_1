/*
 * "Projektet" handler om at få printet et resultat ud.
 *
 * Denne kode er programmeret af:
 * Lasse Jørgensen Kongsdal
 *
 * Programmet printer et resultat af en beregning der sker i selve koden/programmet.
 */

public class Opg_12 {

    public static void main(String[] args) {

        /*
        * Først omregnes mil til kilometer,
        * derfra finder jeg ud af hvor langt der køres på et sekund
        * og derefter finder jeg ud af hvor langt der køres på en time,
        * da 1 time er lig med 3600 sekunder.
        */
        double kmHr = ((24 * 1.6) / ((1*3600) + (40 * 60) + 35))*3600;
        System.out.println(kmHr);

    }

}
